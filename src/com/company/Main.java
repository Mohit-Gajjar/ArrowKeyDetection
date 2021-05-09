package com.company;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public Main(){


            JFrame frame = new JFrame();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 70);
            frame.setTitle("Aero key detector");

            JPanel panel = new JPanel();
            JLabel up = new JLabel();
            JLabel down = new JLabel();
            JLabel left = new JLabel();
            JLabel right = new JLabel();

            panel.add(up);
            panel.add(down);
            panel.add(left);
            panel.add(right);

            frame.add(panel);

            up.setText("UP: ");
            down.setText("DOWN: ");
            left.setText("LEFT: ");
            right.setText("RIGHT: ");

            frame.addKeyListener(new KeyListener() {
                int upKey, downKey, rightKey, leftKey = 0;
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    int pressedKey = e.getKeyCode();
                    switch (pressedKey){
                        case KeyEvent.VK_UP:
                            up.setText("UP: " + upKey++);
                            break;
                        case KeyEvent.VK_DOWN:
                            down.setText("DOWN: " + downKey++);
                            break;
                        case KeyEvent.VK_RIGHT:
                            right.setText("RIGHT: " + rightKey++);
                            break;
                        case KeyEvent.VK_LEFT:
                            left.setText("LEFT: " + leftKey++);
                            break;
                        default:
                            System.out.println("Invalid keypress...!");
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
    }
    public static void main(String[] args) {
	new Main();
    }
}
