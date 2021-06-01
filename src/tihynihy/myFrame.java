package tihynihy;

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
    JButton logButton;
    Border blackBorder;
    ImageIcon gmailIcon = new ImageIcon("gmailLogo.png");
    JLabel logoLabel;
    JLabel hintLabel;

    myFrame(){


        hintLabel = new JLabel();
        hintLabel.setBounds(200,320,100,100);
        hintLabel.setText("Not signed in?");
        hintLabel.setLayout(null);



        blackBorder = BorderFactory.createLineBorder(Color.BLACK,2);
        logoLabel = new JLabel();
        logoLabel.setLayout(null);
        logoLabel.setBounds(175,0,200,200);
        logoLabel.setIcon(gmailIcon);


        logButton = new JButton();
        logButton.setBounds(200,300,80,40);
        logButton.setText("LOG IN");
        logButton.setFocusable(false);
        logButton.setBackground(new Color(220, 7, 7));
        logButton.setForeground(Color.WHITE);
        logButton.setBorder(blackBorder);
        logButton.addActionListener(this);
        logButton.addMouseListener(this);


        userField = new JTextField();
        userField.setBounds(200,200,150,20);
        userField.setText("Email");
        userField.setBorder(blackBorder);



        passwordField = new JPasswordField();
        passwordField.setBounds(200,240,150,20);
        passwordField.setText("Password");
        passwordField.setBorder(blackBorder);



        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0,0,550,450);
        mainPanel.add(userField);
        mainPanel.add(passwordField);
        mainPanel.add(logButton);
        mainPanel.add(logoLabel);
        mainPanel.add(hintLabel);




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
        logButton.setBackground(new Color(255, 126, 126, 174));
        logButton.setForeground(new Color(7, 5, 5));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        logButton.setBackground(new Color(220, 7, 7));
    }
}
