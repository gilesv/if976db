package ui;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection conn = new ConnectionDB().getConnection();
		System.out.println("[+]Conexao estabelecida com sucesso");
		((Connection) conn).close();
	}
	
}