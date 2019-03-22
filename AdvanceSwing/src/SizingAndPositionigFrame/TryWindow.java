
package SizingAndPositionigFrame;

import javax.swing.JFrame;

public class TryWindow {
    //The window object

    static JFrame aWindow = new JFrame("This is the Window Title");
    public static void main(String[] args) {
        int windowWidth=400;
        int windowHeight=150;
        aWindow.setBounds(50, 10,             //set position
                windowWidth, windowHeight);   //set size
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setLocationRelativeTo(null); //Display the window in center
        aWindow.setVisible(true);
        
        
        
    }
}
