package edu.haramaya.laptopmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                try{
                    String idno = idField.getText();
                    String inputName = nameField.getText();
                    String departmentInput = departmentFiled.getText();
                    String pcSerialNumber =serialFiled.getText();
                    String contactNumber = contactField.getText();
                    isvalidateId(idno);
                    isVAlidName(inputName);
                    isValidDepartment(departmentInput);
                    isValidSerialNumber(pcSerialNumber);
                    isvalidContactNumber(contactNumber);
                    
                }catch(Exception error){
                    error.getMessage();
                }
                   
                        String id = idField.getText();
                        String name = nameField.getText();
                        String department=departmentFiled.getText();
                        String gender = male.isSelected() ? "Male" : "Female";
                        String laptop=window.isSelected()? "window":"linux";
                        String serial=serialFiled.getText();
                        String contact = contactField.getText();

                        // Add the data to the table model
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(new Object[]{id, name,department, gender,laptop,serial, contact});

                        // Clear the input fields
                        idField.setText("");
                        nameField.setText("");
                        departmentFiled.setText("");
                        serialFiled.setText("");
                        contactField.setText("");
                        bg.clearSelection();
                        bg1.clearSelection();
                      
            }});


            backButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    secondFrame.setVisible(true);
                    LaptopManagement.openRegistrationFristWindow();
                }
            });

            exitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

             // The code `refresh.addActionListener(new ActionListener() { ... })` adds an action
            // listener to the `refresh` button. When the button is clicked, the code inside the
            // `actionPerformed` method will be executed. 

            refresh.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   idField.setText("");
                   nameField.setText("");
                   serialFiled.setText("");
                   departmentFiled.setText("");
                   contactField.setText("");
                   bg.clearSelection();
                   bg1.clearSelection();
                }
            });
    }

   /**
    * The function "validateId_input" checks if the input idno is valid by matching it against a
    * regular expression pattern.
    * 
    * @param idno The idno parameter is a string representing an identification number.
    * @return The method is returning a boolean value, which indicates whether the idno input is valid
    * or not.
    */
    private static boolean isvalidateId(String idno){
        boolean isValidId = true;
        try {
                String id_matches = "[0-9/]{7}";

                if(!idno.matches(id_matches)){
                    JOptionPane.showMessageDialog(null, "Please enter a idno (six digit and backslash only).", "Invalid id_No", JOptionPane.ERROR_MESSAGE);
                    
                    isValidId = false;
                }  
        } catch (Exception e) {
            e.getMessage();
        }
        return isValidId;
    }

    /**
     * The function isVAlidName checks if a given input name is valid, meaning it only contains letters
     * and spaces.
     * 
     * @param inputname The input name that needs to be validated.
     * @return The method is returning a boolean value, which indicates whether the input name is valid
     * or not.
     */
    private static boolean isVAlidName(String inputname){
        boolean isValidName = true;
        try {
            
            String name_matches = "[a-zA-Z]+([ -][a-zA-Z]+)*";

            if (!inputname.matches(name_matches)) {
                JOptionPane.showMessageDialog(null, "Please enter a  correct name (letter s and spaces only).", "Invalid name", JOptionPane.ERROR_MESSAGE);  
                isValidName = false;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return isValidName;
    }

    /**
     * The function checks if a given department name is valid, which means it only contains letters
     * and spaces.
     * 
     * @param department The parameter "department" is a string that represents the name of a
     * department.
     * @return The method is returning a boolean value, which indicates whether the department name is
     * valid or not.
     */
    private static  boolean isValidDepartment(String department){
        boolean isvalidDep = true;

        try {
            String departmen_matches  = "^[a-zA-Z\\s]+$";

            if (!department.matches(departmen_matches)) {
                JOptionPane.showMessageDialog(null, "Please enter a  correct department name (letters and spaces only).", "Invalid department name", JOptionPane.ERROR_MESSAGE);
                isvalidDep = false;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return isvalidDep;
    }

    /**
     * The function checks if a given serial number is valid by matching it against a regular
     * expression pattern.
     * 
     * @param serialNumber The serial number of a PC.
     * @return The method is returning a boolean value, which indicates whether the given serial number
     * is valid or not.
     */
    private static boolean isValidSerialNumber(String serialNumber) {
        boolean isValidSerial = false;
        try {
            String pcSerialNumber_matches = "[a-zA-Z0-9]{6,12}";

            if (!serialNumber.matches(pcSerialNumber_matches)) {
                    JOptionPane.showMessageDialog(null, "Please enter a  correct your pc serail Number (letters and number only).", "Invalid pc serial number", JOptionPane.ERROR_MESSAGE);
                    isValidSerial = false;                 
            }
            
        } catch (Exception e) {
            e.getMessage();
        }
        return isValidSerial;
    }

    /**
     * The function isvalidContactNumber checks if a given contact number is valid by matching it
     * against a regular expression pattern.
     * 
     * @param contactNumber The contact number that needs to be validated.
     * @return The method is returning a boolean value, which indicates whether the contact number is
     * valid or not.
     */
    private static boolean  isvalidContactNumber(String contactNumber){
        boolean isValidContact = true;

        try {
            String contact_matches = "^09[0-9]{8}";

            if (!contactNumber.matches(contact_matches)) {
                    JOptionPane.showMessageDialog(null, "Please enter a  correct your contact Number (start with 09 and can't exceed 10 digit).", "Invalid contact Number", JOptionPane.ERROR_MESSAGE);
                    isValidContact = false;
            }  
        } catch (Exception e) {
            e.getMessage();
        }
        return isValidContact;
    }

}

