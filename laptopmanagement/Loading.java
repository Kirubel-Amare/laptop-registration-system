package edu.haramaya.laptopmanagement;

import java.awt.*;
import javax.swing.*;

public class Loading {

    JFrame frame = new JFrame();
    JLabel label;
    JProgressBar bar = new JProgressBar(0,100);

    Loading(){

        bar.setValue(0);
        bar.setBounds(150, 400, 700, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("SANS_SERIF", Font.BOLD, 25));
        bar.setBackground(Color.black);
        bar.setForeground(new Color(0x27ae60));
        frame.add(bar);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Starting a system");
        frame.getContentPane().setBackground(new Color (0x2ecc71));
        frame.setOpacity(1);
        frame.setSize(1000, 700);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }


    public void fill() {

        int counter = 0;
        int after = 0;

        while(counter<=100){

            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("The System is ready");


        while(after <= 30){

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            after += 1;
        }

        frame.dispose();


    }


    
}
