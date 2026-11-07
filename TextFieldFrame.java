import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame implements ActionListener {

    JButton button;
    JTextField textField;
    TextFieldFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
//        this.pack();
        this.setSize(500,500);


        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 25));
        textField.setText("username");

        button = new JButton("submit");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBounds(50,100,250,40);
        button.setBackground(Color.GREEN);
        button.setForeground(Color.WHITE);

        this.add(textField);
        this.add(button);


        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println(textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }
    }
}
