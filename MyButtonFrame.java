import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    MyButtonFrame() {

        // Resize the image to 100 × 100 pixels
        ImageIcon originalIcon = new ImageIcon("tu.jpg");
        Image scaledImage = originalIcon.getImage().getScaledInstance(
                100, 100, Image.SCALE_SMOOTH
        );

        ImageIcon icon = new ImageIcon(scaledImage);

        label = new JLabel();
        button = new JButton();
        button.setBounds(200,100,100,50);
        button.addActionListener(this);
        button.setText("Click");
        button.setFocusable(false);
        button.setForeground(Color.WHITE);
        button.setBackground(Color.GREEN);
        button.setBorder(BorderFactory.createEtchedBorder());
//        button.setEnabled(false);

        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);

        this.add(button);
        this.add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
//            System.out.println("Hello world");
            label.setVisible(true);
        }


    }
}
