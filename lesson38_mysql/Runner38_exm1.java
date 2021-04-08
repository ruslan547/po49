import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Runner38_exm1 {
    public static void main(String[] args) {
        final String DB_URL = "jdbc:mysql://localhost:3306/itclass_po49?serverTimezone=Europe/Minsk";
        final String DB_USER = "root";
        final String DB_PASSWORD = "";
        final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

        //Download class of Driver in application
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            //Connection wrights set of methods about connect to BD
            cn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            //Statement wrights set method for work with SQL
            st = cn.createStatement();
            //ResultSet discribs set of methods for work with result table
            rs = st.executeQuery("select * from cars");
            //цикл проходит по строкам тибл
            while (rs.next()) {
                //from string pull value for detormin column
                int id = rs.getInt("id");
                String model = rs.getString("model");
                String number = rs.getString("number");
                System.out.printf("id=%d, model=%s, number=%s\n", id, model, number);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (st != null) {
                try {
                    rs.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (cn != null) {
                try {
                    rs.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
