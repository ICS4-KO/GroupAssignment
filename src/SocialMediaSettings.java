/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343330528
 */
public class SocialMediaSettings extends BasicSettings{
    private boolean mentionsPrivacy;
    private boolean messagesPrivacy;
    private boolean storiesPrivacy;
    private boolean birthdayPrivacy;
    private boolean emailPrivacy;
    private boolean phoneNumberPrivacy;
    private int socialMediaSettingsCounter;
    private static int counter=1;
    
    public SocialMediaSettings(String theme, boolean allowNotification, boolean locationSharing, boolean microphoneAccess, boolean birthdayPrivacy, boolean emailPrivacy, boolean phoneNumberPrivacy, boolean mentionsPrivacy, boolean messagesPrivacy, boolean storiesPrivacy){
        super(theme, allowNotification, locationSharing, microphoneAccess);
        this.mentionsPrivacy=mentionsPrivacy;
        this.messagesPrivacy=messagesPrivacy;
        this.storiesPrivacy=storiesPrivacy;
        this.birthdayPrivacy=birthdayPrivacy;
        this.emailPrivacy=emailPrivacy;
        this.phoneNumberPrivacy=phoneNumberPrivacy;
        this.socialMediaSettingsCounter = counter++;
    }
    
    public boolean getBirthdayPrivacy(){
        return birthdayPrivacy;
    }
    
    public boolean getEmailPrivacy(){
        return emailPrivacy;
    }
    
    public boolean getPhoneNumberPrivacy(){
        return phoneNumberPrivacy;
    }
    
    public boolean getMentionsPrivacy(){
        return mentionsPrivacy;
    }
    
    public boolean getMessagesPrivacy(){
        return messagesPrivacy;
    }
    
    public boolean getStoriesPrivacy(){
        return storiesPrivacy;
    }
    
    @Override
    public void setExplanation(String explanation) {
        super.setExplanation(explanation);
    }
    
    public String toString(){
        return "Notification:"+super.getAllowNotification()+" Location:"+super.getLocationSharing()+" Microphone:"+super.getMicrophoneAccess()+" Birthday:"+ birthdayPrivacy +" Email:"+emailPrivacy+" Phone Number:"+phoneNumberPrivacy+"Mentions:"+mentionsPrivacy+" Messages:"+messagesPrivacy+" Stories:"+storiesPrivacy;
    }
}
