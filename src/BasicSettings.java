/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342484417
 */
public class BasicSettings {
    //instance variables
    //hi
    private String explanation;
    private boolean allowNotifications;
    private boolean locationSharing;
    private boolean microphoneAccess;
    //Default variables
    //private boolean DEFAULT_BIRTHDAY=true;
    //private boolean DEFAULT_EMAIL=true;
    //private boolean DEFAULT_PHONENUMBER=true;
   
    public BasicSettings(boolean allowNotification, boolean locationSharing, boolean microphoneAccess){
        this.allowNotifications=allowNotification;
        this.locationSharing=locationSharing;
        this.microphoneAccess=microphoneAccess;
    }
   
    public String getExplanation(){
        return explanation;
    }
   
    public boolean getAllowNotifications(){
        return allowNotifications;
    }
   
    public boolean getLocationSharing(){
        return locationSharing;
    }
   
    public boolean getMicrophoneAccess(){
        return microphoneAccess;
    }
    
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
    
    public String toString() {
        return "View Settings History";
    }
}