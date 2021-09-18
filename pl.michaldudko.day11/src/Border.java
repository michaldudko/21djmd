import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
import javax.swing.*;

public class Border extends JFrame{
    public Border(){
        super("Border");
        setSize(240,280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JButton nButton = new JButton("Północ");
        JButton sButton = new JButton("Południe");
        JButton eButton = new JButton("Wschód");
        JTextField wButton = new JTextField("Zachód");
        JButton cButton = new JButton("Środek");
        add(nButton,BorderLayout.NORTH);
        add(sButton,BorderLayout.SOUTH);
        add(eButton,BorderLayout.EAST);
        add(wButton,BorderLayout.WEST);
        add(cButton,BorderLayout.CENTER);
        setVisible(true);

    }
    public static void main(String[] args) {
        Border frame = new Border();
    }
}
