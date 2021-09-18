import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
import javax.swing.*;

public class Stacker extends JFrame {
    public Stacker() {
        super("Stacker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(430, 150);
        //utwórz górny panel
        JPanel commandPane = new JPanel();
        BoxLayout horizontal = new BoxLayout(commandPane, BoxLayout.X_AXIS);
        JButton subscribe = new JButton("Subskrybuj");
        JButton unsubscribe = new JButton("Anuluj subskrybcję");
        JButton refresh = new JButton("Odśwież");
        JButton save = new JButton("Zapisz");
        commandPane.add(subscribe);
        commandPane.add(unsubscribe);
        commandPane.add(refresh);
        commandPane.add(save);
        //utwórz dolny panel
        JPanel textPane = new JPanel();
        JTextArea text = new JTextArea(4, 70);
        JScrollPane scrollPane = new JScrollPane(text);
        //połącz razem
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(commandPane);
        add(scrollPane);
        setVisible(true);

    }

    public static void main(String[] args) {
        Stacker st = new Stacker();
    }
}
