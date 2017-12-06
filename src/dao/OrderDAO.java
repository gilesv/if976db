package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Order;

public class OrderDAO {
	
	public static List<Order> ListarPedidos(Connection conn) throws SQLException {
                
                List<Order> retorno = null;
            
                String[] returnValues = {"data", "cpf_garcom", "cpf_cliente", "numero_prato"};
                
		String sql = "SELECT * FROM pede";
		
                PreparedStatement stmt = conn.prepareStatement(sql, returnValues);

                ResultSet result = stmt.executeQuery();
            
                retorno = new ArrayList<Order>();
                
                while (result.next()) {
                    Order temp = new Order();
                    temp.setData(result.getTimestamp("data"));
                    temp.setCpfGarcom(result.getString("cpf_garcom"));
                    temp.setCpfCliente(result.getString("cpf_cliente"));
                    temp.setNumeroPrato(result.getInt("numero_prato"));
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
        
        
        public static void adicionaPedido(Connection conn, String cpf_garcom, String cpf_cliente, int numero_prato) {
            
                try {
                String sql = "INSERT INTO pede values (?, ?, ?, ?)";

                PreparedStatement stmt = conn.prepareStatement(sql);
                Date today = new Date();
                stmt.setTimestamp(1, new java.sql.Timestamp(today.getTime()));
                stmt.setString(2, cpf_garcom);
                stmt.setString(3, cpf_cliente);
                stmt.setLong(4, numero_prato);
                stmt.execute();
            }

            catch (Exception e){
                e.printStackTrace();
            }
        }

}
