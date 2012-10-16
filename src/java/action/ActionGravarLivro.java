
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Livro;
import persistence.LivroDAO;



//classe feita para executar o metodo de gravação de livro

public class ActionGravarLivro implements Action{

  @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {        
        
      //pega os parametros passados por requisição
        String titulo  = request.getParameter("txtTitulo");
        String autor   = request.getParameter("txtAutor");

        
        
        //valida se o nome está preenchido
        if(titulo.equals("") && autor.equals("")){
            response.sendRedirect("index.jsp");
        }
        
        else{
            //cria um objeto usuario com as informações do form
            Livro objLivro = new Livro();
            objLivro.setTitulo(titulo);
            objLivro.setAutor(autor);

            
            //chama o metodo de gravação
            try {                
                LivroDAO.getInstance().save(objLivro);
            } catch (SQLException ex) {
                response.sendError(500, "Erro no Banco de Dados");
                Logger.getLogger(ActionGravarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ActionGravarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   
}
