package focusEventExample;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FocusListener {
    
    public static void main(String[] args) {
        //Create frame with specific title
        JFrame frame = new JFrame("Example Frame");

        //Create a componet to add to the frame;
        //in this case a text area with sample text
        final TextArea textArea = new TextArea("Click button to check its focus status..");

        //Create a component to add to the frame;in this casee a button
        JButton button = new JButton("Click me!");
        //add a focus listener to handle focus changes
        button.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent evt) {
                textArea.setText(textArea.getText() + "\nButton focus gaine");
                
            }

            @Override
            public void focusLost(FocusEvent evt) {
                textArea.setText(textArea.getText() + "\nButton focus lost.");
            }
            
        });
        frame.add(textArea);
        frame.add(button, BorderLayout.SOUTH);
        frame.setSize(500, 250);
        frame.setVisible(true);
    }
    
}
