package AddingComponent;

import java.awt.Color;
import javax.swing.*;

public class TextAreaexample {

    JTextArea area;
    JLabel lbl;
    JFrame f;

    TextAreaexample() {
        f = new JFrame();
        area = new JTextArea(300, 300);
        lbl = new JLabel("Enter Text");
        area.setBounds(10, 30, 300, 300);
        lbl.setBounds(10, 10, 100, 20);

        area.setBackground(Color.DARK_GRAY);
        area.setForeground(Color.white);
        area.setCaretColor(Color.RED);
        lbl.setForeground(Color.RED);

        f.add(area);
        f.add(lbl);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TextAreaexample();
    }
}
