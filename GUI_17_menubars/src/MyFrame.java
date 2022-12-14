import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("load.png");
        saveIcon = new ImageIcon("save.png");
        exitIcon = new ImageIcon("exit.png");

        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + "F" by rozwinac menu File
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + "E" by rozwinac menu Edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + "H" by rozwinac menu Help
        loadItem.setMnemonic(KeyEvent.VK_L); // skrot klawiszowy dla "L" by wczytac
        saveItem.setMnemonic(KeyEvent.VK_S); // skrot klawiszowy dla "S" by zapisac
        exitItem.setMnemonic(KeyEvent.VK_E); // skrot klawiszowy dla "E" by wyjsc

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loadItem) {
            System.out.println("*beep boop* wczytano plik");
        }
        if (e.getSource() == saveItem) {
            System.out.println("*beep boop* zapisano plik");
        }
        if (e.getSource() == exitItem) {
            System.exit(0);
        }

    }
}
