package JcolorChosserAndJFileChosser;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class SimpleFileChooser extends JFrame {
    
    public SimpleFileChooser() {
        super("File Chooser Test Frame");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");
        JButton dirButton = new JButton("Pick Dir");
        final JLabel statusbar = new JLabel("Output of your selection will go here");
        c.add(openButton);
        c.add(saveButton);
        c.add(dirButton);
        c.add(statusbar);
        setVisible(true);
        //Create a file chooser that opens up as an Open dialog
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.setMultiSelectionEnabled(true);
                int option = chooser.showOpenDialog(SimpleFileChooser.this);
                System.out.println(option);
                if (option == JFileChooser.APPROVE_OPTION) {
                    File[] sf = chooser.getSelectedFiles();
                    String filelist = "nothing";
                    if (sf.length > 0) {
                        filelist = sf[0].getName();
                    }
                    for (int i = 1; i < sf.length; i++) {
                        filelist += ", " + sf[i].getName();
                    }
                    statusbar.setText("You chose " + filelist);
                } else {
                    statusbar.setText("you Canceled");
                }
            }
        });

        //create a file chooser that opens up as a save dialog
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int option = chooser.showSaveDialog(SimpleFileChooser.this);
                if (option == JFileChooser.APPROVE_OPTION) {
                    statusbar.setText("You Saved " + ((chooser.getSelectedFile() != null)
                            ? chooser.getSelectedFile().getName() : "nothing"));                    
                } else {
                    statusbar.setText("you canceled.");
                }
                
            }
        });
        dirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser=new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int option=chooser.showOpenDialog(SimpleFileChooser.this);
                if(option==JFileChooser.APPROVE_OPTION){
                    statusbar.setText("you opened "+((chooser.getSelectedFile()!=null)?
                            chooser.getSelectedFile().getName():"nothing"));
                }
                else{
                    statusbar.setText("You canceled.");
                }    
            }
        });
    }
    
    public static void main(String[] args) {
        new SimpleFileChooser();
    }
}
