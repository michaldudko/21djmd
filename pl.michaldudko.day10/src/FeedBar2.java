import java.awt.*;
import javax.swing.*;

public class FeedBar2 extends JFrame {

    public FeedBar2() {
        super("Pasek narzędziowy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // utworzenie ikon
        ImageIcon loadIcon = new ImageIcon("load.gif");
        ImageIcon saveIcon = new ImageIcon("save.gif");
        ImageIcon subIcon = new ImageIcon("subscribe.gif");
        ImageIcon unsubIcon = new ImageIcon("unsubscribe.gif");
        // utworzenie przycisków
        JButton loadButton = new JButton("Wczytaj", loadIcon);
        JButton saveButton = new JButton("Zapisz", saveIcon);
        JButton subButton = new JButton("Zarejestruj", subIcon);
        JButton unsubButton = new JButton("Wyrejestruj", unsubIcon);
        // dodanie do paska narzędziowego
        JToolBar bar = new JToolBar();
        bar.add(loadButton);
        bar.add(saveButton);
        bar.add(subButton);
        bar.add(unsubButton);
        //utwórz menu
        JMenuItem j1 = new JMenuItem("Wczytaj");
        JMenuItem j2 = new JMenuItem("Zapisz");
        JMenuItem j3 = new JMenuItem("Zarejestruj");
        JMenuItem j4 = new JMenuItem("Wyrejestruj");
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Źródła danych");
        menu.add(j1);
        menu.add(j2);
        menu.addSeparator();
        menu.add(j3);
        menu.add(j4);
        menubar.add(menu);
        //przygotuj interfejs
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("North", bar);
        add("Center", scroll);
        setJMenuBar(menubar);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        FeedBar2 frame = new FeedBar2();
    }
}