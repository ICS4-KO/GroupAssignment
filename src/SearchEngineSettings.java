/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Defines the variables and methods of a SearchEngineSettings object in Settings Simulator app that represents a set of search engine settings
 *options set by the user
 * @author jojox
 * @version 1.0
 * @since  2025-05-23
 */
public class SearchEngineSettings extends BasicSettings {
    //Instance variables
    private boolean trackHistory;//Setting to allow history tracking
    private boolean adPersonalization;//setting to allow ad personalization
    private boolean safeBrowsing;//setting for turing on safe browsing
    private boolean searchSuggestions;//setting to allow search suggestions
    private int resultsPerPage;//setting to set the number of results per page
    private int searchEngineSettingsCounter;//nth version of search engin settings the user has set for their account, displayed in history combo box
    //Static variables
    private static int counter = 0;//a counter the keep track of the version
    private static final int DEFAULT_RESULTS_PER_PAGE = 10;//a default variable for the number of results for each page
    
    /**
     * This is a constructor that retrieves user's choice to set each instance variable for there settings like history tracking, ad personalization and much more.
     * Additionally, there is a counter for the version number of the user's current search engine settings
     * @param allowNotifications A parameter that detects true or false depending on weather the user allows or blocks notifications
     * @param locationSharing A parameter that detects true or false depending on weather the user allows or blocks location Sharing
     * @param microphoneAccess A parameter that detects true or false depending on weather the user allows or blocks microphone access
     * @param trackHistory A parameter that detects true or false depending on weather the user allows or blocks the program from tracking history
     * @param adPersonalization A parameter that detects true or false depending on weather the user allows or prohibits ad personalization
     * @param safeBrowsing A parameter that detects true or false depending on weather the user wants to turn on or off safe browsing
     * @param searchSuggestions A parameter that detects true or false depending on weather the user allows or blocks search suggestions from displaying
     * @param resultsPerPage  A parameter that is the amount the user selected to be the number of results per page
     */
    public SearchEngineSettings(boolean allowNotifications, boolean locationSharing, boolean microphoneAccess,
                                boolean trackHistory, boolean adPersonalization, boolean safeBrowsing,
                                boolean searchSuggestions, int resultsPerPage) {
        super(allowNotifications, locationSharing, microphoneAccess);//calls parent constructor to set them
        this.trackHistory = trackHistory;
        this.adPersonalization = adPersonalization;
        this.safeBrowsing = safeBrowsing;
        this.searchSuggestions = searchSuggestions;
        this.resultsPerPage = resultsPerPage;

        this.searchEngineSettingsCounter = counter;
        counter++;
    }
    
    /**
     * This constructor creates an instance of the SearchEngineSettings class that has all attributes (different settings) set 
     * to default values
     */
    public SearchEngineSettings() {
        super(true, true, true);
        this.trackHistory = true;
        this.adPersonalization = true;
        this.safeBrowsing = true;
        this.searchSuggestions = true;
        this.resultsPerPage = DEFAULT_RESULTS_PER_PAGE;

        this.searchEngineSettingsCounter = counter;//sets the current version of the setting
        counter++;//updated and incremented by one 
    }
    
    /**
     * This is a getter method that returns a Boolean corresponding to user's choice on weather or not they want there history to be tracked
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getTrackHistory() {
        return trackHistory;
    }
    /**
     * This is a getter method that returns a Boolean corresponding to user's choice on weather or not they want ad personalization
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getAdPersonalization() {
        return adPersonalization;
    }
    /**
     * This is a getter method that returns a Boolean corresponding to user's choice on weather or not they want to turn on safe browsing
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getSafeBrowsing() {
        return safeBrowsing;
    }
    /**
     * This is a getter method that returns a Boolean corresponding to user's choice on weather or not they want the program to make search suggestions
     * @return It returns the Boolean depending on what user choice was
     */
    public boolean getSearchSuggestions() {
        return searchSuggestions;
    }
    /**
     * This is a getter method that returns a amount they want per page depending on user's choice
     * @return It returns the amount depending on what user choice was
     */
    public int getResultsPerPage() {
        return resultsPerPage;
    }
    
    @Override
    public String setExplanation() {
        String trackHistoryExplanation; //Initialize string to store explanation for track history setting
        String adPersonalizationExplanation; //Initialize string to store explanation for ad personalization setting
        String safeBrowsingExplanation; //Initialize string to store explanation for safe browsing setting
        String searchSuggestionsExplanation; //Initialize string to store explanation for search suggestions setting
        String resultsPerPageExplanation; //Initialize string to store explanation for results per page setting
        
        //Check if user's track history setting is true
        if (trackHistory == true)
            //Set appropriate explanation for track history setting (true)
            trackHistoryExplanation = "Because history tracking is allowed, the program will be tracking your history for easy access later when you come back.";
        //If user's track history setting is not true, it is false
        else
            //Set appropriate explanation for track history setting (false)
            trackHistoryExplanation = "Because history tracking is prohibited, the program will not be able to access your history or previously visited websites.";
        
        //Check if user's ad personalization setting is true
        if (adPersonalization == true)
            //Set appropriate explanation for ad personalization setting (true)
            adPersonalizationExplanation = "Because ad personalization is allowed, you will be able to customize your ads and put restrictions on what content is displayed.";
        //If user's ad personalization privacy setting is not true, it is false
        else
            //Set appropriate explanation for ad personalization setting (false)
            adPersonalizationExplanation = "Because ad personalization is not allowed, ads will not be customized and be set as default content without restrictions.";
        
        //Check if user's safe browsing privacy setting is true
        if (safeBrowsing == true)
            //Set appropriate explanation for safe browsing setting (true)
            safeBrowsingExplanation = "Because safe browsing is on, your search engine will now be limited in terms what you will be able to search and what is visible to you. "; 
        //If user's safe browsing setting is not true, it is false
        else
            //Set appropriate explanation for safe browsing setting (false)
            safeBrowsingExplanation = "Because safe browsing off, there will be no restrictions on what you see and what is displayed to you."; 
        
        //Check if user's search suggestions setting is true
        if (searchSuggestions == true)
            //Set appropriate explanation for search suggestions setting (true)
            searchSuggestionsExplanation = "Because search suggestions are allowed, the search engine will be able to provide you with suggestions of what you might want to be searching for."; 
        //If user's search suggestionssetting is not true, it is false
        else
            //Set appropriate explanation for search suggestions setting (false)
            searchSuggestionsExplanation = "Because search suggestions are not allowed, you will not be seeing any search suggestions made by the search engine.";
        
        //Check if user's results per page setting is "10"
        if (resultsPerPage == 10)
            //Set appropriate explanation for results per page setting (10)
            resultsPerPageExplanation = "Becaures results per page is set to 10, you will see 10 entries on each search engine results page."; 
        //Check if user's results per page setting is "25"
        else if (resultsPerPage == 25)
            //Set appropriate explanation for results per page setting (25)
            resultsPerPageExplanation =  "Becaures results per page is set to 25, you will see 10 entries on each search engine results page."; 
        //If user's results per page setting is not "10" or "25", it is "50"
        else
            //Set appropriate explanation for results per page setting (50)
            resultsPerPageExplanation = "Becaures results per page is set to 50, you will see 10 entries on each search engine results page.";
        
        //Call parent method's set explanation method for BasicSettings attributes, add explanations of social media settings
        //Return full string of concatenated explanations of each of the user's current game settings
        return super.setExplanation() + "\n\n" + trackHistoryExplanation + "\n\n" + adPersonalizationExplanation + "\n\n" + safeBrowsingExplanation + "\n\n" + searchSuggestionsExplanation + "\n\n" + resultsPerPageExplanation;
    }
    /**
     * This is a toString method that displays what version the program is
     * @return It returns the version it's on currently
     */
    @Override
    public String toString() {
        return "Game Settings Version " + searchEngineSettingsCounter;
    }

}
