import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textFieldLogin;
    JPasswordField textFieldPassword;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Potwierdz");
        button.addActionListener(this);

        textFieldLogin = new JTextField();
        textFieldLogin.setPreferredSize(new Dimension(200, 40));
        textFieldLogin.setFont(new Font("Consolas", Font.ITALIC,15));
        textFieldLogin.setForeground(new Color(0x00ff00));
        textFieldLogin.setBackground(Color.BLACK);
        textFieldLogin.setText("username");

        textFieldPassword = new JPasswordField();
        textFieldPassword.setText("password");
        textFieldPassword.setCaretColor(Color.white);
        textFieldPassword.setPreferredSize(new Dimension(200, 40));
        textFieldPassword.setFont(new Font("Consolas", Font.ITALIC,15));
        textFieldPassword.setForeground(new Color(0x00ff00));
        textFieldPassword.setBackground(Color.BLACK);
        textFieldPassword.setCaretColor(Color.white);

        this.add(textFieldLogin);
        this.add(textFieldPassword);
        this.add(button);
        this.setSize(250,250);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Welcome "+ textFieldLogin.getText());
            button.setEnabled(false);
            textFieldLogin.setEditable(false);
            textFieldPassword.setEditable(false);
        }
    }
}
