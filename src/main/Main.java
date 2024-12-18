package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");

        GameScreen gameScreen = new GameScreen();
        window.add(gameScreen);
        window.pack(); // causes window to fit gameScreen's dimensions

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        gameScreen.startGameThread();
    }
}
