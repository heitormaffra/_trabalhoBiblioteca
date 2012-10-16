
package State;

// classe de usuário utilizada para o padrão State (estado)

public class Usuario {

    // atributo da classe Usuario que se encontra no pacote modelo
    private model.Usuario Usuario;
    //atributo da classe UsuarioEstado
    private UsuarioEstado UsuarioEstado;

    //
    // porque o uso desse metodo ?
    //
    public Usuario() {
        this.UsuarioEstado = new UsuarioEstadoAtivo();
    }
    
    //
    //porque usar esse metodo ?
    //
    public boolean inativar(){
        return UsuarioEstado.mudarStatus();
    }  
    
    public model.Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(model.Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public State.UsuarioEstado getUsuarioEstado() {
        return UsuarioEstado;
    }

    public void setUsuarioEstado(State.UsuarioEstado UsuarioEstado) {
        this.UsuarioEstado = UsuarioEstado;
    }


    


    
}
