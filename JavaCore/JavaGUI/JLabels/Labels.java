package JavaCore.JavaGUI.JLabels;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("JavaCore/JavaGUI/Resources/star.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);

        JLabel label = new JLabel();
        label.setText("Do you even code?");
        label.setIcon(image);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(-256);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 100, 550, 550);
        
        JFrame frame = new JFrame(); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.add(label);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(0xFFE5CC));
        frame.pack();
    }
}
