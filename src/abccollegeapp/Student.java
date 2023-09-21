
package abccollegeapp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is the Student class and will contain all your working methods
 * @author Tim Dladla
 */
public class Student {
    
    // Declare the arrayList for the storage of user entries
    public static ArrayList <String> studentList = new ArrayList<>();
    
    // Declare an id array to hold the id numbers of students
    public static int [] ids = new int[100];
    int idsArrSize;
        
        
    // Field used for the user entry for when the menu is displayed
    public int userOption;
    
    // Field used to show the positon of an element in an array
    int position;
    
    
    //Fields used to store each user data entry
    public int id;
    public String name;
    public int age;
    public String email;
    public String course;
      
    
    
    public Student(int userOption){
        //Constructor

        this.userOption = userOption;
    }
    
    public String SaveStudent(int id, String name, int age, String email, String course,int count){
        // This method is used to capture a new student
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
        
            String message = "";
            String temp = "";
            int position = 0;
            
            temp = "\nSTUDENT "
                 + "\n----------------------------------------------------------------------"
                 + "\nSTUDENT ID: " + id
                 + "\nSTUDENT NAME: " + name 
                 + "\nSTUDENT AGE: " + age 
                 + "\nSTUDENT EMAIL: " + email
                 + "\nSTUDENT COURSE: " + course 
                 + "\n-----------------------------------------------------------------------";   
            
            studentList.add(position,temp);
            position++;

            if(studentList.size() >= 0){
                message = "You have successfully captured the student";
            }
            else{
                message = "You have not successfully captured the student";
            }
        
        return message;
    }
    public int storeIds(int id){
        // This method is used to store the id numbers of the students
        
        int count = 0;
 
        ids[count] = id;
        count++;
        idsArrSize++;
        
      return 1;
    }
    
    public int searchStudent(int searchId){
        // This method is used to search for the student that is needed by the user. the method returns the position in the arrayList
        
        int position = 0;
        int finalPosition = 0;

        // while statement = is to check if the id entered in by the user matches anyone in our system
        while(position < studentList.size()){
            
            if(searchId == ids[position]){
                
                finalPosition = position;
            } 
            
            position++;
        }
        
        return finalPosition;
    }
    
    public boolean checkValidSearchStudent(int searchId, int position){
        // This method is used to search for the student id. A boolean variable is passed to the main method depending if is was found or not (True or false)
        boolean answer = false;
        int count = 0;
        
        while(count < studentList.size()){
            
            // if statement = is to double check if the id was found
            if(searchId == ids[position]){
                answer = true;
                return answer;
            }

            
            count++;
        }
        
            if(answer = false){
                answer = false;
                
            }

        return answer;
    }
    
    public String deleteStudent(int deleteId){
        // This method is used to delete a student from the arrayList
        
        String message = "";
        int count = 0;
        
        while(count <studentList.size()){
            
            if(deleteId == ids[count]){
                studentList.remove(count);
                message = "User successfully deleted";
                count++;
            }
        }
        
        return "User successfully deleted";
    }
    
    public String studentReport(){
        //This method displays the student report. Prints out the arrayList
        
        int count = 0;
        String temp = "";
        
        while (count < studentList.size()){
            temp += studentList.get(count);
            count++;
        }
        
        return temp;
    }
    
    public String displaySearchStudent(int position){
        // This method will display the search student that the user is looking for
        
        String temp = "";
        
      
        temp = studentList.get(position);
        
        
        return temp;
    }
    
    public String exitStudentApplication(){
        //This method is used to when the user is exiting the application
        
        String message = "You have decided to exit the App. Come back soon!!";
        return message;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
    
    public ArrayList<String> getStudentList() {
        return studentList;
    }
        
}
