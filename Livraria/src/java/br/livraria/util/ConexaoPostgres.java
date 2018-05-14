package br.livraria.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Helio Kinoshita
 */
public class ConexaoPostgres {
    
     public static Connection getConexao() throws ClassNotFoundException, SQLException {
        // Define um driver de conexao com o banco.
        Class.forName("org.postgresql.Driver");
        // Abre uma conexao com o banco.
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/livraria", "#", "#");
    }
}
