import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game {

    JFrame frame;
    JLabel labelPlayer1;
    JLabel labelPlayer2;
    Action upAction;
    Action downAction;
    Action leftAction;
    Action rightAction;

    Game() {

        frame = new JFrame("KeyBinding Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);

        labelPlayer1 = new JLabel();
        labelPlayer1.setBackground(Color.RED);
        labelPlayer1.setBounds(100,100,100,100);
        labelPlayer1.setOpaque(true);

        labelPlayer2 = new JLabel();
        labelPlayer2.setBackground(Color.BLUE);
        labelPlayer2.setBounds(300,300,100,100);
        labelPlayer2.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        labelPlayer1.getInputMap().put(KeyStroke.getKeyStroke('W'),"upAction");
        labelPlayer1.getActionMap().put("upAction", upAction);
        labelPlayer1.getInputMap().put(KeyStroke.getKeyStroke('S'),"downAction");
        labelPlayer1.getActionMap().put("downAction", downAction);
        labelPlayer1.getInputMap().put(KeyStroke.getKeyStroke('A'),"leftAction");
        labelPlayer1.getActionMap().put("leftAction", leftAction);
        labelPlayer1.getInputMap().put(KeyStroke.getKeyStroke('D'),"rightAction");
        labelPlayer1.getActionMap().put("rightAction", rightAction);

        labelPlayer2.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
        labelPlayer2.getActionMap().put("upAction", upAction);
        labelPlayer2.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        labelPlayer2.getActionMap().put("downAction", downAction);
        labelPlayer2.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        labelPlayer2.getActionMap().put("leftAction", leftAction);
        labelPlayer2.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        labelPlayer2.getActionMap().put("rightAction", rightAction);

        frame.add(labelPlayer1);
        frame.add(labelPlayer2);
        frame.setVisible(true);

    }

    public class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            labelPlayer1.setLocation(labelPlayer1.getX(), labelPlayer1.getY()-10);
            labelPlayer2.setLocation(labelPlayer2.getX(), labelPlayer2.getY()-10);

        }
    }

    public class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            labelPlayer1.setLocation(labelPlayer1.getX(), labelPlayer1.getY()+10);
            labelPlayer2.setLocation(labelPlayer2.getX(), labelPlayer2.getY()+10);

        }
    }

    public class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            labelPlayer1.setLocation(labelPlayer1.getX()-10, labelPlayer1.getY());
            labelPlayer2.setLocation(labelPlayer2.getX()-10, labelPlayer2.getY());

        }
    }

    public class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            labelPlayer1.setLocation(labelPlayer1.getX()+10, labelPlayer1.getY());
            labelPlayer2.setLocation(labelPlayer2.getX()+10, labelPlayer2.getY());

        }
    }
}
