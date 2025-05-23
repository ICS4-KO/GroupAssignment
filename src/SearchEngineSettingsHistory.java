import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *This is a class that displays the previous Search Engine Setting
 * @author Jojo
 * @version 1.0
 * @since 2025-05-23
 */
public class SearchEngineSettingsHistory extends javax.swing.JFrame {
    //Define methods
    
    /**
     * This method iterates through all of the previously set settings objects (game/search engine/social media) of the currently 
     * logged in user account and adds each search engine settings object to the search engine settings history combo box
     * 
     * @param settingsArray  Instance variable of the current User object storing all of their previous setting configurations
     */
    private void setSearchEngineHistoryComboBox(ArrayList<BasicSettings> settingsArray) {
        //Clear all items in search engine settings history combo box before adding updated set of settings objects as items
        searchEngineHistoryComboBox.removeAllItems(); //Clear game settings history

                
        //Iterate through each BasicSettings object in the array list of BasicSettings
        for (BasicSettings settings : settingsArray) {
            //Check if the BasicSettings object's instance type is SearchEngineSettings so that it can downcast
            if (settings instanceof SearchEngineSettings)
                //Downcast BasicSettings object to SearchEngineSettings object, add to search engine settings history combo box
                searchEngineHistoryComboBox.addItem((SearchEngineSettings) settings);
        } //End for loop iterating through array list of settings objects
    }
    

    /**
     * Creates new form SearchEngineSettingsHistory
     */
    public SearchEngineSettingsHistory() {
        initComponents();
        
        //Set top label to display logged-in account's username
        usernameLabel.setText(HomeScreen.currentUser.getUsername() + "'s Search Engine Settings History");
        
        //Set items in search engine history settings combo box
        setSearchEngineHistoryComboBox(HomeScreen.currentUser.getSettings());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchEngineHistoryComboBox = new javax.swing.JComboBox<>();
        usernameLabel = new javax.swing.JLabel();
        notificationsLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        microphoneLabel = new javax.swing.JLabel();
        trackHistoryLabel = new javax.swing.JLabel();
        adPersonalizationLabel = new javax.swing.JLabel();
        safeBrowsingLabel = new javax.swing.JLabel();
        resultsPerPageLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchEngineHistoryComboBox.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        searchEngineHistoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEngineHistoryComboBoxActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        usernameLabel.setText("User's Search Engine Settings History");

        notificationsLabel.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        notificationsLabel.setText("Notifications On:");

        locationLabel.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        locationLabel.setText("Location On:");

        microphoneLabel.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        microphoneLabel.setText("Microphone On:");
        microphoneLabel.setToolTipText("");

        trackHistoryLabel.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        trackHistoryLabel.setText("Track History On:");

        adPersonalizationLabel.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        adPersonalizationLabel.setText("Ad Personalization On:");

        safeBrowsingLabel.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        safeBrowsingLabel.setText("Safe Browsing On:");

        resultsPerPageLabel.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        resultsPerPageLabel.setText("Results per Page:");

        returnButton.setFont(new java.awt.Font("Hiragino Sans", 0, 12)); // NOI18N
        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(returnButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(locationLabel)
                                .addComponent(notificationsLabel)
                                .addComponent(microphoneLabel)
                                .addComponent(trackHistoryLabel)
                                .addComponent(adPersonalizationLabel)
                                .addComponent(safeBrowsingLabel)
                                .addComponent(resultsPerPageLabel)
                                .addComponent(searchEngineHistoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(usernameLabel)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(usernameLabel)
                .addGap(26, 26, 26)
                .addComponent(searchEngineHistoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(notificationsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(locationLabel)
                .addGap(12, 12, 12)
                .addComponent(microphoneLabel)
                .addGap(34, 34, 34)
                .addComponent(trackHistoryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adPersonalizationLabel)
                .addGap(18, 18, 18)
                .addComponent(safeBrowsingLabel)
                .addGap(18, 18, 18)
                .addComponent(resultsPerPageLabel)
                .addGap(29, 29, 29)
                .addComponent(returnButton)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchEngineHistoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEngineHistoryComboBoxActionPerformed
        //Retrieve the current selected item (SearchEngineSettings object) from the combo box when the user clicks on an item
        SearchEngineSettings selectedSearchEngineSettingsVersion = (SearchEngineSettings) searchEngineHistoryComboBox.getSelectedItem();
        
        //Display the selected SearchEngineSettings object's notifications attribute in the corresponding text field
        notificationsLabel.setText("Notifications: " + selectedSearchEngineSettingsVersion.getAllowNotifications());
        //Display the selected SearchEngineSettings object's location sharing attribute in the corresponding text field
        locationLabel.setText("Location: " + selectedSearchEngineSettingsVersion.getLocationSharing());
        //Display the selected SearchEngineSettings object's microphone access attribute in the corresponding text field
        microphoneLabel.setText("Microphone: " + selectedSearchEngineSettingsVersion.getMicrophoneAccess());

        //Display the selected SearchEngineSettings object's track history attribute in the corresponding text field
        trackHistoryLabel.setText("Track History: " + selectedSearchEngineSettingsVersion.getTrackHistory());
        //Display the selected SearchEngineSettings object's ad personalization attribute in the corresponding text field
        adPersonalizationLabel.setText("Ad Personalization: " + selectedSearchEngineSettingsVersion.getAdPersonalization());
        //Display the selected SearchEngineSettings object's safe browsing attribute in the corresponding text field
        safeBrowsingLabel.setText("Safe Browsing: " + selectedSearchEngineSettingsVersion.getMicrophoneAccess());
        //Display the selected SearchEngineSettings object's results per page attribute in the corresponding text field
        resultsPerPageLabel.setText("Results per Page: " + selectedSearchEngineSettingsVersion.getResultsPerPage());
    }//GEN-LAST:event_searchEngineHistoryComboBoxActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        //Return to settings screen after user finishes looking at previous search engine settings
        new SettingsScreen().setVisible(true); //Show settings screen frame
        this.setVisible(false); //Hide current frame (search engine settings history)
    }//GEN-LAST:event_returnButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchEngineSettingsHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEngineSettingsHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEngineSettingsHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEngineSettingsHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEngineSettingsHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adPersonalizationLabel;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel microphoneLabel;
    private javax.swing.JLabel notificationsLabel;
    private javax.swing.JLabel resultsPerPageLabel;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel safeBrowsingLabel;
    private javax.swing.JComboBox<SearchEngineSettings> searchEngineHistoryComboBox;
    private javax.swing.JLabel trackHistoryLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
