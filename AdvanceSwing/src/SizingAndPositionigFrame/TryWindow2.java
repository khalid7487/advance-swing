package SizingAndPositionigFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryWindow2 {

    //Using ToolKit class
    static JFrame aWindow = new JFrame("This is the Window Title");

    public static void main(String[] args) {
        Toolkit theKit = aWindow.getToolkit(); //get the window toolkit
        Dimension wndSize = theKit.getScreenSize(); //get screen size

        //set position to screen center & size to half screen size
        aWindow.setBounds(wndSize.width / 4, wndSize.height / 4, //Position
                wndSize.width / 2, wndSize.height / 2); //size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
        aWindow.getContentPane().setBackground(Color.yellow);
    }
}
