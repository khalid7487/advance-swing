package CardAndGridLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CardLayoutExample extends JFrame implements ActionListener {

    CardLayout card;
    JButton b1, b2, b3;
    Container c;

    CardLayoutExample() {
        c = getContentPane();
        //create CardLayout object with 40 hor space and 30 ver space
        card = new CardLayout(40, 30);
        c.setLayout(card);

        b1 = new JButton("A");
        b2 = new JButton("B");
        b3 = new JButton("C");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
    }

    public static void main(String[] args) {
        CardLayoutExample c1 = new CardLayoutExample();
        c1.setSize(400, 400);
        c1.setVisible(true);
        c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

}
