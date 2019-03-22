
package CardAndGridLayout;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;

public class GridBagLayoutExample {
    public static void addComponentsToPane(Container pane){
        JButton  jbnButton;
        pane.setLayout(new GridBagLayout());
        GridBagConstraints gBc= new GridBagConstraints();
        //fill determines how the size of the component is adjusted in relation
        // to the array of cells it occupies.
        gBc.fill=GridBagConstraints.HORIZONTAL;
        
        jbnButton=new JButton("Button 1");
        //weightx and weighty
        //Determines how free space is distributed between components in the container
        gBc.weightx=0.5;//range(0-1)
        //gridx and gridy
        //determines the position of the component in the container as coordinate
        //positions of cells in the grid, where (0,0) is the top-left position in the container
        gBc.gridx=0;
        gBc.gridy=0;
        pane.add(jbnButton, gBc);
        
        JTextField jtf=new JTextField("TextField 1");
        gBc.gridx=1;
        gBc.gridy=0;
        jtf.setEditable(false);
        pane.add(jtf, gBc);
        
        jbnButton=new JButton("Button 3");
        gBc.gridx=2;
        gBc.gridy=0;
      //  pane.add(jbnButton, gBc);
        
        jbnButton=new JButton("Button 4");
        //ipadx and ipady
        //Determines by how much the componet size is to be increased above its minimal size
        gBc.ipady=40;    //This componet has more breadth compare to others
        gBc.weightx=0.0;
        gBc.gridwidth=3; //Specify number of columns (gridwidth) that a component.(it's like clospand )
        gBc.gridx=0;
        gBc.gridy=1;
        pane.add(jbnButton, gBc);
        
        JComboBox jcmbSample=new JComboBox(new String[]{"ComboBox 1","higth","weight","age"});
        gBc.ipady=0;
        gBc.weighty=1.0;
        //anchor
        //Determines where a component is positioned within the area allocated
        //to it in the container.
        gBc.anchor=GridBagConstraints.PAGE_END;
        
        //insets
        //Specifies the free space that is to be provided around the component within
        //the space allocated to it in the container
        gBc.insets=new Insets(10, 0, 0, 0);//padding (anti clockwise)
        gBc.gridx=1;
        gBc.gridwidth=2;
        pane.add(jcmbSample,gBc);
        
    }
    private static void createAndShowGUI(){
        //JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame=new JFrame("GridBagLayout Source Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //set up the content pane.
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
             createAndShowGUI(); 
            }
        });
    }
}
