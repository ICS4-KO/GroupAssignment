import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343330528
 */
public class Friends {
    //Instance variables
    private ArrayList<String> friendsList; //Array list of user's friends
    
    /**
     * 
     */
    public Friends() {
        friendsList = new ArrayList<String>();
    }
    
    public void addFriend(String friend) {
        friendsList.add(friend);
    }
    
    public void removeFriend(String friend) {
         if (friendsList.contains(friend)) 
            friendsList.remove(friend);
    }

}
