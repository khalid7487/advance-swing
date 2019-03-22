package JcolorChosserAndJFileChosser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MYfilterChooser extends JFrame {

    public MYfilterChooser() {
        super("File Chooser Test Frame");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton openButton = new JButton("Open");
        final JLabel statusbar = new JLabel("Out of your selection will go here");
        c.add(openButton);
        c.add(statusbar);
        setVisible(true);
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] pics = new String[]{"gif", "jpg", "tif"};
                String[] audios = new String[]{"au", "aiff", "wav"};
                JFileChooser chooser = new JFileChooser();
                System.out.println("0");
                chooser.addChoosableFileFilter(new SimpleFileFilter(pics,
                        "Images (*.gif,*.jpg,*.tif)"));

                chooser.addChoosableFileFilter(new SimpleFileFilter(".MOV"));
                chooser.addChoosableFileFilter(new SimpleFileFilter(audios,
                        "Sounds (*.aiff,*.au,*.wav)"));
                int option = chooser.showOpenDialog(MYfilterChooser.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    if (chooser.getSelectedFile() != null) {
                        statusbar.setText("You chose "
                                + chooser.getSelectedFile().getName());
                    } else {
                        statusbar.setText("you Canceled");
                    }
                }

            }
        });

    }

    public static void main(String[] args) {
        new MYfilterChooser();
    }

}
