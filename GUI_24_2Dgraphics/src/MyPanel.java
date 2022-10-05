import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class MyPanel extends JPanel {

    Image image;
    BufferedImage bufferedImage;
    int WIDTH = 800;
    int HEIGHT = 300;

    MyPanel() throws IOException {

        image = new ImageIcon("obrazek.jpg").getImage();
        bufferedImage = ImageIO.read(new File("obrazek.jpg"));

        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));

    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image,0,0,null);

        image = bufferedImage.getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT);

        g2D.setPaint(Color.BLUE);
        g2D.setStroke(new BasicStroke(5));
//        g2D.drawLine(0,0,500,500);

//        g2D.setPaint(Color.pink);
//        g2D.drawRect(0,0,100,200);
//        g2D.fillRect(0,0,100,200);

//        g2D.setPaint(Color.orange);
//        g2D.drawOval(0,0,100,100);
//        g2D.fillOval(0,0,100,100);

        g2D.setPaint(Color.red);
//        g2D.drawArc(0,0,100,100,180,180);
        g2D.fillArc(0,0,100,100,0,180);
        g2D.setPaint(Color.WHITE);
        g2D.fillArc(0,0,100,100,180,180);

        int[] xPoints = {150,250,350};
        int[] yPoints = {300,150,300};
        g2D.setPaint(Color.yellow);
        g2D.drawPolygon(xPoints,yPoints,3);
        g2D.fillPolygon(xPoints,yPoints,3);

        g2D.setPaint(Color.magenta);
        g2D.setFont(new Font("Ink Free", Font.BOLD,50));
        g2D.drawString("U R A WINNER! :D",50,50);


}

}
