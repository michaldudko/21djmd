import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyChecker extends JFrame {
    JLabel keyLabel = new JLabel("Naciśnij dowolny klawisz");

    public KeyChecker() {
        super("Naciśnij klawisz");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        KeyMonitor monitor = new KeyMonitor(this);
        setFocusable(true);
        addKeyListener(monitor);
        add(keyLabel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KeyChecker();
    }
}

class KeyMonitor extends KeyAdapter {
    KeyChecker display;

    KeyMonitor(KeyChecker display) {
        this.display = display;
    }


    public void keyTyped(KeyEvent e) {
        display.keyLabel.setText("" + e.getKeyChar());
        display.repaint();
    }
}