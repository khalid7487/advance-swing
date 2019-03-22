
package MouseEvent;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MouseDemo extends JFrame implements MouseListener,MouseMotionListener{

    JTextField tf;
    public  MouseDemo(String title){
        super(title);
        tf=new JTextField(60);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    public void launchFrame(){
        add(tf, BorderLayout.SOUTH);  //Add components to the frame
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        String msg="Mouse clicked.";
        tf.setText(msg);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        String msg="Mouse pressed.";
        tf.setText(msg);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String msg="Mouse Released.";
        tf.setText(msg);
        JOptionPane.showMessageDialog(this, msg);
    
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String msg="Mouse Entered.";
        tf.setText(msg);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        String msg="Mouse Exited.";
        tf.setText(msg);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        String msg="Mouse dragged at"+ e.getX()+","+e.getY();
        tf.setText(msg);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        String msg="Mouse moved at "+e.getX()+","+e.getY();
        tf.setText(msg);
    }
    public static void main(String[] args) {
        MouseDemo as=new MouseDemo("Mouse Event");
        as.launchFrame();
    }
    
}
