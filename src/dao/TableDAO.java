package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TableDAO {

	private static void adicionaMesa(Connection conn, Integer numero, Integer capacidade) throws SQLException {
		try {
		String sql = "INSERT INTO mesa values(?, ?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setLong(1, numero);
        stmt.setLong(2, capacidade);
        stmt.execute();
        conn.commit();}
		
		catch (Exception e){
    		e.printStackTrace();
    		conn.rollback();
		}
	}

	
	private static ResultSet ListarMesas(Connection conn) throws SQLException {
		String sql = "SELECT * FROM mesa";
		
		Statement stmt = conn.createStatement();
		
		stmt.execute(sql);
		
		ResultSet resultSet = stmt.getResultSet();
		return resultSet;
	}

}
