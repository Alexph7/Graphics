package rostotest;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author ph757
 */
public class RostoGraphics extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Desenha Rosto
        g.setColor(Color.yellow);
        g.fillOval(10, 10, getWidth() - 20, getHeight() - 20);

    }

}
