import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    
    MyFrame(){


        ImageIcon image = new ImageIcon("logo.png");  //create a new image instance

        this.setSize(420,420); //sets x dimension and y dimensions 
        this.setTitle("Student Registration Form"); //sets the tittle

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the program on clicking exit button
        this.setResizable(false); //prevent the frame from being resizable
        this.setVisible(true); //sets visibility of the frame

        this.setIconImage(image.getImage()); //set image

    //    frame.getContentPane().setBackground(Color.GREEN); //set background color
          this.getContentPane().setBackground(new Color(123,50,250));
    }
}
