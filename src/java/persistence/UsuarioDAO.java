
package persistence;

// criação do DAO para a classe usuario

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Usuario;

public class UsuarioDAO {
    
    //criando um objeto chamado instance como static
    private static UsuarioDAO instance = new UsuarioDAO();
    
    private UsuarioDAO() {}
    
    // metodo que retorna a instancia statica / get de instnacia
    public static UsuarioDAO getInstance() {
        return instance;
    }
    
  // metodo que realiza a gravação na base  
  public void save(Usuario usuario) throws SQLException, ClassNotFoundException {
    Connection conn = null;
    Statement st  = null;

    try {
        // realiza a conexão com o banco de dados acessando o metodo getinstance 
            //e pegando uma instancia daquela classe
      conn = DataBaseLocator.getInstance().getConnection();
      st = conn.createStatement();
      st.execute("insert into usuario (nome, endereco, telefone, email)" +
        " values ('" + usuario.getNome() + "', '" + usuario.getEndereco() 
        + "', '" + usuario.getTelefone() + "', '" + usuario.getEmail() + "')");
      
    } catch(SQLException e) {
      throw e;
    } finally {
      closeResources(conn, st);
    }
  }
  
  // metodo que fecha a coneção do banco
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
