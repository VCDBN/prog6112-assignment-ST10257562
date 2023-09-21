package hotelguestapp;

import java.util.ArrayList;
import java.util.Scanner;

// Base class for Guest
public class Guest extends HotelManager {
    
    public String guestName;
    public int id;
    public boolean isAuthorized;
    
    // Declare the arrayList for the storage of user entries
    public static ArrayList <String> guestList = new ArrayList<>();


    public Guest(String name, int password, String guestName, int id) {
        
        super(name,password);
        this.guestName = guestName;
        this.id = id;
        this.isAuthorized = false;
        
    }

    public Guest(String name, int password) {
        super(name, password);
    }

    public String SaveGuest(int id, String name, int stayDays, int price){
        // This method is used to capture a new guest

        
            String message = "";
            String temp = "";
            int position = 0;
            
            temp = "\nGUEST "
                 + "\n----------------------------------------------------------------------"
                 + "\nGUEST ID: " + id
                 + "\nSTUDENT NAME: " + name
                 + "\nDAYS STAYING: " + stayDays
                 + "\nPRICE: R" + price   
                 + "\n----------------------------------------------------------------------";   
            
            guestList.add(position,temp);
            position++;

            if(guestList.size() >= 0){
                message = "You have successfully captured the guest";
            }
            else{
                message = "You have not successfully captured the guest";
            }
        
        return message;
    }
    
    public boolean isIsAuthorized() {
        return isAuthorized;
    }

    public String getName() {
        return guestName;
    }

    public int getId() {
        return id;
    }
    
    public String guestReport(){
        //This method displays the student report. Prints out the arrayList
        
        int count = 0;
        String temp = "";
        
        while (count < guestList.size()){
            temp += guestList.get(count);
            count++;
        }
        
        return temp;
    }

    public String toString() {
        String temp;
        
        temp = "\nGUEST LIST"
              +"\n----------------------------------------------"
              +"\nGuest name: " + getName()
              +"\nID: " + getId();
        return temp;
    }

    public boolean isAuthorized() {
        return isAuthorized();
    }

    public void authorize() {
        isAuthorized = true;
    }
    
}

