package boxLayout;

import java.awt.Dimension;
import javax.swing.*;

public class BoxLayoutEx2 extends JFrame {

    public BoxLayoutEx2() {
        JPanel basic = new JPanel();
        basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
        add(basic);

        basic.add(Box.createVerticalGlue());
        JPanel bottom = new JPanel();
        bottom.setAlignmentX(1f);
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));

        JButton ok = new JButton("Ok");
        JButton close = new JButton("Close");

        bottom.add(ok);
        bottom.add(Box.createRigidArea(new Dimension(5, 0)));
        bottom.add(close);
        bottom.add(Box.createRigidArea(new Dimension(15, 0)));
        
        basic.add(bottom);
        //put some space between the bottom panel and the border of the window
        basic.add(Box.createRigidArea(new Dimension(0, 15)));
        setTitle("Two Buttons");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            BoxLayoutEx2 b=new BoxLayoutEx2();
                b.setVisible(true);
            }
        });
    }

}
