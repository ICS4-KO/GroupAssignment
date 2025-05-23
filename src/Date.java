/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Defines the variables and methods of a Date object in Settings Simulator app that is used to store the user's birthday
 * 
 * @author   Kimi Ong
 * @version  1.0
 * @since    2025-04-29
 */
public class Date {
    //Instance variables
    private int day; //Day of birthday
    private int month; //Month of birthday
    private int year; //Year of birthday
    
    /**
     * This constructor creates an instance of the Date class with parameters for the day, month, and year attributes that are set by the user
     * 
     * @param day   //This is the value the day attribute is assigned
     * @param month //This is the value the month attribute is assigned
     * @param year  //This is the value the year attribute is assigned
     */
    Date(int month, int day, int year) {
        this.month = month; //Set value of the month attribute
        this.day = day; //Set value of the day attribute
        this.year = year; //Set value of the year attribute
    }
    
    /**
     * This getter method returns the month of the user's birthday
     * 
     * @return  Returns month attribute of a Date object 
     */
    public int getMonth() {
        return month;
    }
    
    /**
     * This method returns a formatted string of a Date object's attributes
     * 
     * @return  This returns a String representation of a Date object
     */
    public String toString() {
        return day + "/" + month + "/" + year;
  }

}
