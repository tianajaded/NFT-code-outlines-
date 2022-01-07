import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    MyFrame() {

        panel = new MyPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.add(panel);
        this.pack();
        // set location relative to null allows it to show in
        // middle of screen rather than top left corner
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
