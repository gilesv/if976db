package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InvoiceDAO {
	
	private static void gerarConta(Connection conn, Integer numero_mesa, Integer total, Integer cpf_cliente) throws SQLException {
		try {
		String sql = "INSERT INTO gerente values(?, ?, ?, ?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		
		stmt.setLong(1, numero_mesa);
		stmt.setLong(2, total);
		stmt.setLong(3, cpf_cliente);
		stmt.setDate(4, (java.sql.Date) date);
        stmt.execute();
        conn.commit();}
		
		catch (Exception e){
    		e.printStackTrace();
    		conn.rollback();
		}
	}

	private static ResultSet ListarTodasContas(Connection conn) throws SQLException {
		String sql = "SELECT * FROM conta";
		
		Statement stmt = conn.createStatement();
		
		stmt.execute(sql);
		
		ResultSet resultSet = stmt.getResultSet();
		
		return resultSet;
	}
	
	private static ResultSet ListarContaDoCliente(Connection conn, Integer cpf_cliente) throws SQLException {
		String sql = "SELECT * FROM conta WHERE cpf_cliente = ?";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setLong(1, cpf_cliente);
		
		stmt.execute();
		
		ResultSet resultSet = stmt.getResultSet();
		return resultSet;
	}

}
