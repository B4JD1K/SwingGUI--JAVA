import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JPanel = w GUI komponent który ma za zadanie przetrzymywac inne komponenty w nim

        ImageIcon icon = new ImageIcon("łapka.png");

        JLabel label = new JLabel();
        label.setText("Hi!");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(100,20,200,200);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);      // dzieki temu mozemy zawrzec wiecej komponentow w oknie
        frame.setSize(750, 750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}