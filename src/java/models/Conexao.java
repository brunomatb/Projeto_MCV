package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author batista
 */
public class Conexao {

    private final String classDriver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/projeto_mvc";
    private final String user = "root";
    private final String pass = "";

    public Connection conexao() {

        Connection con = null;

        try {
            // carregar o driver
            Class.forName(classDriver);

            // obter a ligação
            con = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());

        }
        return con;
    }

    public void desligarConexao(Connection con) {
        try {
          
                con.close();
                      
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
