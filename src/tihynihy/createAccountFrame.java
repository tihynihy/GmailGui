package tihynihy;

import dataBase.userData;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class createAccountFrame extends JFrame implements ActionListener, MouseListener {

        JLabel nameLabel;
        JLabel surnameLabel;
        JLabel emailLabel;
        JLabel passwordLabel;
        JLabel confirmPasswordLabel;
        JLabel errorNotSimilar;

        JTextField nameField;
        JTextField surnameField;
        JTextField emailField;
        JPasswordField passwordField;
        JPasswordField confirmPasswordField;


        ImageIcon gmailLogo = new ImageIcon("gmailLogo.png");
        JLabel imageLabel;

        JButton confirmButton;
        JButton resetButton;

        Border blackBorder;

        public createAccountFrame(){

            //Declared objects()

            JPanel mainPanel = new JPanel();
            blackBorder = BorderFactory.createLineBorder(Color.BLACK,2);



            imageLabel = new JLabel();
            imageLabel.setLayout(null);
            imageLabel.setBounds(200,0,300,300);
            imageLabel.setIcon(gmailLogo);



            nameLabel = new JLabel("Name: ");
            nameLabel.setBounds(100,250,50,30);

            nameField = new JTextField();
            nameField.setBounds(150,250,250,30);



            surnameLabel = new JLabel("Surname: ");
            surnameLabel.setBounds(83,350,90,30);

            surnameField = new JTextField();
            surnameField.setBounds(150,350,250,30);

            emailLabel = new JLabel("Email: ");
            emailLabel.setBounds(100,450,50,30);

            emailField = new JTextField();
            emailField.setBounds(150,450,250,30);


            passwordLabel = new JLabel("Password: ");
            passwordLabel.setBounds(83,550,90,30);

            passwordField = new JPasswordField();
            passwordField.setBounds(150,550,250,30);

            confirmPasswordLabel = new JLabel("Confirm password: ");
            confirmPasswordLabel.setBounds(35,600,130,30);

            confirmPasswordField = new JPasswordField();
            confirmPasswordField.setBounds(150,600,250,30);

            errorNotSimilar = new JLabel("Password does not match !");
            errorNotSimilar.setBounds(410,600,170,30);
            errorNotSimilar.setForeground(Color.red);
            errorNotSimilar.setVisible(false);



            confirmButton = new JButton("CONFIRM");
            confirmButton.setBounds(450,660,100,30);
            confirmButton.setFocusable(false);
            confirmButton.setBackground(new Color(220, 7, 7));
            confirmButton.setForeground(Color.black);
            confirmButton.setBorder(blackBorder);
            confirmButton.addMouseListener(this);
            confirmButton.addActionListener(this);



            resetButton = new JButton("RESET");
            resetButton.setBounds(300,660,100,30);
            resetButton.setFocusable(false);
            resetButton.setBackground(new Color(220, 7, 7));
            resetButton.setForeground(Color.black);
            resetButton.setBorder(blackBorder);
            resetButton.addMouseListener(this);
            resetButton.addActionListener(this);



            mainPanel.setLayout(null);
            mainPanel.setBounds(0,0,600,800);
            mainPanel.setBackground(new Color(245, 197, 197, 255));



            mainPanel.add(imageLabel);

            mainPanel.add(nameLabel);
            mainPanel.add(nameField);

            mainPanel.add(surnameLabel);
            mainPanel.add(surnameField);

            mainPanel.add(emailLabel);
            mainPanel.add(emailField);

            mainPanel.add(passwordLabel);
            mainPanel.add(passwordField);

            mainPanel.add(confirmPasswordLabel);
            mainPanel.add(confirmPasswordField);
            mainPanel.add(errorNotSimilar);

            mainPanel.add(confirmButton);

            mainPanel.add(resetButton);



            this.setTitle("Gmail - Create an Account ");
            this.setSize(600,800);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.add(mainPanel);
            this.setVisible(true);

        }


    @Override
    public void actionPerformed(ActionEvent e) {

    userData data = new userData();

    if(!nameField.equals(  data.getUserName1())&&  !nameField.equals(data.getUserName2())&&  !nameField.equals(data.getUserName3())&&  !nameField.equals(data.getUserName4())&&  !nameField.equals(data.getUserName5()) ){

        this.dispose();
        new myFrame();

    }
            else if(e.getSource()==resetButton){


                nameField.setText(null);
                surnameField.setText(null);
                emailField.setText(null);
                passwordField.setText(null);
                confirmPasswordField.setText(null);
                errorNotSimilar.setVisible(false);


    }

    else if(passwordField!=(confirmPasswordField)){

        errorNotSimilar.setVisible(true);

    }

    }








    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==confirmButton){
            confirmButton.setBackground(new Color(255, 0, 0, 255));
            confirmButton.setForeground(new Color(7, 5, 5));
        } else if(e.getSource()==resetButton){
            resetButton.setBackground(new Color(255, 0, 0, 255));
            resetButton.setForeground(new Color(7, 5, 5));

        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==confirmButton){
            confirmButton.setBackground(new Color(220, 7, 7));
        } else if(e.getSource()==resetButton){
            resetButton.setBackground(new Color(220, 7, 7));
        }

    }



    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

}
