
package State;


public class UsuarioEstadoAtivo implements UsuarioEstado{
    
    @Override
    public String getEstado(){
        return "Usuário Ativo";
    };
    
    @Override
    public boolean mudarStatus(){
        return true;
    };
    
}
 
