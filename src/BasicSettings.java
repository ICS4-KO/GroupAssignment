/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tina
 */
public class BasicSettings {
    //instance variables
    private String explanation;//A string for explanation
    private boolean allowNotifications;//Setting for allowing nottification
    private boolean locationSharing;//setting for sharing location
    private boolean microphoneAccess;//setting for allowing access to microphone
   
    /**
     * This is a constructor that will retrieve users choice for there notification, location sharing and microphone access to set it as the instance variable
     * @param allowNotification This is a parameter that detects true or false depending on weather the user allows or blocks notifications
     * @param locationSharing This is a parameter that detects true or false depending on weather the user allows or blocks location Sharing
     * @param microphoneAccess This is a parameter that detects true or false depending on weather the user allow or blocks access to their microphone
     */
    public BasicSettings(boolean allowNotification, boolean locationSharing, boolean microphoneAccess){
        this.allowNotifications=allowNotification;
        this.locationSharing=locationSharing;
        this.microphoneAccess=microphoneAccess;
    }
    
    /**
     * This getter method for getting explanation to explaining what each setting means
     * @return This returns the explanation that will be used in the program "DisplayExplanatios" if selected by user
     */
    public String getExplanation(){
        return explanation;
    }
    
    /**
     * This is a getter method for getting a Boolean of user choice of weather they allow or prohibit notification
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getAllowNotifications(){
        return allowNotifications;
    }
    
    /**
     * This is the getter method for getting a Boolean of users choice of weather they allow or prohibit location sharing
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getLocationSharing(){
        return locationSharing;
    }
    
    /**
     * This is the getter method for getting a Boolean of users choice of weather they allow or prohibit microphone Access
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getMicrophoneAccess(){
        return microphoneAccess;
    }
    
    /**
     * This is setter method for explanations that will be called in the class "DisplayExplanation". It will output the appropriate messages depending on user's choice. 
     * @return It returns all the messages depending on user's choice
     */
    public String setExplanation() {
        String allowNotificationsExplanation; //Initialize string to store explanation for notifications setting
        String locationSharingExplanation; //Initialize string to store explanation for location sharing setting
        String microphoneAccessExplanation; //Initialize string to store explanation for microphone setting
        
        //Check if user's notification setting is true
        if (allowNotifications == true)
            //Set appropriate explanation for notification setting (true)
            allowNotificationsExplanation = "Because notifications are allowed, you will be notified of relevent content, updates, and messages"; 
        //If user's notification setting is not true, it is false
        else
            //Set appropriate explanation for notification setting (false)
            allowNotificationsExplanation = "Because notifications are not allowed, you won’t be notified of any new notifications on your account.";
        
        //Check if user's location sharingsetting is true
        if (locationSharing == true)
            //Set appropriate explanation for location sharing setting (true)
            locationSharingExplanation = "Because location sharing is on, the app will be able to track your location when needed. Additionally, the platform will be able to access it at any time without asking."; 
        //If user's location sharing setting is not true, it is false
        else
            //Set appropriate explanation for location sharing setting (false)
            locationSharingExplanation = "Because location sharing is off, the app will not be tracking your location and location won’t be shared with the platform"; 
        
        //Check if user's microphone setting is true
        if (microphoneAccess == true)
            //Set appropriate explanation for microphone setting (true)
            microphoneAccessExplanation = "Because microphone access is allowed, the app will automatically use the microphone for the purpose of phone calls, voice memos or when necessary without asking.";
        //If user's microphone setting is not true, it is false
        else
            //Set appropriate explanation for microphone setting (false)
            microphoneAccessExplanation = "Because microphone is turned off, your microphone cannot be accessed by the app.";
        
        //Return full string of concatenated explanations of each of the user's current settings
        return allowNotificationsExplanation + "\n\n" + locationSharingExplanation + "\n\n" + microphoneAccessExplanation + "\n\n";
    }
}