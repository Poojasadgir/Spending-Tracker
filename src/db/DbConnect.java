package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{//class execute hote hi load hota hai
        try{
            c=DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false",
                 "root", "Pooja@2706");
            st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
