import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame implements FocusListener {
    JTextField value1, value2, sum;
    JLabel plus, equals;

    public Calculator(){
        super("dodaj dwie liczby");
        setSize(350,90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        //komponenty
        value1 = new JTextField("0",5);
        plus = new JLabel("+");
        value2 = new JTextField("0",5);
        equals = new JLabel("=");
        sum = new JTextField("0",5);
        // dodaj nasłuchiwanie
        value1.addFocusListener(this);
        value2.addFocusListener(this);
        // skonfiguruj pole sumy
        sum.setEditable(false);
        // dodaj komponenty
        add(value1);
        add(plus);
        add(value2);
        add(equals);
        add(sum);
        setVisible(true);

    }
    public void focusGained(FocusEvent event){
        try{
            float total = Float.parseFloat(value1.getText())+Float.parseFloat(value2.getText()); sum.setText(""+total);
        } catch (NumberFormatException e) {
            value1.setText("0");
            value2.setText("0");
            sum.setText("0" );
        }
    }
    public void focusLost(FocusEvent event) {
        focusGained(event);
    }
    public static void main(String[] args) {
        Calculator frame = new Calculator();
    }
}
