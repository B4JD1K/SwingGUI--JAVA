import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        ImageIcon icon = new ImageIcon("wskaznik.png");
        ImageIcon icon2 = new ImageIcon("buzka.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 250, 150);
        button.addActionListener(this);
//        button.addActionListener(e -> System.out.println("pooo"));
        button.setText("jestem przyciskiem");
        button.setFocusable(false); // usuwa ramkę wokół tekstu na przycisku
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Arial", Font.BOLD, 25));
        button.setIconTextGap(-15);
        button.setForeground(Color.CYAN);
        button.setBackground(Color.gray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
//            System.out.println("poo");
            button.setEnabled(false);

            label.setVisible(true);
        }
    }
}
