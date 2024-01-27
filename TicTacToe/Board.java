import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

import javax.swing.*;

public class Board implements ActionListener {

    private static JFrame frame;
    private static JPanel panel;
    private static JTextArea GameBoard;
    private static JButton Lock;
    private static int Lives = 7;
    private static int attempts = 0;

    public static void main(String[] args){

        GameBoard = new JTextArea();
        GameBoard.setBounds(20, 20, 300, 200);
        GameBoard.setBackground(new Color(222, 102, 165));

        Lock = new JButton("Check");
        Lock.setBounds(120, 260, 90, 30);
        Lock.addActionListener(new Board());
        Lock.setBackground(new Color(233,23,122));

        panel = new JPanel();
        panel.setBackground(new Color(213, 102, 23));
        panel.add(GameBoard);
        panel.add(Lock);
        panel.setLayout(null);

        frame = new JFrame("Board");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        frame.setVisible(true);
        
    }
    
    // function to modify the Display board
    public void modifyBoard(JTextArea GameBoard, int lives){
        String hang1 = """
                 +-------------+
                 |                 |
                                   |
                                   |
                                   |
                                   |
                                   |
                                   |
                                   |
              ===============
        """;

        String hang2 = """
                 +-------------+
                 |                 |
                 0                |
                                   |
                                   |
                                   |
                                   |
                                   |
                                   |
              ===============
        """;

        String hang3 = """
                 +-------------+
                 |                 |
                 0                 |
                 |                 |
                                   |
                                   |
                                   |
                                   |
                                   |
              ===============
        """;

        String hang4 = """
                 +-------------+
                 |                 |
                 0                 |
                 |                 |
                /                  |
                                   |
                                   |
                                   |
                                   |
              ===============
        """;

        String hang5 = """
                 +-------------+
                 |                 |
                 0                 |
                 |                 |
                /|                 |
                                   |
                                   |
                                   |
                                   |
              ===============
        """;

        String hang6 = """
                 +-------------+
                 |                 |
                 0                 |
                 |                 |
                /|\\                |
                                   |
                                   |
                                   |
                                   |
                                   |
              ===============
        """;

        String hang7 = """
                 +-------------+
                 |                 |
                 0                 |
                 |                 |
                /|\\                |
                 |                 |
                                   |
                                   |
                                   |
              ===============
        """;

        String hang8 = """
                 +-------------+
                 |                 |
                 0                 |
                 |                 |
                /|\\                |
                 |                 |
                / \\                |
                                   |
                                   |
              ===============
        """;

        if(lives == 1){
            GameBoard.setText(hang1);
        }
        else if(lives == 2){
            GameBoard.setText(hang2);
        }
        else if(lives == 3){
            GameBoard.setText(hang3);
        }
        else if(lives == 4){
            GameBoard.setText(hang4);
        }
        else if(lives == 5){
            GameBoard.setText(hang5);
        }
        else if(lives == 6){
            GameBoard.setText(hang6);
        }
        else if(lives == 7){
            GameBoard.setText(hang7);
        }
        else if(lives == 8){
            GameBoard.setText(hang8);
        }
        else{
            System.out.println("Still working ...");
        }
    }

    // other functions here
    // TODO: Create Neccessary Functions
    // function to load the array with the word
    // function to select one word from the array
    // function to check if the letter the user enetered is in the 

    @Override
    public void actionPerformed(ActionEvent e){
        // TODO: Create Neccessary game logics here 

        // Testing the modifyBoard Function ..
        modifyBoard(GameBoard, attempts);

        // incrementing the attempts so we can test all the cases 
        attempts += 1;
    }

}
