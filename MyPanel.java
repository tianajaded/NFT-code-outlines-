import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class MyPanel<Image> extends JPanel {

    Image image;

    MyPanel() {
        // if you want to draw on top of another image you already have, use code below
        // image = new ImageIcon("sky.png").getImage();
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        // draws blue diagonal line
        g2D.setPaint(Color.BLUE);
        g2D.setStroke(new BasicStroke(4));
        g2D.drawLine(0, 0, 500, 500);
        // draws pink rectangle
        g2D.setPaint(Color.magenta);
        g2D.drawRect(200, 125, 100, 200);
        g2D.fillRect(200, 125, 100, 200);
        // draws black circle
        g2D.setPaint(Color.black);
        g2D.drawOval(2, 2, 100, 100);
        g2D.fillOval(2, 2, 100, 100);

        // arc makes half a circle, half of pokeball
        // g2D.drawArc(0, 0, 100, 100, 0, 180);
        // makes top arc red
        g2D.setPaint(Color.red);
        g2D.fillArc(2, 2, 100, 100, 0, 180);
        // makes bottom arc white
        g2D.setPaint(Color.white);
        g2D.fillArc(2, 2, 100, 100, 180, 180);
        // draw black line across but stops before middle circle
        g2D.setPaint(Color.black);
        g2D.drawLine(1, 50, 42, 50);
        // draws second line across from circle to end of pokeball
        g2D.setPaint(Color.black);
        g2D.drawLine(2, 50, 100, 50);
        // draws middle black circle in center of ball
        g2D.drawOval(44, 42, 15, 15);
        // draw middle white circle
        g2D.setPaint(Color.WHITE);
        g2D.drawOval(48, 46, 7, 7);

        // drawing a triangle with array of points
        int[] xPoints = { 150, 250, 350 };
        int[] yPoints = { 300, 150, 300 };
        g2D.setPaint(Color.yellow);
        // 3 is number of points
        g2D.drawPolygon(xPoints, yPoints, 3);
        g2D.fillPolygon(xPoints, yPoints, 3);

        // writing text
        g2D.drawString("happy new yr", 215, 150);
        // change font
        g2D.setFont(new Font("Ink Free", Font.BOLD, 100));
        g2D.setPaint(Color.magenta);

        // method for adding to another graphic from line 17
        // g2D.drawImage(image, 0, 0, null)
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
