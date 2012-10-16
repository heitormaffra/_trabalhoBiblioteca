
package State;


public class UsuarioEstadoInativo implements UsuarioEstado{
    
    @Override
    public String getEstado(){
        return "Usuário Inativo";
    };
    
    @Override
    public  boolean mudarStatus(){
        return false;
    };
    
}
