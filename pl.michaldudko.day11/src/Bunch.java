import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
import javax.swing.*;

public class Bunch extends JFrame{
    public Bunch () {
        super("Bunch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260,120);
        JPanel pane = new JPanel();
        GridLayout family = new GridLayout(4,5,0,0 );
        pane.setLayout(family);
        JButton marcia = new JButton("Marcia");
        JButton carol = new JButton("Carol");
        JButton greg = new JButton("Greg");
        JButton jan = new JButton("Jan");
        JButton alice = new JButton("Alicja");
        JButton peter = new JButton("Piotr");
        JButton cindy = new JButton("Cecylia");
        JButton mike = new JButton("Michał");
        JButton bobby = new JButton("Robert");
        pane.add(marcia);
        pane.add(carol);
        pane.add(greg);
        pane.add(jan);
        pane.add(alice);
        pane.add(peter);
        pane.add(cindy);
        pane.add(mike);
        pane.add(bobby);
        add(pane);
        setVisible(true);

    }
    public static void main(String[] args) {
        Bunch frame = new Bunch();
    }
}
