package JavaCore.JavaGUI.JPanels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Panels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("JavaCore/JavaGUI/Resources/star.png");

        Image scaleImage = image.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaleImage);

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);

        JPanel redPanel = addPanel(0, 0, 250, 250, Color.RED);
        JPanel bluePanel = addPanel(250, 0, 250, 250, Color.BLUE);
        JPanel greenPanel = addPanel(0, 250, 500, 250, Color.GREEN);
        
        greenPanel.setLayout(new BorderLayout());
        /* 
        bluePanel.setLayout(new BorderLayout());
        redPanel.setLayout(new BorderLayout());
        */
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        greenPanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }

    private static JPanel addPanel(
        int x, int y, int width, int height, Color color
    ) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setBounds(x, y, width, height);
        return panel;
    }
}
