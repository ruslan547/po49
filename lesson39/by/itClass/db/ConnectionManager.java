package by.itClass.db;

import java.sql.*;
import java.util.Objects;
import java.util.Properties;

import static by.itClass.constants.Constants.*;
import by.itClass.db.PropertiesManager;

public class ConnectionManager {
    private static Connection cn;
    private static Properties properties;

    static {
        properties = PropertiesManager.newInstance(DB_PROPERTIES_FILE);
        try {
            Class.forName(properties.getProperty(DB_DRIVER));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        if (Objects.isNull(cn) || cn.isClosed()) {
            return DriverManager
                    .getConnection(properties.getProperty(DB_URL),
                                    properties.getProperty(DB_USER),
                                   properties.getProperty(DB_PASSWORD));
        } else {
            return cn;
        }
    }

    public static void closeConnection() {
        if (Objects.nonNull(cn)) {
            try {
                cn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeStatement(Statement st) {
        if (Objects.nonNull(st)) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (Objects.nonNull(rs)) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
