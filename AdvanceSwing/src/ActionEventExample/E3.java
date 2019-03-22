
package ActionEventExample;


import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class E3 extends JFrame{
    JButton btn,btn2;

    public E3(){
        setSize(400, 300);
        btn=new JButton("ok");
        btn2=new JButton("Cancel");
        setLayout(new FlowLayout());
        getContentPane().add(btn);
        getContentPane().add(btn2);
        
        btn.addActionListener(new E3Listener());
        btn2.addActionListener(new E3Listener());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
       E3 e3=new E3();
       e3.setVisible(true);
    }
}
