package edu.haramaya.laptopmanagement;

import javax.swing.*;


public class LaptopManagement {

        public static void main(String[] args) {

            openRegistrationFristWindow();
        }

        public static void openRegistrationFristWindow() {

            JFrame firstFrame = new JFrame("HU UNIVERSITY");
            firstFrame.setSize(300, 400);

            JLabel titleLabel = new JLabel(" HARAMAYA UNIVERSITY ");
            JLabel titleLabel2 = new JLabel(" STUDENT LAPTOP REGISTRATION");
            JLabel titleLabel3 = new JLabel("Let's put the safety and security ");
            JLabel titleLabel4 = new JLabel("of the haramaya student first !!");

            JButton registerButton = new JButton(" NEW Register");
            JButton checkButton = new JButton("Check");
            JButton exitButton = new JButton("Exit");

            // Set the position and size of each button
            titleLabel.setBounds(60, 10, 200, 30);
            titleLabel2.setBounds(30, 30, 300, 30);
            titleLabel3.setBounds(40, 280, 300, 30);
            titleLabel4.setBounds(50, 300, 300, 30);

            registerButton.setBounds(10, 150, 120, 25);
            checkButton.setBounds(150, 150, 120, 25);
            exitButton.setBounds(70, 210, 130, 25);

            // Add the buttons to the frame
            firstFrame.getContentPane().setLayout(null);
            firstFrame.add(titleLabel);
            firstFrame.add(titleLabel2);
            firstFrame.add(titleLabel3);
            firstFrame.add(titleLabel4);

            firstFrame.add(registerButton);
            firstFrame.add(checkButton);
            firstFrame.add(exitButton);

            registerButton.addActionListener(e -> {
               RegistrationWindow.openRegistrationWindow();
                firstFrame.dispose();
            });

            checkButton.addActionListener(e -> {
                CheckWindow.openRegistrationCheckWindow();
                firstFrame.dispose();
            });

            exitButton.addActionListener(e -> System.exit(0));

            firstFrame.setVisible(true);
        }


}


