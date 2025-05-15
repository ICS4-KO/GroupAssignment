/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 343330528
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
    Date(int day, int month, int year) {
        this.day = day; //Set value of the day attribute
        this.month = month; //Set value of the month attribute
        this.year = year; //Set value of the year attribute
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
