package jdbcwork04;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerHandler {
    private static final String DBDRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String DBURL = "jdbc:sqlserver://localhost:1433;DatabaseName=javatest";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123456";
    private Connection conn = null;

    public Connection buildConnection() {
        try {
            Class.forName(DBDRIVER);
            this.conn = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
        }catch(Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
