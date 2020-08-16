package coursegoo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

class files {
    boolean loginJson(String username, String password, String secret, String time, String host, String os, String attempts) throws IOException
    {        
        int incrementer = 0; 
        JSONObject obj;
        sideOperations sideOp = new sideOperations();
        encrypt enc = new encrypt();
        
        // The name of the file to open.
        String fileName = "src/coursegoo/json.json";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                incrementer++;
                
                obj = (JSONObject) new JSONParser().parse(line);      
                
                JSONObject jsonObj = (JSONObject) obj;
                //System.out.println("User :"+jsonObj.toJSONString());
               
                JSONObject user = (JSONObject)jsonObj.get(Integer.toString(incrementer)); 
                //System.out.println(incrementer + " :"+user.toJSONString());                
                
                //Getting important Information
                JSONArray login = (JSONArray)user.get("Login");
                //System.out.println("Login :" + login.toJSONString());
                
                String usrname = (String)login.get(0);
                usrname = sideOp.splitJson(usrname.trim(), 2);
                //System.out.println("Username:" + usrname );
                
                String pswd = (String)login.get(1);
                pswd = sideOp.splitJson(pswd.trim(), 2);
                //System.out.println("Password:" + pswd);
                
                //Crucial in decryption
                String key = (String)login.get(2);
                key = sideOp.splitJson(key.trim(), 2);
                //System.out.println("Key:" + key);
                
                if (usrname.equals(username)) //Found a matching Username
                {
                    if (enc.decrypt(password, secret).equals(enc.decrypt(pswd, key)))//Decrypt password for context matching
                    {
                        //Log the information into a text file of all the login attempts etc.
                        
                        File theFile = new File("log.txt");

                        if(theFile.exists() && !theFile.isDirectory()) 
                        { 
                            try (FileWriter fr = new FileWriter(theFile, true)) 
                            {
                                fr.write("\n" + time + ": " + username + " logged in from device '" + host + "' via " + os +". [" + attempts + "] attempts made.");
                                fr.close();
                            } 
                        }else {
                            //Slight alterations to be made if this is the beginning of the file
                            try (FileWriter fr = new FileWriter(theFile, true)) 
                            {
                                fr.write(time + ": " + username + " logged in. [" + attempts + "] attempts made.");
                                fr.close();
                            } 
                        }
                        
                        //Show that it was successful
                        sideOp.popUp("Success!");
                        
                        return true; // Tell client that login was successful
                    }else
                    {
                        sideOp.popUp("Incorrect Password!");
                        
                        return false; // Tell client that login was not successful
                    }                    
                }else
                {
                    //continue searching
                }               
            }
            //Show that no username was found and reset attempts
            sideOp.popUp("This user does not exist!");
            
            // Always close files.
            bufferedReader.close();
            
            return false;
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");  
            return false;
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");   
            return false;
        } catch (ParseException e) {
            return false;
        }        
    }
    String lastJsonId () throws FileNotFoundException, IOException
    {
        int numUsers = 0;
        boolean error = false;
        
        ArrayList<JSONObject> json = new ArrayList<>();
        JSONObject obj;
        
        // The name of the file to open.
        String fileName = "src/coursegoo/json.json";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                obj = (JSONObject) new JSONParser().parse(line);
                json.add(obj);
                                
                JSONObject jsonObj = (JSONObject) obj;
                
                JSONObject user = (JSONObject)jsonObj.get("1");
                
                numUsers++;
            }
            // Always close files.
            bufferedReader.close();    
            
            //Return count of Objects
            return Integer.toString(numUsers);
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block

        }
        return "";
    }
    void registerJson(String pfn, String pln, String cfn, String cln, String username, String password, String key, String time, String host, String os) throws IOException{
        JSONObject user = new JSONObject();
        JSONObject obj = new JSONObject();
        
        JSONArray parent = new JSONArray();
        parent.add("First Name: " + pfn + "");
        parent.add("Last Name: " + pln + "");
        obj.put("Parent", parent);
        
        
        JSONArray child = new JSONArray();
        child.add("First Name: " + cfn + "");
        child.add("Last Name: " + cln + "");
        obj.put("Child", child);
        
        JSONArray login = new JSONArray();
        login.add("Username: " + username + "");
        login.add("Password: " + password + "");
        login.add("Key: " + key + "");
        obj.put("Login", login);
        
        
        //increment on last json id
        int temp = Integer.valueOf(lastJsonId());
        temp++;
        String newId = Integer.toString(temp);
        
        user.put(newId, obj);
        
        File theFile = new File("src/coursegoo/json.json");
        
        // try-with-resources statement based on post comment below :)
        if(theFile.exists() && !theFile.isDirectory()) { 
            try (FileWriter fr = new FileWriter(theFile, true)) 
            {                
                fr.write("\n" + user.toJSONString());
                
                System.out.println("Successfully Copied JSON Object to File...");
                System.out.println("\nJSON Object: " + user);
                
                fr.close();
            } 
        }else {
            //Slight alterations to be made if this is the beginning of the file
            try (FileWriter fr = new FileWriter(theFile, true)) {
                fr.write(user.toJSONString());
                
                System.out.println("Successfully Copied JSON Object to File...");
                System.out.println("\nJSON Object: " + user);
                
                fr.close();
            } 
        }         
        
    }
}