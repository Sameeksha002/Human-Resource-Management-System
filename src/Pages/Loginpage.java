
package Pages;

import DbHandler.Connectionmanage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Loginpage extends JFrame implements ActionListener{
    
     JTextField tfusername, tfpassword;
     
     Loginpage() {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 65, 100, 30);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(130, 65, 160, 30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 120, 100, 30);
        add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(130, 120, 160, 30);
        add(tfpassword);
        
        JButton login = new JButton("LOGIN");
        login.setBounds(150, 170, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/icon2.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 200, 200);
        add(image);
        
        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }
     
    public static void main(String[] args) {
        new Loginpage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       try{
            String username = tfusername.getText();
            String password = tfpassword.getText();
            String query = "select * from userinfo where username = '"+username+"' and password = '"+password+"'";
            
            Connectionmanage cnm = new Connectionmanage();
            ResultSet rs = cnm.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Homepage();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
       }catch(Exception ep){ ep.printStackTrace();}
    }
}
