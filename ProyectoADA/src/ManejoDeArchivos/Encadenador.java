package ManejoDeArchivos;

import Codigo.Usuario;
import java.io.Serializable;

public class Encadenador implements Serializable {

    public Encadenador siguiente = null;
    public Usuario contenido;

    public Encadenador(Usuario contenido) {
        this.siguiente = null;
        this.contenido = contenido;
    }

    public void insertarUsuario(Usuario usuario) {
        contenido.setDni(usuario.getDni());
        contenido.setNumeroCelular(usuario.getNumeroCelular());
        contenido.setNombre(usuario.getNombre());
        contenido.setApellido(usuario.getApellido());
        contenido.setContraseña(usuario.getContraseña());
        contenido.setFoto(usuario.getFoto());
    }

    public Usuario retornarUsuario() {
        return this.contenido;
    }

}
