package entities;

import java.awt.*;

// Create and manage bricks,
// including collision
// detection with the ball.
public class BrickMap {
    //x and y positon
    public int brickLayout[][];
    public int brickHeight;
    public int brickWidth;

    public BrickMap(int rows, int colums){
        brickLayout = new int[rows][colums];
        for(int i=0;i<brickLayout.length;i++){
            for(int j=0;j<brickLayout[0].length;j++){
                brickLayout[i][j] = 1;
            }
        }
        brickHeight = 400/rows;
        brickWidth = 400/colums;
    }

    public void drawBrick(Graphics2D graphics2D) {
        for (int i = 0; i < brickLayout.length; i++) {
            for (int j = 0; j < brickLayout[0].length; j++) {
                if (brickLayout[i][j] > 0) {
                    graphics2D.setColor(new Color(0XCCFF99));
                    graphics2D.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                    graphics2D.setStroke(new BasicStroke(3));
                    graphics2D.setColor(Color.BLACK);
                    graphics2D.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, brickHeight);
                }
            }
        }
    }
}
