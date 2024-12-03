import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Userauth{
    public static void main(String[] args) {
        JFrame frame = new JFrame("User Authentication");

        //userid
        JLabel l1 = new JLabel("Enter User ID:");
        JTextField t1 = new JTextField(10);

        //password

        JLabel l2 = new JLabel("Enter Your Password:");
        JPasswordField t2 = new JPasswordField(10);

        //Button
        JButton b1 = new JButton("LOGIN");

        JPanel panel = new JPanel(new GridLayout(3,2,8,8));
                                    //  GridBagLayout(R,C,H,W)
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(b1);

        frame.add(panel);

        frame.setSize(600,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String Username = t1.getText();
                String Password = new String(t2.getPassword());

                if(Username.equals("Steve") && Password.equals("123")){
                    JOptionPane.showMessageDialog(frame,"Login Sucessfull");
                }
                else if(Username.equals("Admin") && Password.equals("Admin@123")){
                    JOptionPane.showMessageDialog(frame, "Login Sucess");
                }
                else{
                    JOptionPane.showMessageDialog(frame, "Incorrect Creadentials");
                }
            }
        });
    }
}