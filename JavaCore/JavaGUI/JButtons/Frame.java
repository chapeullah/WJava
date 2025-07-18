package JavaCore.JavaGUI.JButtons;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Frame extends JFrame implements ActionListener {

    JButton button;

    Frame() {
        button = new JButton();
        button.setBounds(0, 0, 300, 300);
        button.setText("Нажми на меня!");
        button.setFocusable(false);
        button.addActionListener(e -> {
            System.out.println("Привет!");
            System.out.println("Пока!");
            button.setEnabled(false);
        });

        // Не работает без иконки .setIcon()
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.TOP);

        button.setFont(new Font("Comic Sans", Font.BOLD, 25));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500); 
        this.setVisible(true);

        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Привет");
        }
    }
}
