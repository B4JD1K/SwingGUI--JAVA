import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // JOptionPane =    wyrzuca(pojawia się) nowy komunikat który skłania uzytkownikow do czynnosci
        //                  albo informuje ich o czymś

//        JOptionPane.showMessageDialog(null, "Jakies info pokazane tu zostalo", "tytul", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "Informacja o info :D", "tytul", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "serio??", "tytul", JOptionPane.QUESTION_MESSAGE);
//        while (true) {
//            JOptionPane.showMessageDialog(null, "Komputer zostal zainfekowany przez WIRUSA", "tytul", JOptionPane.WARNING_MESSAGE);
//        } // :DDDD
        //        JOptionPane.showMessageDialog(null, "Wezwij pomoc techniczna", "tytul", JOptionPane.ERROR_MESSAGE);

//        int answer = JOptionPane.showConfirmDialog(null, "ziomek czy ty cos ogarniasz?", "tytul okienka", JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("Jak sie nazywasz?: ");
//        System.out.println("Siemasz " + name);

        String[] responses = {"Nie, ty jestes", "dziena!", "*rumieni sie*"};  // odpowiedzi na przyciskach
        ImageIcon icon = new ImageIcon("nagroda.png");  // ikona na wiadomosci

        JOptionPane.showOptionDialog(
                null,
                "Jestes zajebisty!",
                "to jest ukryta wiadomosc, cii",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                responses,
                0);

    }
}