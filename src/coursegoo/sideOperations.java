/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursegoo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Bronj
 */
public class sideOperations {
    //convert to integer
    int toInt(String theString)
    {
        int theInt = Integer.parseInt(theString);
        return theInt;
    } 
    String splitJson(String str, int part)
    {
        String[] parts = str.split(": ");
        String part1 = parts[0]; // 004
        String part2 = parts[1]; // 034556
        
        if(part == 1)
            return part1;
        else if (part == 2)
            return part2;
        
        return null;
    }
    // function to generate a random string of length n 
    String getAlphaNumericString(int n) 
    { 
  
        //random character chosen from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) 
        { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index = (int)(AlphaNumericString
                                        .length() * Math.random());             
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString
                        .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
    
    String getDate() 
    {         
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        return dtf.format(now);
    }
    
    String getDevice()
    {
        String hostname = "";
        try
        {
            InetAddress addr;
            addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Hostname can not be resolved");
        }
        
        return hostname;
    }
    
    String getOs()
    {
        return System.getProperty("os.name");
    }
        
    void popUp(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
    }
}
