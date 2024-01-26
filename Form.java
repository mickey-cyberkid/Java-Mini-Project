import java.io.*;
import java.awt.*;
import javax.swing.*;


public class Form{

    private static JFrame frame;
    private static JPanel panel;
    private static JTextField Fullname;
    private static JTextField Email;
    private static JTextField phoneNumber;
    private static JTextField ID;
    private static JTextField altNumber;

    private static JLabel l_email;
    private static JLabel l_fname;
    private static JLabel l_phoneNum;
    private static JLabel l_ID;
    private static JLabel l_altNum;


    public static void main(String[] args){

        frame = new JFrame();
        panel = new JPanel();

        frame.setSize(422,433);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);


        panel.setLayout(null);

        l_fname = new JLabel("Full Name : ");
        l_email = new JLabel("Email : ");
        l_phoneNum = new JLabel("Phone Number : ");
        l_ID = new JLabel("ID Number : ");
        l_altNum = new JLabel("Alt Number : ");

        // set position of entries
        l_fname.setBounds(10, 20, 80, 15); // (x,y, width_from-frame, height)
        Fullname.setBounds(10, 70, 80, 15);
        l_email.setBounds(10, 40, 40, 30);

        // add entries to panel
        panel.add(l_fname);
        panel.add(Fullname);
        panel.add(l_email);
        frame.add(panel);
        frame.setVisible(true);
    }
}
