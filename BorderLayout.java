
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;

public class BorderLayout {

    public static void main(String[] args) {

        // Create JFrame
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set BorderLayout as the layout manager
        frame.setLayout(new java.awt.BorderLayout(10,0));

        frame.setSize(500, 500);

        // Create five panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        // Set background colors
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.MAGENTA);
        panel5.setBackground(Color.BLUE);

        // Set preferred dimensions
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));


        //adding panels inside panel 5
        panel5.setLayout(new java.awt.BorderLayout());

        // Create five panels
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();

        panel6.setPreferredSize(new Dimension(50, 50));
        panel7.setPreferredSize(new Dimension(50, 50));
        panel8.setPreferredSize(new Dimension(50, 50));
        panel9.setPreferredSize(new Dimension(50, 50));
        panel10.setPreferredSize(new Dimension(50, 50));



        // Add panels to their respective regions
        frame.add(panel1, java.awt.BorderLayout.NORTH);
        frame.add(panel2, java.awt.BorderLayout.SOUTH);
        frame.add(panel3, java.awt.BorderLayout.EAST);
        frame.add(panel4, java.awt.BorderLayout.WEST);
        frame.add(panel5, java.awt.BorderLayout.CENTER);


        panel6.setBackground(Color.darkGray);
        panel7.setBackground(Color.GRAY);
        panel8.setBackground(Color.lightGray);
        panel9.setBackground(Color.cyan);
        panel10.setBackground(Color.PINK);

        panel5.add(panel6,java.awt.BorderLayout.NORTH);
        panel5.add(panel7,java.awt.BorderLayout.SOUTH);
        panel5.add(panel8,java.awt.BorderLayout.EAST);
        panel5.add(panel9,java.awt.BorderLayout.WEST);
        panel5.add(panel10,java.awt.BorderLayout.CENTER);

        // Display the frame
        frame.setVisible(true);
    }
}
