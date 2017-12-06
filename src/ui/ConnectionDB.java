package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	
	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@oracle11g.cin.ufpe.br:1521:Instance01";
	private static final String DB_USER = "u_aacgn";
	private static final String DB_PASSWORD = "vyvifzlx";
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER,
					DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;
	}
	
}
