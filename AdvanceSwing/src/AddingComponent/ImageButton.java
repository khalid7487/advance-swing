
package AddingComponent;

import javax.swing.*;

public class ImageButton {

    ImageButton() {
        JFrame f=new JFrame();
        ImageIcon ic=new ImageIcon(getClass().getResource("close.png"));
        JButton b=new JButton("Close",ic);
        b.setBounds(0, 0, 512, 512);
        f.add(b);
        f.setSize(800,800);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new ImageButton();
    }
    
}
