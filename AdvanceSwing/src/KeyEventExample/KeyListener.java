package KeyEventExample;

import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;

public class KeyListener {

    public static void main(String[] args) {

        //Create frame with specific title
        Frame frame = new Frame("Example Frame");

        //Create a component to add to the frame ;in this case a text area
        Component textArea = new TextArea("you pressed []: \n");
        textArea.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                TextArea source = (TextArea) evt.getSource();
                source.setText("You pressed {" + KeyEvent.getKeyText(evt.getExtendedKeyCode()));
            }
            //using same procedure we can work with keytyped and keyrelase
            
        });
        frame.setSize(500, 250);
        frame.add(textArea);
        
        frame.setVisible(true);
    }
}
