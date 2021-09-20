import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class TitleBar extends JFrame implements ActionListener {
    JButton b1;
    JButton b2;

    public TitleBar(){
        super("Life's going on");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1 = new JButton("Rosenkrantz");
        b2 = new JButton("Guildenstern" );
        b1.addActionListener(this);
        b2.addActionListener(this);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt){
        Object source = evt.getSource();
        if (source==b1){
            setTitle("Rosenkrantz");
        } else if (source == b2){
            setTitle("Guildenstern");
        }
        repaint();

    }
    public static void main(String[] args){
        TitleBar frame = new TitleBar();
    }
}
