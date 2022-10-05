import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    JLabel label;
    ImageIcon smile;
    ImageIcon scary;
    ImageIcon pain;
    ImageIcon dizzy;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("smile.png");
        pain = new ImageIcon("pain.png");
        scary = new ImageIcon("scary.png");
        dizzy = new ImageIcon("dizzy.png");

        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
//        label = new JLabel();
//        label.setBounds(0,0,100,100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
//        this.addMouseListener(this);
//
//        this.add(label);
//        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // wywoływany kiedy przycisk myszy zostanie kliknięty (czyli wciśnięty i puszczony) na elemencie
        System.out.println("Kliknales myszke");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // wywoływany kiedy przycisk myszy zostanie wciśnięty na elemencie
        System.out.println("Wcisnales przycisk myszy");
//        label.setBackground(Color.yellow);
        label.setIcon(pain);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // wywoływany kiedy przycisk myszy zostanie puszczony z elementu
        System.out.println("Zwolniles przycisk myszy");
//        label.setBackground(Color.green);
        label.setIcon(dizzy);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // wywoływany kiedy kursor myszy najedzie na obszar elementu
        System.out.println("Najechales na obrazek");
//        label.setBackground(Color.blue);
        label.setIcon(scary);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // wywoływany kiedy kursor myszy wyjdzie z obrszaru elementu
        System.out.println("Zjechales z obrazka");
//        label.setBackground(Color.red);
        label.setIcon(smile);

    }
}
