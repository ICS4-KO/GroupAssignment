/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Defines the variables and methods of a GameSettings object in Settings Simulator app that represents a set of game settings 
 * options set by the user
 * 
 * @author   Kimi Ong
 * @version  1.0
 * @since    2025-04-29
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
    private static int counter = 0; //Counter for the game settings number
    
    //Default constants
    private static final String DEFAULT_DIFFICULTY_LEVEL = "Easy";
    private static final String DEFAULT_SCREEN_RESOLUTION = "1920x1080";
    private static final String DEFAULT_CONTROL_SCHEME = "Keyboard";
    private static final String DEFAULT_GRAPHICS_QUALITY = "Low";
    
    /**
     * This constructor creates an instance of the GameSettings class that has all attributes (different settings) set by the user
     * 
     * @param allowNotifications //This is the value the allow notifications attribute will be assigned (parent attribute)
     * @param locationSharing    //This is the value the location sharing attribute will be assigned (parent attribute)
     * @param microphoneAccess   //This is the value the microphone access attribute will be assigned (parent attribute)
     * @param difficultyLevel    //This is the value the difficult level attribute will be assigned
     * @param subtitlesEnabled   //This is the value the subtitles enabled attribute will be assigned
     * @param screenResolution   //This is the value the screen resolution attribute will be assigned
     * @param controlScheme     //This is the value the control scheme attribute will be assigned
     * @param graphicsQuality    //This is the value the graphics quality attribute will be assigned
     */
    public GameSettings(boolean allowNotifications, boolean locationSharing, boolean microphoneAccess, String difficultyLevel, boolean subtitlesEnabled, String screenResolution, String controlScheme, String graphicsQuality) {
        //Call parent constructor to set notifications, location sharing, and microphone access to values chosen by the user
        super(allowNotifications, locationSharing, microphoneAccess);
        
        this.difficultyLevel = difficultyLevel; //Set difficulty level to value chosen by the user
        this.subtitlesEnabled = subtitlesEnabled; //Set subtitles enabled to value chosen by the user
        this.screenResolution = screenResolution; //Set screen resolution to value chosen by the user
        this.controlScheme = controlScheme; //Set control scheme to value chosen by the user
        this.graphicsQuality = graphicsQuality; //Set graphics quality to value chosen by the user
        
        this.gameSettingsCounter = counter; //Set game settings counter to static counter variable
        counter++; //Increment static counter variable for next time the game setttings are set and an object is created
    }
    
    /**
     * This constructor creates an instance of the GameSettings class that has all attributes (different settings) set to 
     * default values
     */
    public GameSettings() {
        //Call parent constructor to set notifications, location sharing, and microphone access to default values
        super(true, true, true);
        
        this.difficultyLevel = DEFAULT_DIFFICULTY_LEVEL; //Set difficulty level to default value
        this.subtitlesEnabled = true; //Set subtitles enabled to default value
        this.screenResolution = DEFAULT_SCREEN_RESOLUTION; //Set screen resolution to default value
        this.controlScheme = DEFAULT_CONTROL_SCHEME; //Set control scheme to default value
        this.graphicsQuality = DEFAULT_GRAPHICS_QUALITY; //Set graphics quality to default value
        
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
        String difficultyLevelExplanation; //Initialize string to store explanation for difficulty level setting
        String subtitlesEnabledExplanation; //Initialize string to store explanation for subtitles setting
        String screenResolutionExplanation; //Initialize string to store explanation for screen resolution setting
        String controlSchemeExplanation; //Initialize string to store explanation for control scheme setting
        String graphicsQualityExplanation; //Initialize string to store explanation for graphics setting
        
        //Check if user's difficulty setting is "Easy"
        if (difficultyLevel.equals("Easy"))
            //Set appropriate explanation for notification setting (Easy)
            difficultyLevelExplanation = "Because difficulty level is Easy, enemies will be weaker, resources will be more abundant, and gameplay will be more forgiving."; 
        //Check if user's difficulty setting is "Normal"
        else if (difficultyLevel.equals("Normal"))
            //Set appropriate explanation for notification setting (Normal)
            difficultyLevelExplanation = "Because difficulty level is Normal, gameplay will be a moderate challenge with standard enemy strength and resource availability."; 
        //If user's notification setting is not "Easy" or "Normal", it is "Hard"
        else
            //Set appropriate explanation for notification setting (Hard)
            difficultyLevelExplanation = "Because difficult level is Hard, enemies are harder to defeat, resources will be limited, and gameplay will be more challenging."; 
        
        //Check if user's subtitles setting is true
        if (subtitlesEnabled == true)
            //Set appropriate explanation for subtitles setting (true)
            subtitlesEnabledExplanation = "Because subtitles are turned on, subtitles will display spoken dialogue and other important audio cues during gameplay."; 
        //If user's subtitles setting is not true, it is false
        else
            //Set appropriate explanation for subtitles setting (false)
            subtitlesEnabledExplanation = "Because subtitles are turned off, there will be no subtitles to accompany games when available."; 
        
        //Check if user's screen resolution setting is "1920x1080"
        if (screenResolution.equals("1920x1080"))
            //Set appropriate explanation for resolution setting (1920x1080)
            screenResolutionExplanation = "Because your screen resolution is 1920x1080 (HD), game visuals will be less sharp but may run more smoothly on older or less powerful devices.";
        //Check if user's screen resolution setting is "1280x720"
        else if (screenResolution.equals("1280x720"))
            //Set appropriate explanation for resolution setting (1280x720)
            screenResolutionExplanation = "Because your screen resolution is 1280x720 (Full HD), there will be a good balance between performance and visual clarity."; 
        //If user's screen resolution setting is not "1920x1080" or "1280x720", it is "2560x1440"
        else
            //Set appropriate explanation for screen resolution setting (2560x1440)
            screenResolutionExplanation = "Because your screen resolution is 2560x1440, game visuals will be sharper with more detailed graphics but will be more demanding on your system."; 
        
        //Check if user's control scheme setting is "Keyboard"
        if (controlScheme.equals("Keyboard"))
            //Set appropriate explanation for control scheme setting (Keyboard)
            controlSchemeExplanation = "Because your control scheme is set to keyboard, you will be using a keyboard and mouse for game input"; 
        //Check if user's control scheme setting is "Gamepad"
        else if (controlScheme.equals("Gamepad"))
            //Set appropriate explanation for control scheme setting (Gamepad)
            controlSchemeExplanation = "Because your control scheme is set to gamepad, you will be using a gamepad for game input"; 
        //If user's control scheme setting is not "Keyboard" or "Gamepad", it is "Custom"
        else
            controlSchemeExplanation = "Because your control scheme is set to custom, you will be able to manually configure and assign controls for specialized setups."; //Set appropriate explanation for control scheme setting (Custom)
        
        //Check if user's graphics quality setting is "Low"
        if (graphicsQuality.equals("Low"))
            //Set appropriate explanation for graphics quality setting (Low)
            graphicsQualityExplanation = "Because your graphics quality is set to low, games will have simplified graphics with minimal detail and effects."; 
        //Check if user's graphics quality setting is "Medium"
        else if (graphicsQuality.equals("Medium"))
            //Set appropriate explanation for graphics quality setting (Medium)
            graphicsQualityExplanation = "Because your graphics quality is set to medium, games will have decent visual quality and moderate performance demand."; 
        //If user's notification setting is not "Low" or "Medium", it is "High"
        else
            //Set appropriate explanation for graphics quality setting (High)
            graphicsQualityExplanation = "Because your graphics quality is set to high, games will have enhanced graphics with more detail, lighting, and effects. "; 
        
        //Call parent method's set explanation method for BasicSettings attributes, add explanations of game settings
        //Return full string of concatenated explanations of each of the user's current game settings
        return super.setExplanation() + "\n\n" + difficultyLevelExplanation + "\n\n" + subtitlesEnabledExplanation + "\n\n" + screenResolutionExplanation + "\n\n" + controlSchemeExplanation + "\n\n" + graphicsQualityExplanation;
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
