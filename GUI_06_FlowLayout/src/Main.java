import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Layout Manager = definiuje "naturalne" polozenie dla komponentow wewnatrz

        // FlowLayout =     umieszcza komponenty w rzedzie, w wielkosci ich zdefiniowanych wielkosci
        //                  jesli miejsce w rzedzie (na bok) sie skonczy
        //                  to class FlowLayout przerzuci do nastepnego dostepnego(mozliwego) rzedu

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

/*
        JButton button1 = new JButton();    // i tak kolejne tworzymy
        frame.add(button1);                 // pozniej dodajemy     frame.add(button2); itp
*/      // SKRÓT NA SZYBSZE TWORZENIE POZNIEJ

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150, 250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));

        frame.add(panel);
        frame.setVisible(true); // powinno byc na koncu aby wszystko co bedzie dodane bylo widoczne
    }
}