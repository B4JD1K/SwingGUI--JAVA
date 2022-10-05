import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener {

    JButton buttonSave;
    JButton buttonOpen;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        buttonSave = new JButton("Save File");
        buttonSave.addActionListener(this);

        buttonOpen = new JButton("Open File");
        buttonOpen.addActionListener(this);

        this.add(buttonSave);
        this.add(buttonOpen);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonSave) {

            JFileChooser fileChooser = new JFileChooser();

//            fileChooser.setCurrentDirectory(new File("."));
            fileChooser.setCurrentDirectory(new File("C:\\Users\\bajdi\\OneDrive\\Pulpit"));

//            int response = fileChooser.showOpenDialog(null); // ustala plik do otworzenia
            int response = fileChooser.showSaveDialog(null); // ustala plik do zapisania

            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
        if (e.getSource() == buttonOpen) {

            JFileChooser fileChooser = new JFileChooser();

//            fileChooser.setCurrentDirectory(new File("."));
            fileChooser.setCurrentDirectory(new File("C:\\Users\\bajdi\\OneDrive\\Pulpit"));

            int response = fileChooser.showOpenDialog(null); // ustala plik do otworzenia
//            int response = fileChooser.showSaveDialog(null); // ustala plik do zapisania

            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
}
