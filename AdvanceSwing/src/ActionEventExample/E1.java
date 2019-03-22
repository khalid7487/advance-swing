package ActionEventExample;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class E1 extends JFrame {

    JButton btn, btn1;
    
    public E1() {
        btn = new JButton("Ok");
        btn1 = new JButton("cancel");
        setSize(300, 200);
        setLayout(new FlowLayout());
        getContentPane().add(btn);
        getContentPane().add(btn1);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Hello");
            }
        });
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "New Massage", "New Title", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        E1 e = new E1();
        e.setVisible(true);
    }
    
}
