package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Employee;

public class ManagerDAO {

	private static void adicionaGerente(Connection conn, Integer cpf_empregado, String formacao) throws SQLException {
		try {
		String sql = "INSERT INTO gerente values(?, ?)";
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setLong(1, cpf_empregado);
		stmt.setString(2, formacao);
                stmt.execute();
                conn.commit();}
		
		catch (Exception e){
    		e.printStackTrace();
    		conn.rollback();
		}
	}
        
        public static List<Employee> ListarGerentes(Connection conn) throws SQLException {

        List<Employee> retorno = null;

        String[] returnValues = { "cpf", "rg", "nome", "sexo", "salario", "gerente_cpf"};

        String sql = "SELECT * FROM empregado e WHERE 1 = EXISTS (SELECT * FROM gerente g WHERE e.cpf = g.cpf);";

        PreparedStatement stmt = conn.prepareStatement(sql, returnValues);

        ResultSet result = stmt.executeQuery();

        retorno = new ArrayList<Employee>();

        while (result.next()) {
            Employee temp = new Employee();
            temp.setCPF(result.getString("cpf"));
            temp.setRG(result.getString("rg"));
            temp.setNome(result.getString("nome"));
            temp.setSexo(result.getString("sexo"));
            temp.setSalario(result.getInt("salario"));
            temp.setGerenteCpf(result.getString("gerente_cpf"));

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
