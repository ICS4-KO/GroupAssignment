import java.util.ArrayList;
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
    private String username; //Username
    private Password password; //Password
    private String email; //User's email
    private Date birthday; //User's birthday
    private String phoneNumber; //User's phone number
    private ArrayList<String> friendsList; //User's list of friends
    private ArrayList<BasicSettings> settings; //Arraylist of all the user's previous/current privacy settings
    private GameSettings currentGameSettings; //User's current game settings
    private SearchEngineSettings currentSearchEngineSettings; //User's current search engine settings
    private SocialMediaSettings currentSocialMediaSettings; //User's current social media privacy settings
    
    //Static Variables
    private static int numUsers = 0; //Total number of user accounts that have been instantiated
    
    //Default Constants
    private static int DEFAULT_MONTH = 0; //Default month if user does not enter a birthday
    private static int DEFAUlT_DAY = 0; //Default birth day if user does not enter a birthday
    private static int DEFAULT_YEAR = 0; //Default birth year if user does not enter a birthday
    private static String DEFAULT_PHONE_NUMBER = "000"; //Default phone number if user does not enter a phone number
    
    
    /**
     * This constructor creates an instance of the User class that has all attributes set by the user
     * 
     * @param username     //This is the value the username attribute is assigned
     * @param password     //This is the value the password attribute is assigned
     * @param birthday     //This is the value the birthday attribute is assigned
     * @param email        //This is the value the email attribute is assigned 
     * @param phoneNumber  //This is the value the phone number attribute is assigned
     */
    User (String username, Password password, String email, Date birthday, String phoneNumber) {
        this.username = username; //Set username to value entered by the user
        this.password = password; //Set password to value entered by the user
        this.birthday = birthday; //Set birthday to value entered by the user
        this.email = email; //Set email to value entered by the user
        this.phoneNumber = phoneNumber; //Set phone number to value entered by the user
        numUsers++; //Increase number of users that have been instantiated by one
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
        this.birthday = new Date(DEFAULT_MONTH, DEFAUlT_DAY, DEFAULT_YEAR); //Set birthday to default value
        numUsers++; //Increase number of users that have been instantiated by one
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
        this.phoneNumber = DEFAULT_PHONE_NUMBER; //Set phone number to default value
        numUsers++; //Increase number of users that have been instantiated by one
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
        this.birthday = new Date(DEFAULT_MONTH, DEFAUlT_DAY, DEFAULT_YEAR); //Set birthday to default value
        this.phoneNumber = DEFAULT_PHONE_NUMBER; //Set phone number to default value
        numUsers++; //Increase number of users that have been instantiated by one
    }
    
    
    /**
     * This method adds a new GameSettings object (game/search engine/social media) to a User object's array list of settings
     * each time the user updates one of the three settings
     * 
     * @param newGameSettings  GameSettings object that will be added to the array of all previous/current user settings
     */
    public void addNewSettings(GameSettings newGameSettings) {
        settings.add(newGameSettings);
    }
    
    /**
     * This setter method sets the current game settings attribute of a User object
     * 
     * @param currentGameSettings  GameSettings object that will be assigned to the user's current game settings
     */
    public void setGameSettings(GameSettings currentGameSettings) {
        this.currentGameSettings = currentGameSettings;
    }
    
    /**
     * This setter method sets the current search engine settings attribute of a User object
     * 
     * @param currentSearchEngineSettings  SearchEngineSettings object that will be assigned to the user's current search engine settings
     */
    public void setSearchEngineSettings(SearchEngineSettings currentSearchEngineSettings) {
        this.SearchEngineSettings = SearchEngineSettings;
    }
    
    /**
     * This setter method sets the current social media privacy settings attribute of a User object
     * 
     * @param currentSocialMediaSettings  SocialMediaSettings object that will be assigned to the user's current social media settings
     */
    public void setSocialMediaSettings(SocialMediaSettings currentSocialMediaSettings) {
        this.SocialMediaSettings = SocialMediaSettings;
    }
    
    
    /**
     * This getter method returns the username set by the user
     * 
     * @return  Returns username attribute of a User object 
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * This getter method returns the password set by the user
     * 
     * @return  Returns password attribute of a User object 
     */
    public Password getPassword() {
        return password;
    }
    
    /**
     * This getter method returns the email set by the user
     * 
     * @return  Returns email attribute of a User object 
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * This getter method returns the birthday set by the user
     * 
     * @return  Returns birthday attribute of a User object (Date object)
     */
    public Date getBirthday() {
        return birthday;
    }
    
    /**
     * This getter method returns the phone number set by the user
     * 
     * @return  Returns phone number attribute of a User object 
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    
    /**
     * This getter method returns the array list of the user's friends
     * 
     * @return   Returns array list of all the friends added by the user
     */
    public ArrayList<String> getFriendsList() {
        return friendsList;
    }
    
    /**
     * This getter method returns the array list of all the user's previous/current privacy settings
     * 
     * @return  Returns array list of all the user's settings (game/search engine/social media) previously set 
     */
    public ArrayList<BasicSettings> returnSettings() {
        return settings;
    }
    
    /**
     * This getter method returns the current game settings most recently set by the user
     * 
     * @return  Returns current game settings attribute of a User object 
     */
    public GameSettings getcurrentGameSettings() {
        return currentGameSettings;
    }
    
    /**
     * This getter method returns the current search engine settings most recently set by the user
     * 
     * @return  Returns current search engine settings attribute of a User object 
     */
    public SearchEngineSettings getSearchEngineSettings() {
        return currentSearchEngineSettings;
    }
    
    /**
     * This getter method returns the current social media settings most recently set by the user
     * 
     * @return  Returns current social media settings attribute of a User object 
     */
    public SocialMediaSettings getSocialMediaSettings() {
        return currentSocialMediaSettings;
    }
    
    /**
     * This getter method returns the total number of user accounts that have been created
     * 
     * @return  Returns static variable storing the number of instantiated User objects
     */
    public static int getNumUsers() {
        return numUsers;
    }
}
