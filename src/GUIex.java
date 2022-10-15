/**
 * @author Yunmeng Zhang
 * @version 2022.1
 * @date 2022/10/10 19:09
 */

import java.awt.*;
import javax.swing.*;

public class GUIex {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Demo");
        JButton button = new JButton("Press Me");

        frame.getContentPane().add(button, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}