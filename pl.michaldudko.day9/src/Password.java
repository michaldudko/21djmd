import javax.swing.*;

public class Password extends JFrame {
    PasswordFrame pass = new PasswordFrame();


    public Password() {
        super("Podaj hasło");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        pass.setVisible(true);
    }

    public static void main(String[] args) {
        Password psw = new Password();
    }

    class PasswordFrame extends JFrame {
        public PasswordFrame() {
            super("Hasło:");
            setSize(230, 150);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel();
            JLabel usernameLabel = new JLabel("Nazwa użytkownika");
            JTextField username = new JTextField(15);
            JLabel passwordLabel = new JLabel("Hasło: ");
            JPasswordField password = new JPasswordField(15);
            panel.add(usernameLabel);
            panel.add(username);
            panel.add(passwordLabel);
            panel.add(password);

            add(panel);
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
}
