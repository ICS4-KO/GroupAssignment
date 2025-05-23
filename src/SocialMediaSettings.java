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
    
    public SocialMediaSettings(boolean allowNotification, boolean locationSharing, boolean microphoneAccess, boolean birthdayPrivacy, boolean emailPrivacy, boolean phoneNumberPrivacy, boolean mentionsPrivacy, boolean messagesPrivacy, boolean storiesPrivacy){
        super(allowNotification, locationSharing, microphoneAccess);
        this.mentionsPrivacy=mentionsPrivacy;
        this.messagesPrivacy=messagesPrivacy;
        this.storiesPrivacy=storiesPrivacy;
        this.birthdayPrivacy=birthdayPrivacy;
        this.emailPrivacy=emailPrivacy;
        this.phoneNumberPrivacy=phoneNumberPrivacy;
        
        this.socialMediaSettingsCounter = counter++;
    }
    
    /**
     * This constructor creates an instance of the SocialMediaSettings class that has all attributes (different settings) set to 
     * default values
     */
    public SocialMediaSettings() {
        super(true, true, true);
        
        this.mentionsPrivacy=true;
        this.messagesPrivacy=true;
        this.storiesPrivacy=true;
        this.birthdayPrivacy=true;
        this.emailPrivacy=true;
        this.phoneNumberPrivacy=true;
        
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
    public String setExplanation() {
        String birthdayPrivacyExplanation; //Initialize string to store explanation for birthday privacy setting
        String emailPrivacyExplanation; //Initialize string to store explanation for email privacy setting
        String phoneNumberExplanation; //Initialize string to store explanation for phone number privacy setting
        String mentionsPrivacyExplanation; //Initialize string to store explanation for mentions privacy setting
        String messagesPrivacyExplanation; //Initialize string to store explanation for messages privacy setting
        String storiesPrivacyExplanation; //Initialize string to store explanation for stories privacy setting
        
        //Check if user's birthday privacy setting is true
        if (birthdayPrivacy == true)
            //Set appropriate explanation for birthday privacy setting (true)
            birthdayPrivacyExplanation = "Because your birthday is public, anyone who comes across your account will be able to access it.";
        //If user's birthday privacy setting is not true, it is false
        else
            //Set appropriate explanation for birthday privacy setting (false)
            birthdayPrivacyExplanation = "Because your birthday is private, no other accounts will have access to your birthday.";
        
        //Check if user's email privacy setting is true
        if (emailPrivacy == true)
            //Set appropriate explanation for email privacy setting (true)
            emailPrivacyExplanation = "Because your email is public, anyone will have access to it.";
        //If user's email privacy setting is not true, it is false
        else
            //Set appropriate explanation for email privacy setting (false)
            emailPrivacyExplanation = "Because your email is private, only you will be able to see and get access to this information.";
        
        //Check if user's phone number privacy setting is true
        if (phoneNumberPrivacy == true)
            //Set appropriate explanation for phone number privacy setting (true)
            phoneNumberExplanation = "Because your phone number is public ,anyone will have access to it.";
        //If user's phone number privacy setting is not true, it is false
        else
            //Set appropriate explanation for phone number privacy setting (false)
            phoneNumberExplanation = "Because your phone number is private, only you will be able to see and get access to this information.";
        
        //Check if user's mentions privacy setting is true
        if (mentionsPrivacy == true)
            //Set appropriate explanation for mentions privacy setting (true)
            mentionsPrivacyExplanation = "Because mentions are allowed, anyone mentioning will be able to mention you in their post and comments.";
        //If user's mentions privacy setting is not true, it is false
        else
            //Set appropriate explanation for mentions privacy setting (false)
            mentionsPrivacyExplanation = "Because mentions are prohibited, you will not be able to get mentions in others' posts or comments.";
        
        //Check if user's messages privacy setting is true
        if (messagesPrivacy == true)
            //Set appropriate explanation for mentions privacy setting (true)
            messagesPrivacyExplanation = "Because messages public, anyone will be able to message you without restrictions.";
        //If user's mentions privacy setting is not true, it is false
        else
            //Set appropriate explanation for mentions privacy setting (false)
            messagesPrivacyExplanation = "Because messages private, non-followers will not be allowed to message you.";
        
        //Check if user's stories privacy setting is true
        if (storiesPrivacy == true)
            //Set appropriate explanation for stories privacy setting (true)
            storiesPrivacyExplanation = "Because stories are private, only you and your followers will be able to access them without restrictions.";
        //If user's stories privacy setting is not true, it is false
        else
            //Set appropriate explanation for stories privacy setting (false)
            storiesPrivacyExplanation = "Because stories are public, both followers and non-followers will be able to see stories posted by you.";

        //Call parent method's set explanation method for BasicSettings attributes, add explanations of social media settings
        //Return full string of concatenated explanations of each of the user's current game settings
        return super.setExplanation() + "\n\n" + birthdayPrivacyExplanation + "\n\n" + emailPrivacyExplanation + "\n\n" + phoneNumberExplanation + "\n\n" + mentionsPrivacyExplanation + "\n\n" + messagesPrivacyExplanation + "\n\n" + storiesPrivacyExplanation;
    }
    
    public String toString(){
        return "Game Settings Version " + socialMediaSettingsCounter;
    }
}
