package bankmanagementsystem;
import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            //Step 1: Register the driver which is registered automatically
            //Class.forName(com.mysql.cj.jdbc.Driver);
            //Step 2: Create connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "root");
            s = c.createStatement();            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
