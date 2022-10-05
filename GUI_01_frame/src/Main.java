import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

//        // JFrame = a GUI window to add components to
/*
        JFrame frame = new JFrame(); // tworzy ramke (okno)
        frame.setTitle("Tytul okna jest tu ustawiony"); // ustawia tytul okna
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // wylacza aplikacje przy kliknieciu 'X'
        //                                                    // JFrame.DO_NOTHING_ON_CLOSE -- nic nie robi po 'X'
        //                                                    // JFrame.HIDE_ON_CLOSE

        frame.setResizable(false);  // nie mozna zmieniac szerokosci i wysokosci
        frame.setSize(420, 420); // ustawia szerokosc i wysokosc okna
        frame.setVisible(true); // sprawia, okno jest widoczne

        ImageIcon image = new ImageIcon("ikona.png");       // tworzy ImageIcon ikone okna (lewy gorny rog)
        frame.setIconImage(image.getImage()); // zmienia ikone okna
        frame.getContentPane().setBackground(new Color(123,50,250));  // zmienia kolor okna
*/

        MyFrame myFrame = new MyFrame();

    }
}