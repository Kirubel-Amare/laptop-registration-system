package edu.haramaya.laptopmanagement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaptopManagement {

    // Buttons
    protected JButton registerButton = null;
    protected JButton exitButton = null;
    protected JButton checkButton = null;

    // Laptop Managment Constructor 
    public LaptopManagement(){
        registerButton = new JButton("New Register");
        exitButton = new JButton("Exit");
        checkButton = new JButton("Check");
    }

    public static void main(String[] args) {
        openRegistrationFristWindow();
    }

    public static void openRegistrationFristWindow() {

        // object creation for LaptopManagment
        LaptopManagement lmanagement = new LaptopManagement();

        JFrame firstFrame = new JFrame("HARAMAYA UNIVERSITY");
        firstFrame.setSize(300, 400);

        JLabel titleLabel = new JLabel(" HARAMAYA UNIVERSITY ");
        JLabel titleLabel2 = new JLabel(" STUDENT PC CONTROL SYSTEM");
        JLabel titleLabel3 = new JLabel("Let's put the safety and security ");
        JLabel titleLabel4 = new JLabel("of the haramaya student first !!");

        // Set the position and size of each button
        titleLabel.setBounds(60, 10, 200, 30);
        titleLabel2.setBounds(30, 30, 300, 30);
        titleLabel3.setBounds(40, 280, 300, 30);
        titleLabel4.setBounds(50, 300, 300, 30);
        
        lmanagement.registerButton.setBounds(10,150,120,25);
        lmanagement.checkButton.setBounds(150, 150, 120, 25);
        lmanagement.exitButton.setBounds(70, 210, 130, 25);

        // Add the buttons to the frame
        firstFrame.getContentPane().setLayout(null);
        firstFrame.add(titleLabel);
        firstFrame.add(titleLabel2);
        firstFrame.add(titleLabel3);
        firstFrame.add(titleLabel4);

        firstFrame.add(lmanagement.registerButton);
        firstFrame.add(lmanagement.checkButton);
        firstFrame.add(lmanagement.exitButton);

        lmanagement.registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegistrationWindow.openRegistrationWindow();
                firstFrame.dispose();
            }
        });

        lmanagement.checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CheckWindow.openRegistrationCheckWindow();
                firstFrame.dispose();
            }
        });

        lmanagement.exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        firstFrame.setVisible(true);
    }


}


