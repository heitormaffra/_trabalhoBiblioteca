
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;
import persistence.UsuarioDAO;


//classe feita para executar o metodo de gravação de usuário

public class ActionGravarUsuario implements Action{

  @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {        
        
      //pega os parametros passados por requisição
        String nome_usuario  = request.getParameter("txtNome");
        String end_usuario   = request.getParameter("txtEndereco");
        String tel_usuario   = request.getParameter("txtTelefone");
        String email_usuario = request.getParameter("txtEmail");
        
        
        //valida se o nome está preenchido
        if(nome_usuario.equals("")){
            response.sendRedirect("index.jsp");
        }
        
        else{
            //cria um objeto usuario com as informações do form
            Usuario usuario = new Usuario();
            usuario.setNome(nome_usuario);
            usuario.setEndereco(end_usuario);
            usuario.setTelefone(tel_usuario);
            usuario.setEmail(email_usuario);
            
            //chama o metodo de gravação
            try {                
                UsuarioDAO.getInstance().save(usuario);
            } catch (SQLException ex) {
                response.sendError(500, "Erro no Banco de Dados");
                Logger.getLogger(ActionGravarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ActionGravarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
}
