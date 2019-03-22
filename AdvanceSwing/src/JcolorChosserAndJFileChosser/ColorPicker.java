package JcolorChosserAndJFileChosser;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ColorPicker extends JFrame {

    public ColorPicker() {
        super("JColorChooser Test Frame");
        setSize(400, 300);
        final Container contentPane = getContentPane();
        final JButton go = new JButton("show JColorChooser");
        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c;
                c = JColorChooser.showDialog(getContentPane(), "Demo", Color.BLUE);
                contentPane.setBackground(c);
            }
        });
        contentPane.add(go, BorderLayout.SOUTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorPicker();
    }

}
