import javax.swing.*;

public class SetTitleBar extends JFrame{
    private static final String titleofBar = JOptionPane.showInputDialog("Wprowadź nazwę okna:");
    public SetTitleBar() {
        super(titleofBar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,300);
        JPanel hiho = new JPanel();
        add(hiho);
        setVisible(true);

    }
    public static void main (String[] args){
        SetTitleBar bar = new SetTitleBar();
    }
}
