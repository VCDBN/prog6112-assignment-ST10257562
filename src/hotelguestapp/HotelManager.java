/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelguestapp;

/**
 *
 * @author Tim Dladla
 */
public class HotelManager {
    
    public String name;
    public int password;
    private int validPassword = 1234;

    public HotelManager(String name, int password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public int getValidPassword() {
        return validPassword;
    }
    
    public boolean checkPassword(int password){
        
        boolean answer;
        
        if(password == validPassword){
            answer = true;
        }
        else{
            answer = false;
        }
        
        return true;
    } 
    
    public String toString() {
        return "Name: " + name;
    }
}
