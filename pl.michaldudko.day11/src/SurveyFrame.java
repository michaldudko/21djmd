import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
import javax.swing.*;

public class SurveyFrame extends JFrame {
    public SurveyFrame() {
        super("Ankieta");
        setSize(290,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SurveyWizard wiz = new SurveyWizard();
        add(wiz);
        setVisible(true);
    }
    public static void main(String[] args) {
        SurveyFrame sf = new SurveyFrame();
    }
}