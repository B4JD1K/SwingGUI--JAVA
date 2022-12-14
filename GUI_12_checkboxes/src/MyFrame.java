import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("x.png");
        checkIcon = new ImageIcon("checkmark.png");

        button = new JButton("Sprawdz");
//        button.setText("Sprawdz");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("Nie jestem robotem");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.ITALIC, 25));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());
        }
    }
}
