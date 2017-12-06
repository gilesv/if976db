package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;

public class EmployeeDAO {

    public static void adicionaEmpregado(Connection conn, String cpf, String rg, String nome, String sexo, Integer salario, String cpf_gerente) throws SQLException {
        try {
                String sql = "INSERT INTO empregado values(?, ?, ?, ?, ?, ?)";

                PreparedStatement stmt = conn.prepareStatement(sql);

                stmt.setString(1, cpf);
                stmt.setString(2, rg);
                stmt.setString(3, nome);
                stmt.setString(4, sexo);
                stmt.setLong(5, salario);
                stmt.setString(6, cpf_gerente);
                stmt.execute();
        }

        catch (Exception e){
                e.printStackTrace();
                }

		
    }
	
    public static List<Employee> ListarTodosEmpregados(Connection conn) throws SQLException {

        List<Employee> retorno = null;
        

        String[] returnValues = { "cpf", "rg", "nome", "sexo", "salario", "gerente_cpf"};

        String sql = "SELECT * FROM empregado";

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
    
    public static void RemoverEmpregadoPorCpf(Connection conn, String cpf) throws SQLException {
        try {
            String sql = "DELETE FROM endereco WHERE cpf = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM telefone WHERE cpf = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM cozinha WHERE cpf_empregado = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM garcom WHERE cpf_empregado = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM cozinha WHERE cpf_empregado = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM gerente WHERE cpf_empregado = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM leva_para WHERE cpf_empregado = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM cozinheiro WHERE cpf_empregado = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM fornece WHERE cpf_gerente = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            sql = "DELETE FROM empregado WHERE cpf = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.execute();
            
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } 
        catch (Exception e){
                e.printStackTrace();
                }
    }
    
    public static Employee DetalhesEmpregado(Connection conn, String cpf) {
        
        Employee temp = new Employee();
        
        try {

            String[] returnValues = { "cpf", "rg", "nome", "sexo", "salario", "gerente_cpf"};

            String sql = "SELECT * FROM empregado WHERE cpf = ?";

            PreparedStatement stmt;
            
            stmt = conn.prepareStatement(sql, returnValues);
            
            stmt.setString(1, cpf);

            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                temp.setCPF(result.getString("cpf"));
                temp.setRG(result.getString("rg"));
                temp.setNome(result.getString("nome"));
                temp.setSexo(result.getString("sexo"));
                temp.setSalario(result.getInt("salario"));
                temp.setGerenteCpf(result.getString("gerente_cpf"));
            }

            if (stmt != null) {
                stmt.close();
            }

            if (conn != null) {
                conn.close();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       

        return temp;
    }
    
    public static void EditarEmpregadoPorCpf(Connection conn, String cpf, String rg, String nome, String sexo, Integer salario, String cpf_gerente) throws SQLException {
        try {
            String sql = "UPDATE empregado SET cpf = ?, rg = ?, nome = ?, sexo = ?, salario = ?, gerente_cpf = ? WHERE cpf = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            stmt.setString(2, rg);
            stmt.setString(3, nome);
            stmt.setString(4, sexo);
            stmt.setLong(5, salario);
            stmt.setString(6, cpf_gerente);
            stmt.setString(7, cpf);
            stmt.execute();
            
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } 
        catch (Exception e){
                e.printStackTrace();
                }
    }
    
        public static List<Employee> BuscarEmpregadoPorCpf(Connection conn, String cpf) {
        List<Employee> retorno = null;
        
        
        try {

            String[] returnValues = { "cpf", "rg", "nome", "sexo", "salario", "gerente_cpf"};

            String sql = "SELECT * FROM empregado WHERE cpf LIKE ?";

            PreparedStatement stmt;
            
            stmt = conn.prepareStatement(sql, returnValues);
            
            stmt.setString(1, cpf + "%");

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
            
            
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
       

        return retorno;
    }

}
