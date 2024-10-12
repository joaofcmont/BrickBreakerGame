package program;

import entities.BrickMap;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private BrickMap brickMap;

    public GamePanel() {
        brickMap = new BrickMap(3, 7);  // Define 3 rows and 7 columns of bricks
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        brickMap.drawBrick((Graphics2D) g);  // Call the drawBrick() method from BrickMap to draw all bricks
    }
}
