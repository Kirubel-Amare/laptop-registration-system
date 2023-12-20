package edu.haramaya.laptopmanagement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   public class CheckWindow {

      public static void openRegistrationWindow2() {

        JFrame thirdWindow = new JFrame("laptop management system");
        thirdWindow.setSize(300, 400);

        JLabel inputCheck = new JLabel("PLEASE ENTER PC OR MAC SERIAL NUMBER");
        thirdWindow.getContentPane().setLayout(null);
        inputCheck.setBounds(10, 10, 300, 30);
        thirdWindow.add(inputCheck);


        JButton enterButton = new JButton("-->");
        enterButton.setBounds(200, 50, 50, 30);
        thirdWindow.add(enterButton);


        JTextField serialField = new JTextField();
        serialField.setBounds(50, 50, 130, 30);
        thirdWindow.add(serialField);

        JButton backButton = new JButton("Back");
        backButton.setBounds(180, 300, 80, 30);
        thirdWindow.add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thirdWindow.setVisible(false);
                LaptopManagement.openRegistrationWindow3();
            }
            });


                JButton exitButton = new JButton("Exit");
                exitButton.setBounds(80, 300, 80, 30);
                thirdWindow.add(exitButton);

                exitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });


                thirdWindow.setVisible(true);

            }

      }