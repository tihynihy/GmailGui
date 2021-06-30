package tihynihy;

import javax.swing.*;
import java.awt.*;

public class homePageFrame extends JFrame {
    JPanel redPanel;
    JPanel contetPanel;

    homePageFrame(){

        redPanel = new JPanel();
        redPanel.setBackground(new Color(220, 7, 7));
        redPanel.setBounds(0,0,150,450);

        contetPanel = new JPanel();
        contetPanel.setBackground(new Color(0,0,0));
        

        this.setTitle("Home Page");
        this.setSize(550,450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(redPanel);
        this.setVisible(true);
    }
}
