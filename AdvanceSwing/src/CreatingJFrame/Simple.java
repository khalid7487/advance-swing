
package CreatingJFrame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Simple {
    JFrame f;
    JLabel lb1;
    JButton b;

    Simple() {
        f=new JFrame();//create JFrame object
        lb1=new JLabel("Hello");//create JLabel object
        b=new JButton("click");//create JButton object
        lb1.setBounds(10, 10, 50, 30);//position and size
        b.setBounds(130, 100, 100, 40);//position and size
        f.add(b);//add button to frame
        f.add(lb1);//add button to frame
        f.setSize( 400, 500);//set  frame layout
        f.setTitle("First demo Form");//set frame title
        f.setLayout(null);//set frame layout
        f.setVisible(true);//display the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//set the frame close
          
    }
    public static void main(String[] args) {
        new Simple();
    }
     
}
