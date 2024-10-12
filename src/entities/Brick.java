package entities;

import javax.swing.text.Position;

// Create and manage bricks,
// including collision
// detection with the ball.
public class Brick {
    //x and y positon
    Position position;
    //if the state is false,
    // the brick was hitted
    // and should be removed
    // from the grid
    boolean state;


    public Brick(Position position,boolean state) {
        this.position = position;
        this.state = state;
    }

}
