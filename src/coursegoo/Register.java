/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursegoo;

import java.awt.Color;
import java.awt.Component;
import java.awt.TextField;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Node;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Bronj
 */
public class Register extends javax.swing.JFrame {
    
    /**
     * Creates new form CourseGo
     */
    public Register() {
        initComponents();
    }
    
    //Globals are bad.. but these exist nonetheless
    private static int xMouse, yMouse; //If not static, the values of these variables reset upon each new update to 0,0
    
    private final settingsCalls settings = new settingsCalls();    
    private final sideOperations sideOp = new sideOperations();
    
    private int attempts = 0;    
    
    //setters
    public void setAttempts(int a)
    {        
        attempts = a;
    }
    public void setxMouse(int xM)
    {        
        xMouse = xM;
    }
    public void setyMouse(int yM)
    {        
        yMouse = yM;
    }
    
    //getters    
    public int getAttempts()
    {        
        return attempts;
    }
    public int getxMouse()
    {        
        return xMouse;
    }
    public int getyMouse()
    {        
        return yMouse;
    }
    
    public String getPFName()
    {        
        return pFName.getText();
    }
    public String getPLName()
    {        
        return pLName.getText();
    }
    public String getCFName()
    {        
        return cFName.getText();
    }
    public String getCLName()
    {        
        return cLName.getText();
    }
    public String getUsername()
    {        
        return username.getText();
    }
    public char[] getPassword()
    {        
        return password.getPassword();
    }
    public char[] getCPassword()
    {        
        return cPassword.getPassword();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        pFName = new javax.swing.JTextField();
        pLName = new javax.swing.JTextField();
        cFName = new javax.swing.JTextField();
        cLName = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        cPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        loginLink = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        windowBar = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("login");
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(300, 500));
        setName("login"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        container.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 1, true));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        pFName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pFNameCaretUpdate(evt);
            }
        });

        pLName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pLNameCaretUpdate(evt);
            }
        });

        cFName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cFNameCaretUpdate(evt);
            }
        });

        cLName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                cLNameCaretUpdate(evt);
            }
        });

        username.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                usernameCaretUpdate(evt);
            }
        });

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        cPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cPasswordKeyPressed(evt);
            }
        });

        jLabel1.setText("Parent");

        jLabel2.setText("Child");

        jLabel3.setText("Login Information");

        jLabel4.setText("First Name: ");

        jLabel5.setText("Last Name:");

        jLabel6.setText("First Name:");

        jLabel7.setText("Last Name:");

        jLabel8.setText("Username:");

        jLabel9.setText("Password:");

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        loginLink.setForeground(new java.awt.Color(153, 0, 153));
        loginLink.setText("Already have an account? Login here!");
        loginLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLinkMouseClicked(evt);
            }
        });

        jLabel10.setText("Confirm Password:");

        windowBar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        windowBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                windowBarMouseDragged(evt);
            }
        });
        windowBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                windowBarMousePressed(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout windowBarLayout = new javax.swing.GroupLayout(windowBar);
        windowBar.setLayout(windowBarLayout);
        windowBarLayout.setHorizontalGroup(
            windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, windowBarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        windowBarLayout.setVerticalGroup(
            windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(windowBarLayout.createSequentialGroup()
                .addGroup(windowBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(cLName)
                            .addComponent(cFName)
                            .addComponent(pLName)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cPassword)
                            .addComponent(pFName))
                        .addGap(175, 175, 175))))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addComponent(loginLink, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(0, 218, Short.MAX_VALUE))
            .addComponent(windowBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(windowBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logo)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(19, 19, 19)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(loginLink, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pFName.getAccessibleContext().setAccessibleName("pfn");
        pLName.getAccessibleContext().setAccessibleName("pln");
        cFName.getAccessibleContext().setAccessibleName("cfn");
        cLName.getAccessibleContext().setAccessibleName("cln");
        username.getAccessibleContext().setAccessibleName("username");
        password.getAccessibleContext().setAccessibleName("password");
        cPassword.getAccessibleContext().setAccessibleName("cpassword");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleName("loginContainer");
        getAccessibleContext().setAccessibleParent(this);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        //instances needed
        files files = new files();
        encrypt enc = new encrypt();
        
        int i = 0;
        int vPfn = 0, vPln = 0, vCfn = 0, vCln = 0, vK = 0, vU = 0, vP = 0;
        
        String emptyFields;
        
        //Get information from register fields
        String pfn = pFName.getText();
        String pln = pLName.getText();
        String cfn = cFName.getText();
        String cln = cLName.getText();

        String k = sideOp.getAlphaNumericString(8); //random key generated for encryption 

        //encrypt information
        String u = username.getText();
        String p = enc.encrypt(new String(password.getPassword()), k);

        //Validation of fields - need to know which fields are valid still
        if (pfn.isEmpty())
            vPfn = 0;
        if (pln.isEmpty())
            vPln = 0;
        if (cfn.isEmpty())
            vCfn = 0;
        if (cln.isEmpty())    
            vCln = 0;
        if (k.isEmpty())
            vK = 0;
        if (u.isEmpty())
            vU = 0;
        if (password.getPassword().length == 0)
            vP = 0;

        //Empty popup 
        emptyFields = "The following fields cannot be empty: ";

        if (pfn.isEmpty())
        {    
            emptyFields += "\nParent First Name";
            pFName.setBackground(new Color(255, 186, 186));
        }
        if (pln.isEmpty())
        {
            emptyFields += "\nParent Last Name";
            pLName.setBackground(new Color(255, 186, 186));
        }
        if (cfn.isEmpty())
        {
            emptyFields += "\nChild First Name";
            cFName.setBackground(new Color(255, 186, 186));
        }
        if (cln.isEmpty())    
        {
            emptyFields += "\nChild Last Name";
            cLName.setBackground(new Color(255, 186, 186));
        }
        if (k.isEmpty())
            emptyFields += "\nKey not provided";
        if (u.isEmpty())
        {
            emptyFields += "\nUsername";
            username.setBackground(new Color(255, 186, 186));
        }
        if (password.getPassword().length == 0)
        {
            emptyFields += "\nPassword";
            password.setBackground(new Color(255, 186, 186));
            cPassword.setBackground(new Color(255, 186, 186));
        }

        sideOp.popUp(emptyFields);

        if ((vU == 1) && (vP == 1))
        {
            //Get date, host, OS and login attempts
            String time  =   sideOp.getDate();
            String host  =   sideOp.getDevice();
            String os    =   sideOp.getOs();

            String atmps =   Integer.toString(getAttempts());

            //Save to file
            try
            {
                files.registerJson(pfn, pln, cfn, cln, u, p, k, time, host, os);
            } 
            catch (IOException ex)
            {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Could not access database!");
            }
        }
        
        
    }//GEN-LAST:event_registerActionPerformed

    private void loginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLinkMouseClicked
        //OPEN Register page
        Login lgn = new Login();
        lgn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginLinkMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void windowBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMouseDragged
        //Was unable to move window. Must discover how to pass current instance via function possibly?
        //Hard coding into this function

        //settings.mouseDragged(evt, xMouse, yMouse);
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - getxMouse(), y - getyMouse());
    }//GEN-LAST:event_windowBarMouseDragged

    private void windowBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_windowBarMousePressed
        //get and split string version of x and y values, and convert to int
        //Info then logged in xMouse and yMouse back in this scope.
        settings.itemClick(evt);

        //information on mouse locations logged for drag function
        windowBarMouseDragged(evt);
    }//GEN-LAST:event_windowBarMousePressed

    private void pFNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pFNameCaretUpdate
        pFName.setBackground(new Color(255, 255, 255)); 
    }//GEN-LAST:event_pFNameCaretUpdate

    private void pLNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pLNameCaretUpdate
        pLName.setBackground(new Color(255, 255, 255)); 
    }//GEN-LAST:event_pLNameCaretUpdate

    private void cFNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cFNameCaretUpdate
        cFName.setBackground(new Color(255, 255, 255)); 
    }//GEN-LAST:event_cFNameCaretUpdate

    private void cLNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_cLNameCaretUpdate
        cLName.setBackground(new Color(255, 255, 255)); 
    }//GEN-LAST:event_cLNameCaretUpdate

    private void usernameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_usernameCaretUpdate
        username.setBackground(new Color(255, 255, 255)); 
    }//GEN-LAST:event_usernameCaretUpdate

    private void cPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cPasswordKeyPressed
        if (!Arrays.equals(password.getPassword(), cPassword.getPassword()))
        {
            cPassword.setBackground(new Color(255, 186, 186)); 
        }
        else
        {
            cPassword.setBackground(new Color(255, 255, 255)); 
        }
    }//GEN-LAST:event_cPasswordKeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        if (!Arrays.equals(password.getPassword(), cPassword.getPassword()))
        {
            cPassword.setBackground(new Color(255, 186, 186)); 
        }
        else
        {
            cPassword.setBackground(new Color(255, 255, 255)); 
        }
    }//GEN-LAST:event_passwordKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cFName;
    private javax.swing.JTextField cLName;
    private javax.swing.JPasswordField cPassword;
    private javax.swing.JLabel close;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel loginLink;
    protected javax.swing.JLabel logo;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField pFName;
    private javax.swing.JTextField pLName;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JTextField username;
    private javax.swing.JPanel windowBar;
    // End of variables declaration//GEN-END:variables
}
