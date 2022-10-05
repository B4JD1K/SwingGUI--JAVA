import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("Tytul okna jest tu ustawiony"); // ustawia tytul okna
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // wylacza aplikacje przy kliknieciu 'X'
        //                                                    // JFrame.DO_NOTHING_ON_CLOSE -- nic nie robi po 'X'
        //                                                    // JFrame.HIDE_ON_CLOSE

        this.setResizable(false);  // nie mozna zmieniac szerokosci i wysokosci
        this.setSize(420, 420); // ustawia szerokosc i wysokosc okna
        this.setVisible(true); // sprawia, okno jest widoczne

        ImageIcon image = new ImageIcon("ikona.png");       // tworzy ImageIcon ikone okna (lewy gorny rog)
        this.setIconImage(image.getImage()); // zmienia ikone okna
        this.getContentPane().setBackground(new Color(123, 50, 250));  // zmienia kolor okna
    }

}