/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 342484417
 */
public class BasicSettings {
    //instancing varibales
    private String explanation;
    private boolean allowNotification;
    private boolean locationSharing;
    private boolean microphoneAccess;
    //Default varibales
    //private boolean DEFAULT_BIRTHDAY=true;
    //private boolean DEFAULT_EMAIL=true;
    //private boolean DEFAULT_PHONENUMBER=true;
   
    public BasicSettings(boolean allowNotification, boolean locationSharing, boolean microphoneAccess){
        this.allowNotification=allowNotification;
        this.locationSharing=locationSharing;
        this.microphoneAccess=microphoneAccess;
    }
   
    public String getExplanation(){
        return explanation;
    }
   
    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
   
    public boolean getAllowNotification(){
        return allowNotification;
    }
   
    public void setAllowNotification(boolean allowNotification){
        this.allowNotification=allowNotification;
    }
   
    public boolean getLocationSharing(){
        return locationSharing;
    }
   
    public void setLocationSharing(boolean locationSharing){
        this.locationSharing=locationSharing;
    }
   
    public boolean getMicrophoneAccess(){
        return microphoneAccess;
    }
   
    public void setMicrophoneAccess(boolean microphoneAccess){
        this.microphoneAccess=microphoneAccess;
    }
}