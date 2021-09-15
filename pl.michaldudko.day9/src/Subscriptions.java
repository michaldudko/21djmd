import javax.swing.*;

public class Subscriptions extends JFrame{
    String[] subs = {"Burningbird","Freeform Goodness","Ideoplex","Inessential","Interwingly","Now This","Rasterweb","RC3","Whole Lotta Nothing"," Workbench"};
    JList<String> subList = new JList<>(subs);

    public Subscriptions(){
        super("Subskrypcje");
        setSize(150,335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("Subskrypcje RSS:");
        panel.add(subLabel);
        subList.setVisibleRowCount(8);
        JScrollPane scrl = new JScrollPane(subList);
        panel.add(scrl);
        add(panel);
        setVisible(true);
    }
    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
         public static void main(String[] args) {
             Subscriptions.setLookAndFeel();
             Subscriptions suby = new Subscriptions();
         }
}