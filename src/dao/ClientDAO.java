package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Client;
import model.Employee;

public class ClientDAO {

    public static void adicionaCliente(Connection conn, String cpf, String rg, String nome) throws SQLException {
        try {
            String sql = "INSERT INTO cliente values(?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, cpf);
            stmt.setString(2, rg);
            stmt.setString(3, nome);
            stmt.execute();
        }

        catch (Exception e){
            e.printStackTrace();
        }
		
    }
	
    public static List<Client> ListarTodosClientes(Connection conn) throws SQLException {

        List<Client> retorno = null;

        String[] returnValues = { "cpf", "rg", "nome"};

        String sql = "SELECT * FROM cliente";

        PreparedStatement stmt = conn.prepareStatement(sql, returnValues);

        ResultSet result = stmt.executeQuery();

        retorno = new ArrayList<Client>();

        while (result.next()) {
            Client temp = new Client();
            temp.setCPF(result.getString("cpf"));
            temp.setRG(result.getString("rg"));
            temp.setNome(result.getString("nome"));

            retorno.add(temp);

        }

        if (stmt != null) {
            stmt.close();
        }

        if (conn != null) {
            conn.close();
        }

        return retorno;

    }

}
