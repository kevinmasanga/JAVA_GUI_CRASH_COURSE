import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class FlowLayout {

    public static void main(String[] args){
        JFrame frame = new JFrame();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
