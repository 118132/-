package jdbcwork05;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlDAO {
	public static Connection getConnection()  throws Exception{
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=javatest";
		String userName = "sa";
		String password = "123456";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url, userName, password);
		return con;
	}
}
