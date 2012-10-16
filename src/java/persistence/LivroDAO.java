
package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Livro;


// classe de DAO da classe Livro

public class LivroDAO {
    private static LivroDAO instance= new LivroDAO();
    
    private LivroDAO() {}
    
    //metodo que retorna a instancia criada da classe LivroDAO
    public static LivroDAO getInstance() {
    return instance;
    }
    
     public void save(Livro livro) throws SQLException, ClassNotFoundException {
    Connection conn = null;
    Statement st  = null;

    try {
        //pega a instancia e abre conexão como banco de dados 
      conn = DataBaseLocator.getInstance().getConnection();
      st = conn.createStatement();
      st.execute("insert into livro (titulo, autor)" +
        " values ('" + livro.getTitulo() + "', '" + livro.getAutor()+ "')");
      
    } catch(SQLException e) {
      throw e;
    } finally {
      closeResources(conn, st);
    }
  }
  public void closeResources(Connection conn, Statement st) throws SQLException {
    try {
      if(st!=null) {
            st.close();
        }
      if(conn!=null) {
            conn.close();
        }
      
    } catch(SQLException e) {
        throw e;
    }
  }
}
