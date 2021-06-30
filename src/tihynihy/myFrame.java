package tihynihy;

import dataBase.userData;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class myFrame extends JFrame implements ActionListener, MouseListener {

    JPanel mainPanel;
    JTextField userField;
    JPasswordField passwordField;
    Border blackBorder;
    JLabel logoLabel;

    JButton hintButton;
    JButton logButton;

    ImageIcon gmailIcon = new ImageIcon("gmailLogo.png");
    userData data = new userData();

    myFrame(){

        logoLabel = new JLabel();
        logoLabel.setLayout(null);
        logoLabel.setBounds(175,0,200,200);
        logoLabel.setIcon(gmailIcon);
        blackBorder = BorderFactory.createLineBorder(Color.BLACK,2);


        userField = new JTextField();
        userField.setBounds(200,200,150,30);
        userField.setText("Email");
        userField.setBorder(blackBorder);



        passwordField = new JPasswordField();
        passwordField.setBounds(200,240,150,30);
        passwordField.setBorder(blackBorder);

        logButton = new JButton();
        logButton.setBounds(200,300,80,40);
        logButton.setText("LOG IN");
        logButton.setFocusable(false);
        logButton.setBackground(new Color(220, 7, 7));
        logButton.setForeground(Color.BLACK);
        logButton.setBorder(blackBorder);
        logButton.addActionListener(this);
        logButton.addMouseListener(this);


        hintButton = new JButton("REGISTRATION");
        hintButton.setBounds(200,350,150,30);
        hintButton.setLayout(null);
        hintButton.addActionListener(this);
        hintButton.addMouseListener(this);
        hintButton.setForeground(Color.black);
        hintButton.setFocusable(false);
        hintButton.setBackground(new Color(220, 7, 7));
        hintButton.setBorder(blackBorder);


        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0,0,550,450);
        mainPanel.add(userField);
        mainPanel.add(passwordField);
        mainPanel.add(logButton);
        mainPanel.add(logoLabel);
        mainPanel.add(hintButton);
        mainPanel.setBackground(new Color(245, 197, 197, 255));


        this.setTitle("Gmail - Login");
        this.setSize(550,450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(gmailIcon.getImage());
        this.add(mainPanel);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(userField.getText().equals(data.getUserName1()) && e.getSource()==logButton){

           this.dispose();
           new homePageFrame();

       } else if(userField.getText().equals(data.getUserName2()) && e.getSource()==logButton){

           this.dispose();
           new homePageFrame();

       } else if(userField.getText().equals(data.getUserName3()) && e.getSource()==logButton){

           this.dispose();
           new homePageFrame();

       } else if(userField.getText().equals(data.getUserName4()) && e.getSource()==logButton){

           this.dispose();
           new homePageFrame();

       } else if(userField.getText().equals(data.getUserName5()) && e.getSource()==logButton){

           this.dispose();
           new homePageFrame();

       } else if(e.getSource()==hintButton){
           this.dispose();
           new createAccountFrame();
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

    @Override
    public void mouseEntered(MouseEvent e) {
       if(e.getSource()==logButton){
           logButton.setBackground(new Color(255, 0, 0, 255));
           logButton.setForeground(new Color(7, 5, 5));
       } else if(e.getSource()==hintButton){
           hintButton.setBackground(new Color(255, 0, 0, 255));
           hintButton.setForeground(new Color(7, 5, 5));

       }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==logButton){
            logButton.setBackground(new Color(220, 7, 7));
        } else if(e.getSource()==hintButton){
            hintButton.setBackground(new Color(220, 7, 7));
        }

    }
}
