/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tina
 */
public class SocialMediaSettings extends BasicSettings{
    //Instance Variable
    private boolean mentionsPrivacy;//setting to allow being mentioned
    private boolean messagesPrivacy;//setting to allow messages
    private boolean storiesPrivacy;//setting to make stories public 
    private boolean birthdayPrivacy;//setting to make make birthdays public
    private boolean emailPrivacy;//setting to make email public
    private boolean phoneNumberPrivacy;//setting to make phone number public
    private int socialMediaSettingsCounter;////nth version of Socail Media settings the user has set for their account, displayed in history combo box
    //Static variable
    private static int counter=0;//a counter to current version
    
    /**
     * This is a constructor that retrieves user's choice to set each instance variable for there settings like microphone, ad birthday and much more.
     * @param allowNotification This is a parameter that detects true or false depending on weather the user allows or blocks notifications
     * @param locationSharing This is a parameter that detects true or false depending on weather the user allows or blocks location Sharing
     * @param microphoneAccess This is a parameter that detects true or false depending on weather the user allows or blocks microphone Access
     * @param birthdayPrivacy This is a parameter that detects true or false depending on weather the user make their birthday public or private
     * @param emailPrivacy This is a parameter that detects true or false depending on weather the user make their email public or private
     * @param phoneNumberPrivacy This is a parameter that detects true or false depending on weather the user make their phone number public or private
     * @param mentionsPrivacy This is a parameter that detects true or false depending on weather the user allows or blocks others from mentions them
     * @param messagesPrivacy This is a parameter that detects true or false depending on weather the user make their messages public or private
     * @param storiesPrivacy This is a parameter that detects true or false depending on weather the user make their stories public or private
     */
    public SocialMediaSettings(boolean allowNotification, boolean locationSharing, boolean microphoneAccess, boolean birthdayPrivacy, boolean emailPrivacy, boolean phoneNumberPrivacy, boolean mentionsPrivacy, boolean messagesPrivacy, boolean storiesPrivacy){
        super(allowNotification, locationSharing, microphoneAccess); //calls parent constructor to set them 
        this.mentionsPrivacy=mentionsPrivacy;
        this.messagesPrivacy=messagesPrivacy;
        this.storiesPrivacy=storiesPrivacy;
        this.birthdayPrivacy=birthdayPrivacy;
        this.emailPrivacy=emailPrivacy;
        this.phoneNumberPrivacy=phoneNumberPrivacy;
        
        this.socialMediaSettingsCounter = counter++;//increases counter by one to set the version counter as it
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
    
    /**
     * This is a getter method for that returns a Boolean corresponding to user's choice on weather they want their birthday public or private
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getBirthdayPrivacy(){
        return birthdayPrivacy;
    }
    
    /**
     * This is a getter method for that returns a Boolean corresponding to user's choice on weather they want their emails public or private
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getEmailPrivacy(){
        return emailPrivacy;
    }
    
    /**
     * This is a getter method for that returns a Boolean corresponding to user's choice on weather they want their phone number public or private
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getPhoneNumberPrivacy(){
        return phoneNumberPrivacy;
    }
    
    /**
     * This is a getter method for that returns a Boolean corresponding to user's choice on weather they allow or prohibit others to mention them 
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getMentionsPrivacy(){
        return mentionsPrivacy;
    }
    
    /**
     * This is a getter method for that returns a Boolean corresponding to user's choice on weather they want their messages public or private
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getMessagesPrivacy(){
        return messagesPrivacy;
    }
    
    /**
     * This is a getter method for that returns a Boolean corresponding to user's choice on weather they want their stories public or private
     * @return It returns the Boolean depending on what user choice was
     */
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
            messagesPrivacyExplanation = "Because messages are public, anyone will be able to message you without restrictions.";
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
    /**
     * This is a toString method that displays what version the program is
     * @return It returns the version it's on currently
     */
    @Override
    public String toString(){
        return "Game Settings Version " + socialMediaSettingsCounter;
    }
}
