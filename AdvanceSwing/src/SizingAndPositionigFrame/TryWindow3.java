package SizingAndPositionigFrame;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;

public class TryWindow3 {

    //Using point class
    //The window object
    static JFrame aWindow = new JFrame("This is the Window Title");

    public static void main(String[] args) {
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int windowWidth = 400;
        int windowHeight = 200;
        //set Position and size
        aWindow.setBounds(center.x - windowWidth / 2, center.y - windowHeight / 2,
                windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
}
