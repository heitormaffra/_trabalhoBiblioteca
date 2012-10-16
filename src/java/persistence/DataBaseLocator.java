
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


//classe feita para criar a conexão com o banco de dados

public class DataBaseLocator {
    
    private static DataBaseLocator instance = new DataBaseLocator();
    
    public static DataBaseLocator getInstance() {
        return instance;
    }
    
    /** Creates a new instance of DatabaseLocator */
    public Connection getConnection() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/trabalhobiblioteca", "fabio", "fabio");
        return conn;
    }
}
