/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;


/**
 *This class checks the strength of the password entered by the user and updates it when all requirements are met
 * @author jojo
 * @version 1.0
 * @since 2025-05-23
 */
public class ChangePassword extends javax.swing.JFrame {
    
    /**
     * This is a method that checks the strength of the password by checking if it had met requirements
     * @param password This parameter is the password entered by the user
     * @return It returns a Boolean after it has checked for requirements
     */
    public static boolean checkPasswordStrength(String password) {
        if (password.length() < 6) return false; //checks if password is less than 6 characters

        boolean hasLetter = false; //intializes variable indicating that password has a letter to false
        boolean hasDigit = false; //intializes variable indicating that password has a digit to false
        boolean hasSpecial = false; //intializes variable indicating that password has a special character to false

        //loop through each character in password
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) { //if a character in the password is a letter
                hasLetter = true; //sets variable to show password has a letter
            } else if (Character.isDigit(c)) { //if a character in the password is a digit
                hasDigit = true; //sets variable to show password has a digit
            } else if ("!@#$%".indexOf(c) >= 0) { //if a character in the password is a special character
                hasSpecial = true; //sets variable to show password has a special character
            } //ends if
        } //ends for loop

        return hasLetter && hasDigit && hasSpecial; //returns boolean variables for password requirements
    }
    
    
    /**
     * Creates new form Password
     */
    public ChangePassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        currentpassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        newpassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        confirmnewpassword = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        errorMessage2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel1.setText("Change Password");

        jLabel2.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        jLabel2.setText("Current Password:");

        currentpassword.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        currentpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentpasswordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        jLabel3.setText("New Password:");

        newpassword.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        newpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpasswordActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        jLabel4.setText("Re-type New");

        confirmnewpassword.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        confirmnewpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmnewpasswordActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Your password must be at least 6 characters and should include a");

        jLabel7.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("combination of numbers, letters, and special characters (!@#$%)");

        jLabel8.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        jLabel8.setText("Password:");

        submitButton.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        errorMessage.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(153, 0, 0));

        errorMessage2.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        errorMessage2.setForeground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(submitButton)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(currentpassword)
                                    .addComponent(newpassword)
                                    .addComponent(confirmnewpassword)))
                            .addComponent(errorMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(errorMessage2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(currentpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(newpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(confirmnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(errorMessage)
                .addGap(4, 4, 4)
                .addComponent(errorMessage2)
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void currentpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentpasswordActionPerformed

    }//GEN-LAST:event_currentpasswordActionPerformed

    private void newpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpasswordActionPerformed
        
    }//GEN-LAST:event_newpasswordActionPerformed

    private void confirmnewpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmnewpasswordActionPerformed
        
    }//GEN-LAST:event_confirmnewpasswordActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        errorMessage2.setText(""); //clear second line of error message
        String password = HomeScreen.currentUser.getPassword(); //gets user's current password
        String current = currentpassword.getText(); //gets password entered by user
        String newPassText = newpassword.getText(); //gets new password entered by user
        String confirmPassText = confirmnewpassword.getText(); //gets confirmed new password entered by user
        
        //checks if password entered by the user is not the same as the user's current password
        if (!current.equals(password)) {
            errorMessage.setText("Current password is incorrect"); //displays error message
            return; //exits method
        } //ends if

        //checks if new password is not equal to the confirmed new password
        if (!newPassText.equals(confirmPassText)) {
            errorMessage.setText("New passwords do not match."); //displays error message
            return; //exits method
        } //ends if

        //checks if password strength does not pass password strength test
        if (!checkPasswordStrength(newPassText)) {
            errorMessage.setText("Password must include letters, numbers, and special characters");
            errorMessage2.setText("(!@#$%) and be at least 6 characters.");
            return; //exits method
        } //ends if

        //gets arraylist of user's previous password
        ArrayList<String> previousPasswords = HomeScreen.currentUser.getPreviousPasswords();
        //loops through arraylist of user's previous passwords
        for (String oldPass : previousPasswords) { 
            //checks if any of the old passwords is the same as the new password
            if (oldPass.equals(newPassText)) {
                errorMessage.setText("Password should be different from previous passwords."); //displays error message
                return; //exits method
            } //ends if
        } //ends for

        //user's new password has passed all of the error checks
        HomeScreen.currentUser.setPassword(newPassText); //set new password as user's current password
        HomeScreen.currentUser.addNewPassword(newPassText); //add new password to user's arraylist of previous passwords
        
        //Rewrite current user's login information in flat file of all instantiated accounts' usernames/passwords
        try {    
            //Create path object in order to do file operations with the flat file of account usernames/passwords
            Path path = Paths.get("accounts.txt");

            // Read all lines from the file and store in array list
            List<String> lines = Files.readAllLines(path);

            //Create new line in CSV format with the user's existing username and the new password
            String newLine = HomeScreen.currentUser.getUsername() + "," + newPassText;
            //Replace line containing username/password of current account who's password is being changed
            lines.set(HomeScreen.currentUser.getAccountIndex(), newLine); //Rewrite with same username but with new password

            // Write the updated array list with new line back to the flat file of user account information
            Files.write(path, lines);
        //Check for IO errors
        } catch (IOException e) {
            System.err.println(e); //Print error message
        } //End try-catch for rewriting user's login information in flat file
        
        //Return to home screen after user finishes changing password
        new HomeScreen().setVisible(true); //Show home screen frame
        this.setVisible(false); //Hide current frame (change password)
    }//GEN-LAST:event_submitButtonActionPerformed
            
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirmnewpassword;
    private javax.swing.JTextField currentpassword;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel errorMessage2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField newpassword;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
