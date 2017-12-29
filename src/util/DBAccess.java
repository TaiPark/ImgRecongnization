package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBAccess {
	/**
	 * 用于加载数据库驱动，获取数据库连接
	 *
	 */

		private static final String URL = "jdbc:mysql://localhost:3306/Recognition?useUnicode=true&characterEncoding=UTF-8";
		private static final String USERNAME = "root";
		private static final String PASSWORD = "root";
		private Connection conn;

		public DBAccess() {
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		}

		public Connection getConnection() {
			try 
			{
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			return conn;
		}
		

}