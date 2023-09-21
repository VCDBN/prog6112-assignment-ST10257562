/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelguestapp;

import java.util.Scanner;

/**
 *
 * @author Tim Dladla
 */
public class HotelGuestApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int capacity = 10; // Maximum number of guests
        String nameDefault = "";
        String idDefault = "";
        
        System.out.println("WELCOME TO THE HOTEL MANAGEMENT APP");
        System.out.print("\nEnter your name: ");
        String managerName = scanner.next();
        
        System.out.print("\nEnter in hotel password: (Numbers only REMEMBER)");
        int password = scanner.nextInt();
        
        
        HotelManager hotelManager = new HotelManager(managerName,password);
        
        
        Guest guests = new Guest(managerName, password,"",0);
        
        int guestCount = 0;
        boolean checkPassword = hotelManager.checkPassword(password);
        
        while (checkPassword) {
            guests.authorize();
            System.out.println("Hotel Guest System");
            System.out.println("1. Add Guest");
            System.out.println("2. Show Guest List");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    if (guestCount < capacity) {
                        System.out.print("\nEnter guest name: ");
                        String name = scanner.nextLine();
                        System.out.print("\nEnter guest ID: ");
                        int id = scanner.nextInt();
                        System.out.print("\nEnter in how many days you will be staying for (R200 per night): ");
                        int stayDays = scanner.nextInt();
                        
                        int price = stayDays * 200;
                        

                        new Guest(managerName, password,name,id);
                        guests.SaveGuest(id, name,stayDays,price);
                        guestCount++;
                        System.out.println("Guest added successfully!");
                    } else {
                        System.out.println("The hotel is fully booked.");
                    }
                    break;
                case 2:
                    System.out.println("Guest List:");
                    System.out.println(guests.guestReport());
                    break;
                case 3:
                    System.out.println("Exiting Hotel Guest System.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("You hotel password is wrong. Please try again.");
            }
        }
    
    }   
}
