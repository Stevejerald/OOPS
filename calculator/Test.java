import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");

        JLabel l1 = new JLabel("Enter the NUM1:");
        JLabel l2 = new JLabel("Enter The NUM2:");
        JLabel res = new JLabel("ANS:");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);

        JButton add_b = new JButton("+");
        JButton sub_b = new JButton("-");
        JButton mul_b = new JButton("*");
        JButton div_b = new JButton("/");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);

        panel.add(add_b);
        panel.add(sub_b);
        panel.add(mul_b);
        panel.add(div_b);

        panel.add(res);
        panel.add(new JLabel()); 

        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        MouseAdapter mouseListener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    JButton source = (JButton) e.getSource();

                    if (source == add_b) {
                        res.setText("ANS: " + (num1 + num2));
                    } else if (source == sub_b) {
                        res.setText("ANS: " + (num1 - num2));
                    } else if (source == mul_b) {
                        res.setText("ANS: " + (num1 * num2));
                    } else if (source == div_b) {
                        if (num2 != 0) {
                            res.setText("ANS: " + (num1 / num2));
                        } else {
                            res.setText("Error: Division by zero");
                        }
                    }
                } catch (NumberFormatException ex) {
                    res.setText("Error: Invalid input");
                }
            }
        };

        add_b.addMouseListener(mouseListener);
        sub_b.addMouseListener(mouseListener);
        mul_b.addMouseListener(mouseListener);
        div_b.addMouseListener(mouseListener);
    }
}
