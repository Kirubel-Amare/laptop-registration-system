package edu.haramaya.laptopmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class RegistrationWindow{

        public static void openRegistrationWindow() {

            JFrame secondFrame = new JFrame("laptop management system");
            secondFrame.setSize(950, 450);

            JButton registerButton = new JButton("Register");
            JButton updateButton = new JButton("Update");
            JButton deleteButton = new JButton("Delete");
            JButton exitButton = new JButton("Exit");
            JButton backButton = new JButton("<--");

            // Set the position and size of each button
            registerButton.setBounds(10, 310, 130, 25);
            updateButton.setBounds(150, 310, 130, 25);
            deleteButton.setBounds(10, 350, 130, 25);
            exitButton.setBounds(150, 350, 130, 25);
            backButton.setBounds(10, 7, 50, 30);

            // Add the buttons to the frame
            secondFrame.add(registerButton);
            secondFrame.add(updateButton);
            secondFrame.add(deleteButton);
            secondFrame.add(exitButton);
            secondFrame.add(backButton);

            JLabel title = new JLabel("laptop Registration");
            JLabel id = new JLabel("ID");
            JLabel name = new JLabel("Name");
            JLabel department = new JLabel("Department");
            JLabel gender = new JLabel("Gender");
            JLabel laptop = new JLabel("Laptop");
            JLabel serialNumber = new JLabel("Pc serial");
            JLabel contact = new JLabel("Contact");

            // Set the position and size of each button
            title.setBounds(60, 7, 200, 30);
            id.setBounds(30, 50, 60, 30);
            name.setBounds(30, 85, 60, 30);
            department.setBounds(30, 120, 60, 30);
            gender.setBounds(30, 155, 60, 30);
            laptop.setBounds(30, 190, 60, 30);
            serialNumber.setBounds(30, 225, 60, 30);
            contact.setBounds(30, 260, 60, 30);

            // Add the buttons to the frame
            secondFrame.getContentPane().setLayout(null);
            secondFrame.add(title);
            secondFrame.add(id);
            secondFrame.add(name);
            secondFrame.add(department);
            secondFrame.add(gender);
            secondFrame.add(laptop);
            secondFrame.add(serialNumber);
            secondFrame.add(contact);

            JTextField idField = new JTextField();
            JTextField nameField = new JTextField();
            JTextField departmentFiled = new JTextField();
            JTextField serialFiled = new JTextField();
            JTextField contactField = new JTextField();

            // Set the position and size of each button
            idField.setBounds(95, 50, 130, 30);
            nameField.setBounds(95, 85, 130, 30);
            departmentFiled.setBounds(95, 120, 130, 30);
            serialFiled.setBounds(95, 225, 130, 30);
            contactField.setBounds(95, 260, 130, 30);

            // Add the buttons to the frame
            secondFrame.add(idField);
            secondFrame.add(nameField);
            secondFrame.add(departmentFiled);
            secondFrame.add(serialFiled);
            secondFrame.add(contactField);

            JRadioButton male = new JRadioButton("Male");
            JRadioButton female = new JRadioButton("Female");

            JRadioButton window = new JRadioButton("Window");
            JRadioButton mac = new JRadioButton("Mac");
           

            // Set the position and size of each button
            male.setBounds(95, 155, 60, 30);
            female.setBounds(155, 155, 70, 30);
                
            window.setBounds(95, 190, 60, 30);
            mac.setBounds(155, 190, 70, 30);
            

            // Add the buttons to the frame
            secondFrame.add(male);
            secondFrame.add(female);
            secondFrame.add(window);
            secondFrame.add(mac);

            ButtonGroup bg = new ButtonGroup();
            bg.add(male);
            bg.add(female);

            ButtonGroup bg1 = new ButtonGroup();
            bg1.add(window);
            bg1.add(mac);


            JPanel panel=new JPanel();
            panel.setLayout(new GridLayout());
            panel.setBounds(300,20,580,330);
            secondFrame.add(panel);

            JButton refresh=new JButton("Refresh Table");
            refresh.setBounds(400,350,270,15);
            secondFrame.add(refresh);

            DefaultTableModel model=new DefaultTableModel();
            JTable table=new JTable(model);
            table.getTableHeader().setReorderingAllowed(false);

            model.addColumn("ID");
            model.addColumn("NAME");
            model.addColumn("DEPARTMENT");
            model.addColumn("Gender");
            model.addColumn("LAPTOP");
            model.addColumn("PC SERIAL");
            model.addColumn("CONTACT");

            // Enable Scrolling on table

            JScrollPane scrollPane = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            panel.add(scrollPane);

            // Make the second window visible
            scrollPane.setVisible(true);
            secondFrame.setVisible(true);

            registerButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                RegistrationWindow.openRegistrationWindow();
                    String url = "jdbc:sqlite:student.db";

                    String createTableSql = "CREATE TABLE IF NOT EXISTS student (" +
                            "Pc_serial INTEGER PRIMARY KEY," +
                            "first_name VARCHAR(50) NOT NULL," +
                            "last_name VARCHAR(50) NOT NULL," +
                            "student_id VARCHAR(10) UNIQUE NOT NULL," +
                            "Laptop VARCHAR(50) NOT NULL," +
                            "Department VARCHAR(50) NOT NULL," +
                            "Contact INTEGER NOT NULL," +
                            "age INTEGER NOT NULL," +
                            "Gender CHAR(1) NOT NULL" +
                            ");";

                    try (Connection conn = DriverManager.getConnection(url);
                        Statement stmt = conn.createStatement()){

                stmt.executeUpdate(createTableSql);


                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Enter the number of students to register: ");
                            int numStudents = scanner.nextInt();
                            for (int i = 0; i < numStudents; i++) {

//                        System.out.println("student :  " + (++i) + "#");
                                System.out.println("Enter student ID: ");
                                String studentId = scanner.next();

                                System.out.println("Enter first name: ");
                                String firstName = scanner.next();
                                System.out.println("Enter last name: ");
                                String lastName = scanner.next();
                                System.out.println("Enter Department: ");
                                String department = scanner.next();
                                System.out.println("Enter Gender (M/F): ");
                                char gender = scanner.next().charAt(0);
                                System.out.println("Enter Laptop: ");
                                String laptop = scanner.next();
                                System.out.println("Enter Pc_serial: ");
                                int pcSerial = scanner.nextInt();
                                System.out.println("Enter Contact: ");
                                int contact = scanner.nextInt();
                                System.out.println("Enter age: ");
                                int age = scanner.nextInt();

                                String insertSql = "INSERT INTO student (Pc_serial, first_name, last_name, Department, Laptop, student_id, Contact, age, Gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement pstmt = conn.prepareStatement(insertSql);
                                pstmt.setInt(1, pcSerial);
                                pstmt.setString(2, firstName);
                                pstmt.setString(3, lastName);
                                pstmt.setString(4, department);
                                pstmt.setString(5, laptop);
                                pstmt.setString(6, studentId);
                                pstmt.setInt(7, contact);
                                pstmt.setInt(8, age);
                                pstmt.setString(9, String.valueOf(gender));

                                pstmt.executeUpdate();
                            }

                            System.out.println("New student records added succefully.");
                            }catch (SQLException ex){
                            System.err.format("An error occurred: %s", ex.getMessage());
                        }
                     }
                });
            updateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:sqlite:student.db";
                    try (Connection conn = DriverManager.getConnection(url);
                         Statement stmt = conn.createStatement();
                         Scanner scanner = new Scanner(System.in)) {

                         System.out.print("Enter Pc_serial: ");
                         int pcSerial = scanner.nextInt();


                         System.out.print("Enter first_name: ");
                         String firstName = scanner.next();

                         System.out.print("Enter last_name: ");
                         String lastName = scanner.next();

                         System.out.print("Enter student_id: ");
                         String studentId = scanner.next();

                         System.out.print("Enter Laptop: ");
                         String laptop = scanner.next();

                         System.out.print("Enter Department: ");
                         String department = scanner.next();

                         System.out.print("Enter Contact: ");
                         int contact = scanner.nextInt();

                         System.out.print("Enter age: ");
                         int age = scanner.nextInt();

                         System.out.print("Enter Gender: ");
                         char gender = scanner.next().charAt(0);

                         String updateSql = "UPDATE student SET Pc_serial=?, first_name=?, last_name=?, student_id=?, Laptop=?, Department=?, Contact=?, age=?, Gender=? WHERE Pc_serial=?";
                         PreparedStatement preparedStatement = conn.prepareStatement(updateSql);
                         preparedStatement.setInt(1, pcSerial);
                         preparedStatement.setString(2, firstName);
                         preparedStatement.setString(3, lastName);
                         preparedStatement.setString(4, studentId);
                         preparedStatement.setString(5, laptop);
                         preparedStatement.setString(6, department);
                         preparedStatement.setInt(7, contact);
                         preparedStatement.setInt(8, age);
                         preparedStatement.setString(9, String.valueOf(gender));
                         preparedStatement.setInt(10, pcSerial);
                         preparedStatement.executeUpdate();

                         System.out.println("Student record updated successfully.");
                } catch (SQLException s) {
                    System.err.format("An error occurred: %s", s.getMessage());
                }
            }
        });

            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String url = "jdbc:sqlite:student.db";
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter the serial number of the Laptop to delete:");
                    int Pc_serial = scanner.nextInt();
                    try (Connection conn = DriverManager.getConnection(url);
                         Statement stmt = conn.createStatement()) {
                        int rowCount = stmt.executeUpdate("DELETE FROM student WHERE Pc_serial = " + Pc_serial);
                        if (rowCount > 0) {
                            System.out.println("Student deleted successfully.");
                        } else {
                            System.out.println("No student found with the given serial number.");
                        }
                    } catch (SQLException f) {
                        System.out.println("An error occurred while deleting student data.");
                        f.printStackTrace();
                    }
                }
      });

            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    secondFrame.setVisible(false);
                    LaptopManagement.openRegistrationFristWindow();
                }
            });

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
    }
}

