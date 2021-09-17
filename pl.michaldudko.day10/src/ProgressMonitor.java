import java.awt.*;
import javax.swing.*;

public class ProgressMonitor extends JFrame {

    JProgressBar current;
    JTextArea out;
    JButton find;
    int num = 0;

    public ProgressMonitor() {
        super("Monitorowanie postępu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(205, 68);
        setLayout(new FlowLayout());
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        add(current);
    }

    public void iterate() {
        while (num < 2000) {
            current.setValue(num);
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
            }
            num += 95;
        }
    }

    public static void main(String[] args) {
        ProgressMonitor frame = new ProgressMonitor();
        frame.setVisible(true);
        frame.iterate();
    }
}
