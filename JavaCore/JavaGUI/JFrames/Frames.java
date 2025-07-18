package JavaCore.JavaGUI.JFrames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frames extends JFrame {

    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    Frames() {
        ImageIcon iiLogo = new ImageIcon("JavaCore/JavaGUI/Resources/star.png");

        JFrame frame = new JFrame(); // Создаем окно

        frame.setTitle("Programm"); // Название программы
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Размер
        frame.setVisible(true); // По умолчанию окно невидимо, поэтому надо выставлять
        frame.setResizable(false); // Убрать возможно масштабирования окна
        frame.setIconImage(iiLogo.getImage()); // Иконка приложения
        frame.getContentPane().setBackground(new Color(0xFFE5CC)); // Так мы задаем цвет окна (обязательно через ContentPane)

        /*
         * JFrame.HIDE_ON_CLOSE - спрятать окно
         * JFrame.DISPOSE_ON_CLOSE - уничтожить окно (не завершать приложение)
         * JFrame.EXIT_ON_CLOSE - завершить работу приложения
         * JFRAME.DO_NOTHING_ON_CLOSE - не делать ничего
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
