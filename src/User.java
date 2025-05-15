/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343330528
 */
public class User {
    //Instance Variables
    private String username; //username
    private Password password; //password
    private String email; //user's email
    private Date birthday; //user's birthday
    private String phoneNumber; //user's phone number
    private BasicSettings settings; //user's privacy settings
    
    /**
     * This constructor creates an instance of the User class that has all attributes set by the user
     * 
     * @param username     //This is the value the username attribute is assigned
     * @param password     //This is the value the password attribute is assigned
     * @param birthday     //This is the value the birthday attribute is assigned
     * @param email        //This is the value the email attribute is assigned 
     * @param phoneNumber  //This is the value the phone number attribute is assigned
     */
    User (String username, Password password, Date birthday, String email, String phoneNumber) {
        this.username = username; //Set username to value entered by the user
        this.password = password; //Set password to value entered by the user
        this.birthday = birthday; //Set birthday to value entered by the user
        this.email = email; //Set email to value entered by the user
        this.phoneNumber = phoneNumber; //Set phone number to value entered by the user
    }
    
    /**
     * This constructor creates an instance of the User class in the case that the user does not enter a value for the birthday, 
     * all attributes are set except for the birthday
     * 
     * @param username     //This is the value the username attribute is assigned
     * @param password     //This is the value the password attribute is assigned
     * @param email        //This is the value the email attribute is assigned
     * @param phoneNumber  //This is the value the phone number attribute is assigned
     */
    User (String username, Password password, String email, String phoneNumber) {
        this.username = username; //Set username to value entered by the user
        this.password = password; //Set password to value entered by the user
        this.email = email; //Set email to value entered by the user
        this.phoneNumber = phoneNumber; //Set phone number to value entered by the user
    }
    
    /**
     * This constructor creates an instance of the User class in the case that the user does not enter a value for the phone 
     * number, all attributes are set except for the phone number
     * 
     * @param username     //This is the value the username attribute is assigned
     * @param password     //This is the value the password attribute is assigned
     * @param birthday     //This is the value the birthday attribute is assigned
     * @param phoneNumber  //This is the value the phone number attribute is assigned
     */
    User (String username, Password password, String email, Date birthday) {
        this.username = username; //Set username to value entered by the user
        this.password = password; //Set password to value entered by the user
        this.email = email; //Set email to value entered by the user
        this.birthday = birthday; //Set birthday to value entered by the user
    }
    
    /**
     * This constructor creates an instance of the User class in the case that the user does not enter a value for the birthday
     * or phone number, all attributes are set except for the birthday and phone number
     * 
     * @param username     //This is the value the username attribute is assigned
     * @param password     //This is the value the password attribute is assigned
     * @param email        //This is the value the email attribute is assigned
     */
    User (String username, Password password, String email) {
        this.username = username; //Set username to value entered by the user
        this.password = password; //Set password to value entered by the user
        this.email = email; //Set email to value entered by the user
    }
    
    /**
     * This setter method sets the privacy settings attribute of a User object
     * 
     * @param settings  BasicSettings object that will be assigned to the settings attribute
     */
    public void setSettings(BasicSettings settings) {
        this.settings = settings;
    }
}
