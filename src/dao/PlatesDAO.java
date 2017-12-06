package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Plate;

public class PlatesDAO {

	public static List<Plate> ListarPratos(Connection conn) throws SQLException {
            
            List<Plate> retorno = null;
            
            String[] returnValues = { "numero", "preco", "nome"};
            
            String sql = "SELECT * FROM prato";
            
            PreparedStatement stmt = conn.prepareStatement(sql, returnValues);

            ResultSet result = stmt.executeQuery();
            
            retorno = new ArrayList<Plate>();

            while (result.next()) {
                Plate temp = new Plate();
                temp.setNumero(result.getInt("numero"));
                temp.setPreco(result.getInt("preco"));
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
