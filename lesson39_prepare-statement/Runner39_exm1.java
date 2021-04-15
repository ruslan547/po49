import by.itClass.db.ConnectionManager;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

public class Runner39_exm1 {
    public static void main(String[] args) {
        List<String> titles = Arrays.asList("Java", "C++", "JavaScript");

        Connection cn = null;
        Statement st = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            cn = ConnectionManager.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery("select * from mytable");
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                System.out.printf("id=%d, title=%s\n", id, title);
            }

            //work with parametred request
            pst = cn.prepareStatement("insert into mytable(title) value (?)");
            for (String item : titles) {
                System.out.println(pst);
                pst.setString(1, item);
                System.out.println(pst);
                pst.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.closeResultSet(rs);
            ConnectionManager.closeStatement(st);
            ConnectionManager.closeConnection();
        }
    }
}
