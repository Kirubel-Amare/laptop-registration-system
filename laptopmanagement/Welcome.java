package edu.haramaya.laptopmanagement;

import java.awt.*;
import javax.swing.*;

public class Welcome {

    JFrame frame = new JFrame();
    JLabel label;

    Welcome (){

        label = new JLabel("WELCOME !!!");
        label.setBounds(360, 340, 400, 50);
        label.setFont(new Font("SANS_SERIF", Font.BOLD, 40));
        label.setForeground(new Color(0xffffff));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("welcome page");
        frame.getContentPane().setBackground(new Color (0x2ecc71));
        frame.setOpacity(1);
        frame.setSize(1000, 700);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    
}
