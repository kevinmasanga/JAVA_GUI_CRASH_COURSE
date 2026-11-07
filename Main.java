import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;

public class Main{
    public static void main(String[] args){

        //JFrame
        JFrame frame = new JFrame(); //creates a frame
        ImageIcon image = new ImageIcon("logo.png");  //create a new image instance
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3); //creating a border

        ImageIcon labelIcon = new ImageIcon("logo.png");
        frame.setSize(500,500); //sets x dimension and y dimensions
        frame.setTitle("Student Registration Form"); //sets the tittle

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the program on clicking exit button
        // frame.setResizable(false); //prevent the frame from being resizable
        frame.setIconImage(image.getImage()); //set image

        frame.getContentPane().setBackground(Color.WHITE); //set background color
        //   frame.getContentPane().setBackground(new Color(0,0,0));

        //   new MyFrame();

        //JLabel

        JLabel label = new JLabel();
        label.setText("Hello Student");

        frame.add(label);
        label.setIcon(labelIcon);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(10); //gap from the icon image
        label.setBackground(Color.BLACK); //set label background
        label.setOpaque(true);//make the background color work
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of the text and icon  with the label
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,350,350); //manually setting out the layout

        //frame.setLayout(null); //manually set the label

        //frame.pack();
        frame.setVisible(true); //sets visibility of the frame
    }
}