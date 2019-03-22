
package AddingComponent;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class JLableFontForground {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("JLable Testformate");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("First Name");
        label.setFont(new Font("Courier New", Font.ITALIC + 1, 14));//here 1 means BOLD
        label.setForeground(Color.BLUE);
        /*since the default of opaque is false for JLabel
        *If true the component paints every pixel within its bounds.
        *otherwise, the component may not paint some or all its pixels
        *allowing the underlying pixels to show  through. */
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        frame.add(label);
        String htmlText="<html><p><font color=\"#800080\" "
                + "size=\"5\" face=\"Verdana\"> HTML in JLabel </font> </p>"
                +"<font size=\"5\"><u>"
                + "underline is possible</u><br><b>and BOLD too</b></font>"
                + "</html>";
        JLabel lbl=new JLabel(htmlText);
        frame.add(lbl);
        frame.setSize(200, 300);
        frame.setVisible(true);
                
    }
}
