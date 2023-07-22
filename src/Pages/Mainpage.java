package Pages;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class Mainpage extends JFrame implements ActionListener{

    Mainpage() {
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1400, 105);
        panel.setBackground(Color.cyan);
        add(panel);
        
        JLabel heading = new JLabel("Human Resource Management System");
        heading.setBounds(210, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.darkGray);
        panel.add(heading);
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 100, 1400, 650);
        panel1.setBackground(Color.darkGray);
        add(panel1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 140,1300, 700);
        panel1.add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(100, 400, 300, 70);
        clickhere.setFont(new Font("serif", Font.PLAIN, 20));
        clickhere.setBorder(new LineBorder(Color.black));
        clickhere.setForeground(Color.darkGray);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        setSize(1400, 780);
        setLocation(40, 30);
        setVisible(true);
        
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(600);
            } catch (Exception e){}
            
            heading.setVisible(true);
            try {
                Thread.sleep(1000);
            } catch (Exception e){}
        }    
               
    }

      @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Loginpage();
    } 
    
    public static void main(String[] args) {
        new Mainpage();
    }
    
}
