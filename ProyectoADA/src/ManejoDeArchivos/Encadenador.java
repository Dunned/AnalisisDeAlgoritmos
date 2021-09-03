package ManejoDeArchivos;

import Codigo.Usuario;
import java.io.Serializable;

public class Encadenador implements Serializable {

    public Encadenador siguiente = null;
    public Usuario contenido;

    /**
     * DESCRIPCION: CONSTRUCTOR DEL ENCADENADOR O TAMBIEN LLAMADO NODO
     *
     * @param contenido : USUARIO A GUARDAR DENTRO DE ESTE OBJETO ENCADENADOR
     */
    public Encadenador(Usuario contenido) {
        this.siguiente = null;
        this.contenido = contenido;
    }

    /**
     * DESCRIPCION: METODO PARA INSERTAR UN USUARIO EN UN OBJETO ENCADENADOR O
     * NODO
     *
     * @param usuario: USUARIO A INSERTAR
     */
    public void insertarUsuario(Usuario usuario) {
        contenido.setDni(usuario.getDni());
        contenido.setNumeroCelular(usuario.getNumeroCelular());
        contenido.setNombre(usuario.getNombre());
        contenido.setApellido(usuario.getApellido());
        contenido.setContraseña(usuario.getContraseña());
        contenido.setFoto(usuario.getFoto());
    }

    /**
     * DESCRIPCION: METODO PARA RETORNAR EL USUARIO DE UN OBJETO NODO O
     * ENCADENADOR
     *
     * @return USUARIO DEL NODO O ENCADENADOR
     */
    public Usuario retornarUsuario() {
        return this.contenido;
    }

}
