import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class FormatChooser extends JFrame implements ItemListener {
    String[] formats = {"Atom","RSS 0.92","RSS 1.0","RSS 2.0"};
    String[] descriptions = {"Format Atom dla blogów", "Format RSS 0.92 (Netscape)","Format RSS/RDF 1.0 (RSS/RDF)",
            "Format RSS 2.0 (UserLand"};
    JComboBox formatBox = new JComboBox();
    JLabel descLabel = new JLabel("");

    public FormatChooser() {
        super("Format kanału informacyjnego");
        setSize(420, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        for (int i = 0; i < formats.length; i++) {
            formatBox.addItem(formats[i]);
        }
        formatBox.addItemListener(this);
        add(BorderLayout.NORTH, formatBox);
        add(BorderLayout.CENTER, descLabel);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent event){
        int choice = formatBox.getSelectedIndex();
        if (choice>0){
            descLabel.setText(descriptions[choice-1]);
        }
    }
    public Insets getInsets() {
        return new Insets(50,10,10,10);
    }

    private static void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        FormatChooser.setLookAndFeel();
        FormatChooser fc = new FormatChooser();
    }
}