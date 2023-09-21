package abccollegeapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tim Dladla
 */
public class AbcCollegeApp {

    // Declare the scanner class for the user input
    public static Scanner userInput = new Scanner(System.in);

    public static int userOption;

    //Declare the Student class so i can use it fields and objects
    public static void main(String[] args) {

        // First menu the user will see
        int choice = 0;
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*******************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        System.out.print("\nType here: ");
        choice = userInput.nextInt();

        do {

            // Display Menu Screen 
            print_menuScreen(choice);

            // Declare the scanner class for the user input
            Scanner userInput = new Scanner(System.in);

            System.out.print("\nType here: ");
            userOption = userInput.nextInt();

            Student newStudent = new Student(userOption);
            // switch statement = is for the different options in the menu 
            switch (userOption) {
                case 1:

                    System.out.println("CAPTURE A NEW STUDENT");
                    System.out.println("************************************");

                    //User data entries
                    System.out.print("\nPlease enter in how many students you would like to capture: ");
                    int amountStudents = userInput.nextInt();
                    int count = 0;

                    while (count < amountStudents) {

                        System.out.print("Enter the student id: ");
                        int id = userInput.nextInt();
                        System.out.print("\nEnter the student name: ");
                        String name = userInput.next();
                        System.out.print("\nEnter the student age: ");
                        int age = userInput.nextInt();

                        // if statement - is for if the age is invalid meaning its less than 16 years of age
                        if (age < 16) {
                            System.out.println("You have entered a incorrect student age!!!");
                            System.out.println("Enter the student age >> ");
                            age = userInput.nextInt();
                        }

                        System.out.print("\nEnter the student email: ");
                        String email = userInput.next();
                        System.out.print("\nEnter the student course: ");
                        String course = userInput.next();

                        newStudent.SaveStudent(id, name, age, email, course,0);
                        newStudent.storeIds(id);
                        count++;
                    }

                    //System.out.println(newStudent.studentReport());
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    userOption = userInput.nextInt();
                    break;
                case 2:

                    System.out.print("\nEnter the student id to search: ");
                    int idSearch = userInput.nextInt();

                    int position = newStudent.searchStudent(idSearch); // gives the main method the position of element in the ArrayList
                    boolean validStudent = newStudent.checkValidSearchStudent(idSearch, position); // givess the main method vaildity if the student was found or not. In the form of (true or false)

                    //ArrayList<String> studentList = newStudent.getStudentList();

                    System.out.println("Position is arrayList: " + position);
                    // Display the correct student
                    System.out.println(newStudent.displaySearchStudent(position));
                    
                    System.out.println("Enter (1) to launch menu or any other key to exit");

                    if (validStudent == false) {
                        
                        System.out.println("Student with Student ID: " + idSearch + " was not found!");
                        System.out.println("------------------------------------------------------------");
                        System.out.println("Enter (1) to launch menu or any other key to exit");
                    }
                    
                    break;
                case 3:
                    //code
                    System.out.print("\nEnter the student id to delete: ");
                    int idToDelete = userInput.nextInt();
                    
                    System.out.println("\nAre you sure you want to delete student " + idToDelete + " from the system?(Y/N)");
                    System.out.print("\nType here: ");
                    String userConfirmation = userInput.next();
                    
                    if(userConfirmation.equalsIgnoreCase("y")){
                        // Call the delete method from the Student class
                        newStudent.deleteStudent(idToDelete);
                        
                        System.out.println("\nStudent with Student ID: " + idToDelete + " WAS deleted!");
                        System.out.println("\n-----------------------------------------------------------------------");
                        System.out.println("Enter (1) to lauch menu or any other key to exit");
                        userOption = userInput.nextInt(); 
                    }
                    else{
                        System.out.println("You choose 'N'.Enter (1) to lauch menu or any other key to exit" );
                        userOption = userInput.nextInt(); 
                     
                    }
                    break;
                  
                case 4:
                    //code
                    //Student newStudent = new Student();
                    System.out.println(newStudent.studentReport());

                    break;
                case 5:
                    //code
                    System.out.println(newStudent.exitStudentApplication());
                    break;
            }

        } while (userOption != 5);
    }

    public static void print_menuScreen(int launchApp) { // This method displays the menu screen to the user

        if (launchApp == 1) {
            System.out.println("Please select one of the following menu items");
            System.out.println("(1) Capture a new student.");
            System.out.println("(2) Search for a student.");
            System.out.println("(3) Delete a student.");
            System.out.println("(4) Print student report.");
            System.out.println("(5) Exit Application.");
            System.out.println("");
        } else if (launchApp == 5) {
            System.out.println("You didn't type 1. You have decided to exit the App. Come back soon!!");
            System.exit(0);
        } else {
            System.out.println("You didn't type 1. You have decided to exit the App. Come back soon!!");
            System.exit(0);
        }

    }
}
