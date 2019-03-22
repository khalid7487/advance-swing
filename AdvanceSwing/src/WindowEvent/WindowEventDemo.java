package WindowEvent;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class WindowEventDemo extends JFrame implements WindowListener,
        WindowFocusListener, WindowStateListener {

    static final String newline = System.getProperty("line.separator");
    static final String space = " ";
    static WindowEventDemo frame = new WindowEventDemo("WindowEventDemo");

    JTextArea display;

    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //set up the content pane.
        frame.addcomponentsToPane();

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    private void addcomponentsToPane() {
        display = new JTextArea();
        display.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setPreferredSize(new Dimension(500, 450));
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        addWindowListener(this);
        addWindowFocusListener(this);
        addWindowStateListener(this);
        //checkWM();
    }

    public WindowEventDemo(String name) {
        super(name);
    }

    //some window managers don't support all window states
    public void checkWM() {
        Toolkit tk = frame.getToolkit();
        if (!(tk.isFrameStateSupported(Frame.ICONIFIED))) {
            displayMessage("your window manager doesn't support ICONIFIED");
        } else {
            displayMessage("your window manager support ICONIFIED");
        }
        if (!(tk.isFrameStateSupported(Frame.MAXIMIZED_VERT))) {
            displayMessage("your window manager doesn't support MAXIMIZED_VERT");
        } else {
            displayMessage("your window manager support MAXIMIZED_VERT");
        }
        if (!(tk.isFrameStateSupported(Frame.MAXIMIZED_HORIZ))) {
            displayMessage("your window manager doesn't support MAXIMIZED_HORIZ");
        } else {
            displayMessage("your window manager support MAXIMIZED_HORIZ");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        displayMessage("windowListener method called:windowOpened.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        displayMessage("windowListener method called: windowClosing");
        //A pause so user can see the message before 
        //the window actually closes.
        ActionListener task = new ActionListener() {
            boolean alreadyDisposed = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (frame.isDisplayable()) {
                    alreadyDisposed = true;
                    frame.dispose();
                }
            }
        };
        Timer timer = new Timer(500, task);
        timer.setInitialDelay(2000);
        timer.setRepeats(false);
        timer.start();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //This will only be seen seen on standard output.
        displayMessage("windowListener method called: windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        displayMessage("WindowListener method called: windowIconified.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        displayMessage("WindowListener method called: windowDeiconified.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        displayMessage("WindowListener method called: windowActivated.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        displayMessage("WindowListener method called: windowDeactivated.");
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        displayMessage("WindowListener method called: windowGainedFocus.");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        displayMessage("WindowListener method called: windowLostFocus.");
    }

    @Override
    public void windowStateChanged(WindowEvent e) {
        displayMessage("WindowListener method called: windowStateChanged.");
    }

    private void displayMessage(String msg) {
        display.append(msg + newline);
    }

}
