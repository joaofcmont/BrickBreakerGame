package program;

import entities.BrickMap;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

// Initialize game elements,
// set up the game loop,
// handle input,
// and draw the game.
public class Application extends JFrame {

    private BrickMap brickMap;

    public Application(){
        JButton startButton = new JButton("Start Game");
        startButton.setVisible(true);
        startButton.setFocusable(false);
        JFrame startFrame = new JFrame();
        startFrame.setLayout( new BorderLayout() );
        startFrame.add(startButton, BorderLayout.CENTER);
        startFrame.setVisible(true);
        startFrame.setSize(400,400);
        startFrame.setTitle("Brick Breaker's");
        startFrame.setLocationRelativeTo(null);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startFrame.dispose();
                showGameWindow();
            }

        });

    }

    private void showGameWindow() {
        JFrame gameFrame = new JFrame();
        GamePanel gamePanel = new GamePanel();  // Custom JPanel where the game will be drawn

        gameFrame.add(gamePanel);  // Add game panel to the frame
        gameFrame.setSize(700, 600);  // Adjusted size to fit bricks
        gameFrame.setVisible(true);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setTitle("Brick Breaker's");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


