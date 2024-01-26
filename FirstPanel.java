import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class FirstPanel{

    public class User{
        // define variables
        private String Name, email, phoneNumber, altNumber, ID;

        // Create setters and getters
        public static void setName(String name){
            this.Name = name;
        }

        public static void setEmail(String email){
            this.email = email;
        }

        public static void setPhonenumber(String phonenum){
            this.phoneNumber = phonenum;
        }

        public static void setAltNumber(String number){
            this.altNumber = number;
        }

        public static void setID(String ID){
            this.ID = ID;
        }

        // getters
        

        // create constructor with parameters
        public User(String fname, String ID, String email, String phoneNumber, String altNumber){
            this.ID = ID
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

    public static void main(String[] args){

        // Set image icon
        ImageIcon logo = new ImageIcon("images/logo.png");
        ImageIcon loginImg = new ImageIcon("images/login.png");

        // Create border
        Border border = BorderFactory.createLineBorder(new Color(233, 211,199), 3);
        // Create Label
        JLabel label = new JLabel();
        label.setText("First  Label !!");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIcon(logo);
        label.setForeground(new Color(45,33,67));
        label.setFont(new Font("Algerian",Font.PLAIN, 20));
        label.setIconTextGap(-200);
        label.setBackground(new Color(233,33, 56));
        label.setBorder(border);
        label.setOpaque(true); // dsplay label bgcolor
        label.setVerticalAlignment(JLabel.TOP);

        // Create a frame

        JFrame frame = new JFrame();
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(233, 211,199)); // Set background colo
        frame.add(label);
        frame.setVisible(true);

        }
    }
