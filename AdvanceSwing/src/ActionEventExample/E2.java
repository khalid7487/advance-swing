package ActionEventExample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class E2 extends JFrame implements ActionListener {

    JButton btn, btn2;

    public E2() {
        setSize(400, 300);
        btn = new JButton("ok");
        btn2 = new JButton("Cancel");
        setLayout(new FlowLayout());
        getContentPane().add(btn);
        getContentPane().add(btn2);

        btn.addActionListener(this);
        btn2.addActionListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        E2 e2 = new E2();
        e2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            JOptionPane.showConfirmDialog(rootPane, "Hi");
            System.out.println("hello");
        }
        if (e.getSource() == btn2) {
            JOptionPane.showConfirmDialog(rootPane, "hello");
            System.out.println("hey");
        }
    }

}
