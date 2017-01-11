package ui;



import javax.swing.*;
import java.awt.*;

/**
 * Created by Xie on 2017.1.11.
 */
public class PanelGame extends JPanel {

    public PanelGame() {

    }

    @Override
    public void paintComponent(Graphics g) {
        Image img = new ImageIcon("./graphics/window/Window.png").getImage();
//        g.drawImage(img, 32, 32, null);
        g.drawImage(img, 0, 0, 64, 64, 0, 0, 7, 7, null);

    }

}
