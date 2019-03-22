package boxLayout;

import java.awt.Dimension;

import javax.swing.*;

public class BoxLayoutEx extends JFrame {

    public BoxLayoutEx() {
        setTitle("Box Layout Example");
        setSize(150, 150);
        getContentPane().setLayout(
                new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JButton btn1=new JButton("Button 1");
        JButton btn2=new JButton("Button 2");
        JButton btn3=new JButton("Button 3");
        JButton btn4=new JButton("Button 4");
        getContentPane().add(btn1);
        //put some rigid space between the buttons 
        add(Box.createRigidArea(new Dimension(0, 5)));
        add(btn2);
        add(btn3);
        add(Box.createVerticalStrut(10));
        add(btn4);
        setVisible(true);
    }
    public static void main(String[] args) {
        BoxLayoutEx  b=new BoxLayoutEx();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
