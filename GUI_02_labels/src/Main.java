import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // JLabel = GUI wyświetla obszar dla tekstu, obrazkow lub obu

        ImageIcon image = new ImageIcon("ziomek.png");
        Border border = BorderFactory.createLineBorder(Color.green, 3);


        JLabel label = new JLabel();    // tworzy label
        label.setText("Ziomek, czy ty cokolwiek kodujesz?");    // ustawia tekst danego labela
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // ustawia tekst LEFT,CENTER,RIGHT na ImageIcon
        label.setVerticalTextPosition(JLabel.TOP);  // ustawia tekst na TOP,CENTER,BOTTOM na ImageIcon
        label.setForeground(new Color(0x00ff00));   // ustawia kolor czcionki
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));// ustawia czcionke tekstu
        label.setIconTextGap(25);  // ustawia odstep tekstu od zdjecia
        label.setBackground(Color.black);   // ustawia kolor tła
        label.setOpaque(true);  // wystwietla kolor tla
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);  // ustawia pionową pozycję ikony i tekstu
        label.setHorizontalAlignment(JLabel.CENTER);  // ustawia poziomą pozycję ikony i tekstu
//        label.setBounds(100,100,250,250); // ustawia pozycje X i Y ramki zgodnie z kierunkiem

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
//        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();

    }
}