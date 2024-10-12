package program;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Application extends JFrame {

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

    private void showGameWindow(){
        JFrame gameFrame = new JFrame();
        gameFrame.setLayout(new BorderLayout());
        gameFrame.setSize(400,400);
        gameFrame.setVisible(true);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setTitle("Brick Breaker's");
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


