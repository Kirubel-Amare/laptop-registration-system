package edu.haramaya.laptopmanagement;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

   public class CheckWindow {

      public static void openRegistrationCheckWindow() {

          JFrame thirdWindow = new JFrame("laptop management system");
          thirdWindow.setSize(300, 400);

          JLabel inputCheck = new JLabel("PLEASE ENTER PC OR MAC SERIAL NUMBER");
          thirdWindow.getContentPane().setLayout(null);
          inputCheck.setBounds(10, 10, 300, 30);
          thirdWindow.add(inputCheck);

          JTextField serialField = new JTextField();
          serialField.setBounds(50, 50, 130, 30);
          thirdWindow.add(serialField);

          JButton enterButton = new JButton("-->");
          JButton exitButton = new JButton("Exit");
          JButton backButton = new JButton("Back");

          enterButton.setBounds(200, 50, 50, 30);
          exitButton.setBounds(80, 300, 80, 30);
          backButton.setBounds(180, 300, 80, 30);

          thirdWindow.add(enterButton);
          thirdWindow.add(exitButton);
          thirdWindow.add(backButton);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                thirdWindow.setVisible(false);
                LaptopManagement.openRegistrationFristWindow();
            }
            });
enterButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String pc_Serial = serialField.getText();
        String url = "jdbc:sqlite:student.db";

        try(Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement()){

            String selectSql = String.format("SELECT * FROM student WHERE Pc_seril = %s",pc_Serial);

            ResultSet rs = stmt.executeQuery(selectSql);
            if(rs.next()){
                String Department = rs.getString("Department");
                String laptop = rs.getString("Laptop");
                int Contact =rs.getInt("Contact");
                String fistname = rs.getString("fistname");
                String lastname = rs.getString("lastname");
                String studentId = rs.getString("student_id");
                int age = rs.getInt("age");
                char gender = rs.getString("Gender").charAt(0);


                System.out.println(" Student information: ");
                System.out.println("Fist name: " + fistname);
                System.out.println("Last name: " + lastname);
                System.out.println("Student ID: " + studentId);
                System.out.println("Laptop: " + laptop);
                System.out.println("Department: " + Department);
                System.out.println("Contact: " + Contact);
                System.out.println("Age: " + age);
                System.out.println("Gender: " + gender);
            } else {
                System.out.println("No student found with the specified serial number.");
            }
        }catch (SQLException s) {
            System.err.format("An error occurred: %s", s.getMessage());
        }
    }
});
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        thirdWindow.setVisible(true);

      }

   }