
package ActionEventExample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E3Listener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("ok")){
            System.out.println("hello");
        }
        if(e.getActionCommand().equals("Cancel")){
            System.out.println("aaaaaa");
        }
            
    }
    
}
