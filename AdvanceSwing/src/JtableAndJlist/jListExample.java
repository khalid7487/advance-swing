package JtableAndJlist;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class jListExample extends JFrame {

    JList list;
    String[] listColorNames = {"black", "blue", "green", "yellow", "white"};
    Color[] listColorValues = {Color.BLACK, Color.BLUE, Color.GREEN, Color.YELLOW,
         Color.WHITE};

    Container contentpane;

    public jListExample() {
        super("List Sourece Demo");
        contentpane = getContentPane();
        contentpane.setLayout(new FlowLayout());
        list = new JList(listColorNames);
        //list.setSelectedIndex(0);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        contentpane.add(new JScrollPane(list));

        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                contentpane.setBackground(listColorValues[list.getSelectedIndex()]);
            }
        });
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new jListExample();
    }
}
