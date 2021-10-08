import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClosureMayhem extends JFrame {
    JButton harry, wade, hansel;

    public ClosureMayhem(){
        super("Wybierz kursor");
        setSize(400,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        harry = new JButton("Celownik");
        add(harry);
        wade = new JButton("Oczekiwanie");
        add(wade);
        hansel = new JButton("Rączka");
        add(hansel);
        //początek domknięcia
        ActionListener act = (event) -> {
                if(event.getSource() == harry) {
                    setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                }
                if(event.getSource() == wade){
                    setCursor(new Cursor(Cursor.WAIT_CURSOR));
                }
                if(event.getSource()==hansel){
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }

        };
        // koniec domknięcia
        harry.addActionListener(act);
        wade.addActionListener(act);
        hansel.addActionListener(act);
        setVisible(true);
    }
    public static void main(String[] args){
        new ClosureMayhem();
    }
}
