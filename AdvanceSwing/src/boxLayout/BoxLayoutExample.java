package boxLayout;

import javax.swing.*;

public class BoxLayoutExample extends JFrame {

    JButton buttons[];

    public BoxLayoutExample() {
        buttons = new JButton[5];
        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("Button" + (i + 1));
            add(buttons[i]);
        }
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        BoxLayoutExample b=new  BoxLayoutExample();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
