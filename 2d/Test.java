import javax.swing.*;
import java.awt.*;

public class Test {
    // Class to draw the rectangle
    static class DrawPanel extends JPanel {
        // Override the paintComponent method to draw the rectangle
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set the color for the rectangle
            g.setColor(Color.BLUE);

            // Draw the rectangle (x, y, width, height)
            g.fillRect(50, 50, 100, 50);  // x=50, y=50, width=100, height=50
        }
    }

    public static void main(String[] args) {
        // Create the frame for the GUI
        JFrame frame = new JFrame("RECTANGLE");
        frame.setSize(400, 400);  // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the drawing panel and add it to the frame
        DrawPanel panel = new DrawPanel();
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
