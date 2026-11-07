import javax.swing.*;
import java.awt.*;

public class Panel {

    public static void main(String[] args){
        JFrame frame = new JFrame();
        JPanel redPanel = new JPanel(); //JPanel is a Gui component that functions as container to hold other components
        JLabel label = new JLabel();
        ImageIcon originalIcon = new ImageIcon("tu.jpg");

       // Resize the image to 100 × 100 pixels
        Image scaledImage = originalIcon.getImage().getScaledInstance(
                100, 100, Image.SCALE_SMOOTH
        );

        ImageIcon icon = new ImageIcon(scaledImage);


        //set background to rd
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);

        JPanel bluePanel = new JPanel();
        //set background to blue
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0,250,250);


        JPanel greenPanel = new JPanel();

        //set background to rd
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout((LayoutManager) new BorderLayout());


        //add label to it
        label.setText("Hi");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.TOP);
//        label.setBounds(0,0,30,30);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);

        //add panel to the frame
        frame.add(redPanel);

        frame.add(bluePanel);
        frame.add(greenPanel);
        greenPanel.add(label);
        frame.setVisible(true);

    }
}
