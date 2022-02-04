package com.company;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
public class game {

    public static void main(String[] args){
        new Images();
        JFrame frame = new Jframe();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(new GamePanel(), BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
