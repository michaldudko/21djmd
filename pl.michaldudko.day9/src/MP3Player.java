import javax.swing.*;

public class MP3Player extends JFrame {
    JButton play = new JButton("play");
    JButton pause = new JButton("pause");
    JButton stop = new JButton("stop");
    JButton backward = new JButton("cofnij");
    JButton forward = new JButton("w przód");

    public MP3Player() {
        super("Odtwarzacz MP3");
        setSize(430, 90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel plejer = new JPanel();
        plejer.add(play);
        plejer.add(pause);
        plejer.add(stop);
        plejer.add(backward);
        plejer.add(forward);
        add(plejer);
        setVisible(true);

    }
    public static void main(String[] args) {
    MP3Player mp3 = new MP3Player();
    }
}
