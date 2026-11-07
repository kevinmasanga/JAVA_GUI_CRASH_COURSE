import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;

public class FlowLayout {

    public static void main(String[] args){
        JFrame frame = new JFrame();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 10));
        frame.setSize(500,500);

        JPanel panel = new JPanel();
        panel.setLayout(new java.awt.FlowLayout());
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.lightGray);

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
