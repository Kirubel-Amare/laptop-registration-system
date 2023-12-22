package edu.haramaya.laptopmanagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class LoginPage extends JFrame implements ActionListener{

    JPanel panel;
    JFrame frame;

    JLabel label;
    JLabel label2;
    JLabel label3;

    JPasswordField password;
    JButton button;
    String systemPassword = "abcd";

    int count = 0;
    
    LoginPage(){

        label = new JLabel("Enter Password to Start the System");
        password = new JPasswordField();
        panel = new JPanel();
        frame = new JFrame();
        

        button = new JButton("submit");
        button.setBounds(410, 350, 200, 50);
        button.setFocusable(false);
        button.addActionListener(this);
        panel.add(button);


        label.setBounds(270, 200, 530, 50);
        label.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        label.setForeground(new Color(0xffffff));
        panel.add(label);

        // label2 = new JLabel("WELCOME TO THE SYSTEM");
        // label2.setBounds(360, 430, 300, 50);
        // label2.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        // label2.setForeground(new Color(0X000000));
        // label2.setVisible(false);
        // panel.add(label2);

        label3 = new JLabel("WRONG PASSWORD");
        label3.setBounds(360, 430, 400, 50);
        label3.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        label3.setForeground(new Color(0Xffffff));
        label3.setVisible(false);
        panel.add(label3);

    
        password.setBounds(360, 265, 300, 50);
        password.setFont(new Font("SANS_SERIF", Font.BOLD, 30));
        password.setForeground(new Color(0x000000));
        password.setBackground(Color.white);
        password.setCaretColor(Color.black);
        panel.add(password);

        panel.setLayout(null);
        panel.setBackground(new Color(0x2ecc71));
        // panel.setOpacity(1);
        frame.add(panel);


        frame.setSize(1000, 700);
        //frame.getContentPane().setBackground(new Color (0x2ecc71));
        frame.setOpacity(1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        var pass = password.getPassword();
        var pass2 = String.valueOf(pass);

        if(pass2.equals(systemPassword)){

            label3.setVisible(false);
            frame.dispose();
            new Welcome();

            // while(count <= 20){
            //     try {
            //         Thread.sleep(50);
            //     } catch (InterruptedException ex) {
            //         // TODO Auto-generated catch block
            //         ex.printStackTrace();
            //     }
            //     count += 1;
            // }
            
        }else{
            label3.setVisible(true);
        }

        
    }

}
