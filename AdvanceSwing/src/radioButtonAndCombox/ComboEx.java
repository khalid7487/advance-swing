package radioButtonAndCombox;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboEx {

    JFrame f;

    ComboEx() {
        f = new JFrame();
        String[] country = {"Country","Bangladesh", "India", "China", "Nepal", "USA", "Newzeland"};
        JComboBox jb = new JComboBox(country);
        jb.setBounds(130, 100, 100, 30);
        f.add(jb);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboEx();
    }
}
