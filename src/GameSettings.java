/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343330528
 */
public class GameSettings extends BasicSettings {
    //Instance variables
    private String difficultyLevel; //Game's difficulty level
    private boolean subtitlesEnabled; //Turn subtitles on or off
    private String screenResolution; //Screen resolution
    private String controlScheme; //How the user interacts with the game
    private String graphicsQuality; //Graphics quality
    private int gameSettingsCounter; //nth version of game settings the user has set for their account, displayed in history combo box
    
    //Static variables
    private static int counter = 1; //Counter for the game settings number
    
    /**
     * This constructor creates an instance of the GameSettings class that has all attributes (different settings) set by the user
     * 
     * @param theme              //This is the value the theme attribute will be assigned (parent attribute)
     * @param allowNotifications //This is the value the allow notifications attribute will be assigned (parent attribute)
     * @param locationSharing    //This is the value the location sharing attribute will be assigned (parent attribute)
     * @param microphoneAccess   //This is the value the microphone access attribute will be assigned (parent attribute)
     * @param difficultyLevel    //This is the value the difficult level attribute will be assigned
     * @param subtitledEnabled   //This is the value the subtitles enabled attribute will be assigned
     * @param screenResolution   //This is the value the screen resolution attribute will be assigned
     * @param controlSceheme     //This is the value the control scheme attribute will be assigned
     * @param graphicsQuality    //This is the value the graphics quality attribute will be assigned
     */
    public GameSettings(String theme, boolean allowNotifications, boolean locationSharing, boolean microphoneAccess, String difficultyLevel, boolean subtitlesEnabled, String screenResolution, String controlSceheme, String graphicsQuality) {
        //Call parent constructor to set theme, notifications, location sharing, and microphone access to values chosen by the user
        super(theme, allowNotifications, locationSharing, microphoneAccess);
        
        this.difficultyLevel = difficultyLevel; //Set difficulty level to value chosen by the user
        this.subtitlesEnabled = subtitlesEnabled; //Set subtitles enabled to value chosen by the user
        this.screenResolution = screenResolution; //Set screen resolution to value chosen by the user
        this.controlScheme = controlScheme; //Set control scheme to value chosen by the user
        this.graphicsQuality = graphicsQuality; //Set graphics quality to value chosen by the user
        
        this.explanation = setExplanation(); //Create explanation of all settings by calling the explanations setter method
        this.gameSettingsCounter = counter; //Set game settings counter to static counter variable
        counter++; //Increment static counter variable for next time the game setttings are set and an object is created
    }
    
    
    /**
     * This getter method returns the difficulty level set by the user
     * 
     * @return  Returns difficulty level attribute of a GameSettings object 
     */
    public String getDifficultyLevel() {
        return difficultyLevel;
    }
    
    /**
     * This getter method returns the subtitles setting set by the user
     * 
     * @return  Returns subtitles enabled attribute of a GameSettings object 
     */
    public boolean getSubtitlesEnabled() {
        return subtitlesEnabled;
    }
    
    /**
     * This getter method returns the screen resolution set by the user
     * 
     * @return  Returns screen resolution attribute of a GameSettings object 
     */
    public String getScreenResolution() {
        return screenResolution;
    }
    
    /**
     * This getter method returns the control scheme set by the user
     * 
     * @return  Returns control scheme attribute of a GameSettings object 
     */
    public String getControlScheme() {
        return controlScheme;
    }
    
    /**
     * This getter method returns the graphics quality set by the user
     * 
     * @return  Returns graphics quality attribute of a GameSettings object 
     */
    public String getGraphicsQuality() {
        return graphicsQuality;
    }
    

    @Override
    public String setExplanation() {
        String difficultyLevelExplanation; 
        String subtitlesEnabled;
        String screenResolution;
        String controlScheme;
        String graphicsQuality;
        
        if (difficulyLevel.equals("Easy"))
            difficultyLevelExplanation = "";
        else if (difficulyLevel.equals("Normal"))
            difficultyLevelExplanation = "";
        else
            difficultyLevelExplanation = "";
        
        return super.displayExplanation() + " " + difficultyLevelExplanation + " " + subtitlesEnabled + " " + screenResolution + " " + controlScheme + " " + graphicsQuality;
    }
    
    @Override
    /**
    * This method returns the user's game settings version number, neatly formatted as a string to be displayed in the game
    * settings history combo box
    * 
    * @return  This returns text displaying the game settings version number of a Game Settings object
    */
    public String toString() {
        return "Game Settings Version " + gameSettingsCounter;
    }
   
}
