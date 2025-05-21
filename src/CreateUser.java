import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 343330528
 */
public class CreateUser extends javax.swing.JFrame {
    //Global variables
    public static ArrayList<User> accounts = new ArrayList<User>(); //Array list for all the user accounts that are created
    //public static String[] accounts2;
    
    //Define methods
    
    /**
     * This method checks if the user has entered values for all the mandatory fields - username, password, and email
     * 
     * @param username  User input in the username text field
     * @param password  User input in the password text field
     * @param email     User input in the email text field
     * @return          This returns true if the entered username, password, and email are valid
     */
    public boolean checkMandatory(String username, String password, String email) {
        //Set intial value variable indicating valid input to true before error checks are done
        boolean validInput = true;
        
        //Check error: any of the username, password, or email text fields are left empty
        if(username.isEmpty() || password.isEmpty() || email.isEmpty())
            validInput = false; //Set variable indicating valid input to false
        
        //Return variable indicating whether the entered date of birth is valid
        return validInput;
    }
    
    
    /**
     * This method checks if the email entered by the user in the corresponding text field is in the right format.
     * 
     * @param email  Email entered by the user in the email text field
     * @return       This returns true if the entered email is in the right format (person@mail.com)
     */
    public boolean checkEmail(String email) {
        //Set intial value variable indicating valid input to true before error checks are done
        boolean validInput = true;
        
        //Create pattern of valid email format
        Pattern pattern = Pattern.compile("[a-zA-Z.]+@[a-zA-Z].(com||ca)");
        //Compare regex pattern with email entered by the user in the email text field
        Matcher matcher = pattern.matcher(email);
        //Check if pattern does not match user input (email)
        boolean matchFound = matcher.find();
        //Check error: invalid email format, not a@b.com or a@b.ca
        if(!matchFound) 
            validInput = false; //Set variable indicating valid input to false
        
        //Return variable indicating whether the entered date of birth is valid
        return validInput;    
    }
    
    
    /**
     * This method checks if the month, day and year entered by the user in their respective text fields make up a valid 
     * birthday.
     * 
     * @param monthString  Month of birthday entered by the user in the month text field
     * @param dayString    Day of birthday entered by the user in the day text field
     * @param yearString   Year of birthday entered by the user in the year text field
     * @return             This returns true if the entered month, day, and year make a valid birthday
     */
    public boolean checkDOB(String monthString, String dayString, String yearString) {
        //Set intial value variable indicating valid input to true before error checks are done
        boolean validInput = true;
        
        //Check error: fields for day, month, and year must either be all filled or all empty
        if (!(monthString.isEmpty() && dayString.isEmpty() && yearString.isEmpty()) && !(!monthString.isEmpty() && !dayString.isEmpty() && !yearString.isEmpty())){
            validInput = false; //Set variable indicating valid input to false
        //Continue with birthday input error checks if all fields for day, month, and year are filled
        } else if (!monthString.isEmpty() && !dayString.isEmpty() && !yearString.isEmpty()) {
            //Try-catch to check if month, day, or year values entered by the user could are all integers
            try {
                //Convert value entered by user for the birth month into an integer
                int month = Integer.parseInt(monthString);
                //Convert value entered by user for the birth date into an integer
                int day = Integer.parseInt(dayString);
                //Convert value entered by user for the birth year into an integer
                int year = Integer.parseInt(yearString);

                //Check error: month number is not between 1 and 12
                if (month < 1 || month > 12)
                    validInput = false; //Set variable indicating valid input to false
                //Check error: day is less than 1
                if (day < 1)
                    validInput = false; //Set variable indicating valid input to false
                //Check error: more than 31 days in January, March, may, July, August, October, pr December
                if (day > 31 && (month ==  1 || month ==  3 || month ==  5 || month ==  7 || month ==  8 || month ==  10 || month ==  12)) {
                    validInput = false; //Set variable indicating valid input to false
                //Check error: more than 30 days in April, June, September, or November
                } else if (day > 30 && (month ==  4 || month ==  6 || month ==  9 || month ==  11)) {
                    validInput = false; //Set variable indicating valid input to false
                //Check error: more than 28 days in February
                } else if (day > 28 && month == 2) {
                    validInput = false; //Set variable indicating valid input to false
                } //End if-else statement for valid day depending on the month
                //Check error: user age is not between 13 and 100
                if (year < 1925 || year > 2012)
                    validInput = false; //Set variable indicating valid input to false

            //Catch errors when converting string into numeric type
            } catch (NumberFormatException e){
                //Check error: entered date of birth values are not integers
                validInput = false; //Set variable indicating valid input to false
            } //End try-catch statement

        } //End if-statement checking for either all fileld day, month, year filled by the user or all left empty
        //Return variable indicating whether the entered date of birth is valid
        return validInput;
    }
    
    
    /**
     * This method checks if the phone number entered by the user in the corresponding text field is in the right format.
     * 
     * @param phoneNumber  Phone number entered by the user in the phone number text field
     * @return             This returns true if the entered phone number is in the right format (xxx-xxx-xxxx)
     */
    public boolean checkPhoneNumber(String phoneNumber) {
        //Set intial value variable indicating valid input to true before error checks are done
        boolean validInput = true;
        
        //Create pattern of valid phone number format
        Pattern pattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        //Compare regex pattern with phone number entered by the user in the corresponding text field
        Matcher matcher = pattern.matcher(phoneNumber);
        //Check if pattern does not match user input (invalid phone number)
        boolean matchFound = matcher.find();
        //Check error: invalid phone number format, not xxx-xxx-xxxx
        if(!matchFound) 
            validInput = false; //Set variable indicating valid input to false
        
        //Return variable indicating whether the entered date of birth is valid
        return validInput;
    }
        
                

    /**
     * Creates new form CreateUser
     */
    public CreateUser() {
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

        createUserLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        passwordInput = new javax.swing.JTextField();
        emailInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dayInput = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        monthInput = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        yearInput = new javax.swing.JTextField();
        phoneNumberInput = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        mandatoryError = new javax.swing.JLabel();
        emailError = new javax.swing.JLabel();
        birthdayError = new javax.swing.JLabel();
        phoneNumberError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createUserLabel.setText("Create User");

        jLabel1.setText("Mandatory");

        jLabel2.setText("Privacy Settings Simulator");

        jLabel3.setText("Optional");

        jLabel4.setText("Username:");

        jLabel5.setText("Password:");

        jLabel6.setText("Email (person@mail.com):");

        jLabel7.setText("Birthday -");

        jLabel8.setText("Phone Number (xxx-xxx-xxxx):");

        passwordInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordInputActionPerformed(evt);
            }
        });

        jLabel9.setText("Day:");

        jLabel10.setText("Month:");

        jLabel11.setText("Year:");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        mandatoryError.setText("mandatoryerror");

        emailError.setText("emailError");

        birthdayError.setText("birthdayerror");

        phoneNumberError.setText("phonenumbererror");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthdayError)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(phoneNumberInput))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(monthInput, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(dayInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(phoneNumberError)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(mandatoryError))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailError, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordInput)
                                .addComponent(usernameInput, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(createUserLabel))
                            .addComponent(jLabel2))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(usernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(emailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mandatoryError)
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(dayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(monthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(yearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(birthdayError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(phoneNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumberError)
                .addGap(23, 23, 23)
                .addComponent(submitButton)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        //Clear all error labels in case the user has previously entered invalid information
        mandatoryError.setText(""); //Clear error for blank mandatory information
        emailError.setText(""); //Clear error for invalid email format
        birthdayError.setText(""); //Clear error for invalid birthday
        phoneNumberError.setText(""); //Clear error for invalid phone number format

        //Get all user information entered by the user in the corresponding text fields, remove all whitespace
        String username = usernameInput.getText().trim(); //Get username entered by user
        String stringPassword = passwordInput.getText().trim(); //Get password entered by user (used to instantiate Password object later)
        String email = emailInput.getText().trim(); //Get email entered by user
        String monthString = monthInput.getText().trim(); //Get user's month of birth (converted to int after error check)
        String dayString = dayInput.getText().trim(); //Get user's day of birth (converted to int after error check)
        String yearString = yearInput.getText().trim(); //Get user's year of birth (converted to int after error check)
        String phoneNumber = phoneNumberInput.getText().trim(); //Get phone number entered by user
        
        //Create new User object if all information entered by the user are valid inputs and will not cause any errors
        if (checkMandatory(username, stringPassword, email) && checkEmail(email) && checkDOB(monthString, dayString, yearString) && checkPhoneNumber(phoneNumber)) {
            //Instantiate new password object (has-a relationship with User object)
            Password password = new Password(stringPassword);
            
            
            //Initialize new user object that will be instantiated
            User user = null;
            
            //If both birthday and phone number are left empty, call constructor without birthday and phone number parameters
            if (monthString.isEmpty() && dayString.isEmpty() && yearString.isEmpty() && phoneNumber.isEmpty()) {
                user = new User(username, password, email); //Create new instance of User class without birthday or phone number
            //If both birthday and phone number are filled in, call constructor with both birthday and phone number parameters
            } else if (!monthString.isEmpty() && !dayString.isEmpty() && !yearString.isEmpty() && !phoneNumber.isEmpty()) {
                int month = Integer.parseInt(monthString); //Convert user's birth month into an integer for the Date constructor
                int day = Integer.parseInt(dayString); //Convert user's birth day into an integer for the Date constructor
                int year = Integer.parseInt(yearString); //Convert user's birth year into an integer for the Date constructor
                Date birthday = new Date(month, day, year); //Create new instance of Date class for the user's birthday
                user = new User(username, password, email, birthday, phoneNumber); //Create new instance of User class with birthday and phone number
            //If a phone number has been entered but no birthday, call constructor without birthday parameter
            } else if (monthString.isEmpty() && dayString.isEmpty() && yearString.isEmpty()) {
                user = new User(username, password, phoneNumber); //Create new isntance of user class with phone number
            //If a birthday has been entered but no phone number, call constructor without phone number parameter
            } else if (phoneNumber.isEmpty()) {
                int month = Integer.parseInt(monthString); //Convert user's birth month into an integer for the Date constructor
                int day = Integer.parseInt(dayString); //Convert user's birth day into an integer for the Date constructor
                int year = Integer.parseInt(yearString); //Convert user's birth year into an integer for the Date constructor
                Date birthday = new Date(month, day, year); //Create new instance of Date class for the user's birthday
                user = new User(username, password, email, birthday); //Create new instance of User class with birthday
            } //End if statement checking which User constructor to call based on inputs
            
            //Add new user to array list of user accounts
            accounts.add(user);
            
            
            //Add new account information to flat-file of accounts
            try {
                //Create FileWriter object to append to the file of accounts, named "accounts.txt"
                FileWriter writer = new FileWriter("accounts.txt", true);
                //Write username and password of the new account onto the file
                writer.write(username + "," + password);
                //Close FileWriter
                writer.close();
            //Catch IO exceptions when writing to flat file
            } catch (IOException e) {
                System.err.println(e); //Error message for IO exceptions
            } //End try-catch statement for writing to file
            
            //Return to login screen after user finishes creating a user
            new Login().setVisible(true); //Show login screen frame
            this.setVisible(false); //Hide current frame (create user)
        
        //If there is any invalid input, check exactly which input(s) are invalid and display the appropriate error messages
        } else {
            //Check if not all of the mandatory information was entered
            if (!checkMandatory(username, stringPassword, email))
                mandatoryError.setText("Not all mandatory fields have been filled."); //Display error message
            //Check if the entered email is not in the proper format
            if (!checkEmail(email))
                emailError.setText("Invalid email format."); //Display error message
            //Check if entered birthday is not valid (not integers, date does not exist, not within age limit)
            if (!checkDOB(monthString, dayString, yearString))
                birthdayError.setText("Invalid birthday. Note: Age limit is 13 - 100"); //Display error message
            //Check if the entered phone number is not in the proper format
            if(!checkPhoneNumber(phoneNumber))
                phoneNumberError.setText("Invalid phone number."); //Display error message
        } //End if statement checking if all information entered by the user is valid
    }//GEN-LAST:event_submitButtonActionPerformed

    private void passwordInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordInputActionPerformed
        Password newPass = new Password(passwordInput.getText());
        if (!newPass.checkPasswordStrength()) {
            mandatoryError.setText("Password must include letters, numbers, and special characters (!@#$%) and be at least 6 characters.");
        } else {
            mandatoryError.setText("New password format looks good.");
        }
    }//GEN-LAST:event_passwordInputActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthdayError;
    private javax.swing.JLabel createUserLabel;
    private javax.swing.JTextField dayInput;
    private javax.swing.JLabel emailError;
    private javax.swing.JTextField emailInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mandatoryError;
    private javax.swing.JTextField monthInput;
    private javax.swing.JTextField passwordInput;
    private javax.swing.JLabel phoneNumberError;
    private javax.swing.JTextField phoneNumberInput;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JTextField yearInput;
    // End of variables declaration//GEN-END:variables
}
