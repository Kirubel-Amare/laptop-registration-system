package edu.haramaya.laptopmanagement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

   public class CheckWindow extends RegistrationWindow{

    // checkWindow Buttons
    protected JButton searchButton = null;

    // constructor
    public CheckWindow(){
        searchButton= new JButton("Search");
    }

    public static void openRegistrationCheckWindow() {

    // object creation
    RegistrationWindow registrationWindow = new CheckWindow();
    CheckWindow checkWindow = new CheckWindow();


        JFrame thirdWindow = new JFrame("laptop management system");
        thirdWindow.setSize(300, 400);

        JLabel inputCheck = new JLabel("PLEASE ENTER PC OR MAC SERIAL NUMBER");
        thirdWindow.getContentPane().setLayout(null);
        inputCheck.setBounds(10, 10, 300, 30);
        thirdWindow.add(inputCheck);

        JTextField serialField = new JTextField();
        serialField.setBounds(50, 250, 100, 30);
        thirdWindow.add(serialField);

        checkWindow.searchButton.setBounds(150, 250, 80, 30);
        registrationWindow.exitButton.setBounds(80, 300, 80, 30);
        registrationWindow.backButton.setBounds(180, 300, 80, 30);

        thirdWindow.add(checkWindow.searchButton);
        thirdWindow.add(registrationWindow.exitButton);
        thirdWindow.add(registrationWindow.backButton);

     registerionWindow.checkButton.addActionListener(new ActionListner(){
          @Override
        public void actionPerformed(ActionEvent e) {
           thirdWindow.setVisible(false);
           LaptopManagement.openRegistrationFristWindow();
        }
     });

    registerionWindow.formatButton.addActionListener(new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e){
          thirdWindow.setVisible(false);
          LaptopManagement.openRegistationFristWindow();
       }
    });

    registrationWindow.backButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            thirdWindow.setVisible(false);
            LaptopManagement.openRegistrationFristWindow();
        }
        });

    registrationWindow.exitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });

    thirdWindow.setVisible(true);

    }

   }
