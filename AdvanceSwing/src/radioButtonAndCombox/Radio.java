package radioButtonAndCombox;

import javax.swing.JFrame;
import javax.swing.*;

public class Radio {

    JFrame f;

    Radio() {
        f = new JFrame();
        JRadioButton r1 = new JRadioButton("A) Male");
        JRadioButton r2 = new JRadioButton("B) FeMale");
        r1.setBounds(50, 100, 70, 30);
        r2.setBounds(50, 140, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(r1);
        f.add(r2);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Radio();
    }
}
