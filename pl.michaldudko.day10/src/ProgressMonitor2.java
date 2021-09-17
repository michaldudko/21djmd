import java.awt.*;
import javax.swing.*;

public class ProgressMonitor2 extends JFrame {

    JProgressBar current;
    JTextField currentProgress;
    JButton find;
    int num = 0;

    public ProgressMonitor2() {
        super("Monitorowanie postępu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(340, 250);
        setLayout(new FlowLayout());
        JLabel currentTextLabel = new JLabel("Postęp:");
        currentProgress = new JTextField("", 4);
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        add(currentTextLabel);
        add(currentProgress);
        add(current);
        pack();

    }

    public void iterate() {
        while (num < 2000) {
            String i = String.valueOf(num);
            current.setValue(num);
            currentProgress.setText(i);
            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {
            }
            num += 95;
        }
    }

    public static void main(String[] args) {
        ProgressMonitor2 frame = new ProgressMonitor2();
        frame.setVisible(true);
        frame.iterate();
    }
}
