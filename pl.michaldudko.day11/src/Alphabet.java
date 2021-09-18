import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Alphabet extends JFrame {
    public Alphabet() {
        super("Alphabet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 120);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        JButton a = new JButton("Alibi");
        JButton b = new JButton("Biurko");
        JButton c = new JButton("Ciało");
        JButton d = new JButton("Dowód");
        JButton e = new JButton("Ekran");
        JButton f = new JButton("Fasada");
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        setVisible(true);
    }

    public static void main(String[] args) {
        Alphabet frame = new Alphabet();
    }
}