import java.awt.*;
import javax.swing.*;

public class Test{
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Authentication");
        JLabel l1 = new JLabel("Enter User Id:");
        JTextField t1 = new JTextField(25);
        JLabel l2 = new JLabel("Enter your Password:");
        JPasswordField t2 = new JPasswordField();

        JButton b1 = new JButton("Login");

        JPanel panel = new JPanel(new GridLayout(3,2));
        
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(b1);

        frame.add(panel);

        frame.setSize(500,500);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}