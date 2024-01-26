import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class Main{

    public static void main(String[] args){
        // Create a frame

        JFrame frame = new JFram e();
        frame.setTitle("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500,500);
        frame.setVisible(true);

        // Set image icon
        ImageIcon image = new ImageIcon("images/login.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(233, 211,199)); // Set background color
        
        
        }
    }
