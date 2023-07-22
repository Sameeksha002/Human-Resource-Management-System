package DbHandler;

import java.sql.*;

public class Connectionmanage {
    
    Connection c;
    public Statement s;

    public Connectionmanage() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/HRMS", "root", "sampom#12");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
    

