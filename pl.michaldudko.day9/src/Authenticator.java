import javax.swing.*;

public class Authenticator extends javax.swing.JFrame{
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4,15);
    JButton ok = new JButton("OK");
    JButton cancel = new JButton("Anuluj");

    public Authenticator() {
        super("Informacje o koncie");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pane = new JPanel();
        JLabel usernameLabel = new JLabel("Użytkownik: ");
        JLabel passwordLabel = new JLabel("Hasło: ");
        JLabel commentsLabel = new JLabel("Komentarz: ");
        JScrollPane scroll = new JScrollPane(
                comments,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        pane.add(commentsLabel);
        pane.add(scroll);
        pane.add(ok);
        pane.add(cancel);

        add(pane);
        setVisible(true);
    }

    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");}
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main (String[] arguments){
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }

}