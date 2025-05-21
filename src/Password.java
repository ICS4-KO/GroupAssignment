/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jojox
 * @version 1.0
 */
public class Password {
    private double passWordStrength;
    private String password;

    public Password(String password){
        this.password = password;
    }
    public boolean checkPasswordStrength(){
        if (password.length() < 6) return false;

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)){
                hasLetter = true;
            }
            else if (Character.isDigit(c)){
                hasDigit = true;
            }
            else if ("!@#$%".indexOf(c) >= 0){
                hasSpecial = true;
            }
        }

        return hasLetter && hasDigit && hasSpecial;
    }

    public String getPassword() {
        return password;
    } 
}