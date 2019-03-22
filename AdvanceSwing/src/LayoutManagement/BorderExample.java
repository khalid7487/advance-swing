package LayoutManagement;

import javax.swing.*;
import java.awt.*;

public class BorderExample {

    JFrame f;

    BorderExample() {
        f = new JFrame("Border Layout Example");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6=new JButton("6");
        JPanel npanel = new JPanel();
        npanel.setLayout(new FlowLayout());
        npanel.add(b1);
        npanel.add(b6);
        f.setLayout(new BorderLayout(10, 10));
        f.add(npanel, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);  
        f.setSize(350,350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BorderExample();
    }
}
