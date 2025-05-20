/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343330528
 */
public class SearchEngineSettings {
    private boolean trackHistory;
    private boolean adPersonalization;
    private boolean safeBrowsing;
    private boolean searchSuggestions;
    private int resultsPerPage;
    private int searchEngineSettingsCounter;
    private static int counter = 1;

    public SearchEngineSettings (String theme, boolean allowNotifications, boolean locationSharing, boolean microphoneAccess, 
            boolean trackHistory, boolean adPersonalization, boolean safeBrowsing, boolean searchSuggestions, int resultsPerPage){
        super();
        
    }
    
    public boolean getTrackHistory(){
        return trackHistory;
    }
    
    public boolean getAdPersonalization(){
        return adPersonalization;
    }
    
    public boolean getSafeBrowsing(){
        return safeBrowsing;
    }
    
    public boolean getSearchSuggestions(){
        return searchSuggestions;
    }
    
    public boolean getResultsPerPage(){
        return resultsPerPage;
    }
    
    public String setExplanation(){
        
    }
    
    public String toString(){
        
    }

}
