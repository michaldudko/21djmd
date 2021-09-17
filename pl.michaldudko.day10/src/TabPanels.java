import java.awt.*;
import javax.swing.*;

public class TabPanels extends JFrame {
    public TabPanels() {
        super("Zakładki");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(480, 218);
        JPanel mainSettings = new JPanel();
        JPanel advancedSettings = new JPanel();
        JPanel privacySettings = new JPanel();
        JPanel emailSettings = new JPanel();
        JPanel securitySettings = new JPanel();
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Główna", mainSettings);
        tabs.addTab("Zaawansowana", advancedSettings);
        tabs.addTab("Prywatna", privacySettings);
        tabs.addTab("E-mail", emailSettings);
        tabs.add("Bezpieczeństwo", securitySettings);
        add(tabs);
        setVisible(true);
    }

    public static void main(String[] args) {
        TabPanels panelz = new TabPanels();
    }
}