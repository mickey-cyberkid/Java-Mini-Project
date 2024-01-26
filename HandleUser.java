//Authors : [] , []
// About : Help desk for students

import java.awt.Color;
import java.awt.Font;
import java.util.Scanner;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class HandleUser{

    public static class User{
        // define variables
        private static String Name, email, phoneNumber, altNumber, ID;

        // Create setters and getters
        public void setName(String name){
            this.Name = name;
        }

        public void setEmail(String email){
            this.email = email;
        }

        public void setPhonenumber(String phonenum){
            this.phoneNumber = phonenum;
        }

        public void setAltNumber(String number){
            this.altNumber = number;
        }

        public void setID(String ID){
            this.ID = ID;
        }

        // getters
        public String[] getDetails(){
            String[] Details = {this.ID, this.Name, this.email, this.phoneNumber, this.altNumber};
            return Details;
        }


        // create constructor with parameters
        public User(String fname, String ID, String email, String phoneNumber, String altNumber){
            this.ID = ID;
            this.Name = fname;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.altNumber = altNumber;
        }

        // create empty constructor for uninitialized objects
        // we will use setters for any object created with this constructor
        public User(){

        }
    }

    // function to display user details in console
    public static void displayDetails(String[] Details){
        System.out.println("===========[user info]=========");
        for(String detail : Details){
            System.out.print("|"+detail);
        }
        System.out.println("");
    }

    public static void main(String[] args){
         // GUI STUFF GOES HERE

         // testng User class
         Scanner input = new Scanner(System.in);
         String[] Details;
         User student = new User("1","2","3","4","5");
         Details = student.getDetails();
         displayDetails(Details);

        }
    }
