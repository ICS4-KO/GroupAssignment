/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * 
 * @author jojox
 * @version 1.0
 */
public class SearchEngineSettings extends BasicSettings {
    private boolean trackHistory;
    private boolean adPersonalization;
    private boolean safeBrowsing;
    private boolean searchSuggestions;
    private int resultsPerPage;
    private static int searchEngineSettingsCounter = 1;
    private int counter;

    public SearchEngineSettings(boolean allowNotifications, boolean locationSharing, boolean microphoneAccess,
                                boolean trackHistory, boolean adPersonalization, boolean safeBrowsing,
                                boolean searchSuggestions, int resultsPerPage) {
        super(allowNotifications, locationSharing, microphoneAccess);
        this.trackHistory = trackHistory;
        this.adPersonalization = adPersonalization;
        this.safeBrowsing = safeBrowsing;
        this.searchSuggestions = searchSuggestions;
        this.resultsPerPage = resultsPerPage;

        counter = searchEngineSettingsCounter + 1;
        searchEngineSettingsCounter++;
    }

    public boolean getTrackHistory() {
        return trackHistory;
    }

    public boolean getAdPersonalization() {
        return adPersonalization;
    }

    public boolean getSafeBrowsing() {
        return safeBrowsing;
    }

    public boolean getSearchSuggestions() {
        return searchSuggestions;
    }

    public int getResultsPerPage() {
        return resultsPerPage;
    }

    public String setExplanation() {
        return "These settings affect how your searches are processed and what results are shown, " +
               "including personalization, security, and suggestion features.";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSearch Engine Settings #" + counter +
                "\nTrack History: " + trackHistory +
                "\nAd Personalization: " + adPersonalization +
                "\nSafe Browsing: " + safeBrowsing +
                "\nSearch Suggestions: " + searchSuggestions +
                "\nResults Per Page: " + resultsPerPage;
    }

}
