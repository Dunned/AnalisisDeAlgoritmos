package Informacion;

import alternativa.Usuario;
import java.awt.Image;
import java.io.Serializable;

public class TablaHashEncadenamiento implements Serializable {

    public Encadenador[] usuarios;
    private int TAM_TABLA = 98;

    public TablaHashEncadenamiento() {
        usuarios = new Encadenador[TAM_TABLA]; // 0-97 
        for (int i = 0; i < TAM_TABLA; i++) {
            Usuario usuario = new Usuario("", "", "", "", "", "");
            usuarios[i] = new Encadenador(usuario);
        }
    }

    //Funciones Hash
    public int hash(int dni) {
        return dni % 97;
    }

    //Insertar en tabla has por resolucion de colision mediante Encadenamiento
    public boolean insertarEncadenamiento(Usuario usuario) {
        int pos = hash(Integer.parseInt(usuario.getDni()));
        if (this.usuarios[pos].contenido.getDni().equals("")) { // Lugar libre
            this.usuarios[pos].contenido.setDni(usuario.getDni());
            this.usuarios[pos].contenido.setNumeroCelular(usuario.getNumeroCelular());
            this.usuarios[pos].contenido.setNombre(usuario.getNombre());
            this.usuarios[pos].contenido.setApellido(usuario.getApellido());
            this.usuarios[pos].contenido.setContraseña(usuario.getContraseña());
            this.usuarios[pos].contenido.setFoto(usuario.getFoto());
        } else {
            Encadenador puntero = this.usuarios[pos];
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            Encadenador nuevo = new Encadenador(new Usuario(usuario.getDni(), usuario.getNumeroCelular(),
                    usuario.getNombre(), usuario.getApellido(),
                    usuario.getContraseña(), usuario.getFoto()));
            puntero.siguiente = nuevo;
            puntero = null;
        }
        return true; // se Inserto correctamente
    }

    //Buscar en tabla has por resolucion de colision mediante Encadenamiento
    public Encadenador buscarEncadenamiento(String dni) {
        int pos = hash(Integer.parseInt(dni));
        if (this.usuarios[pos].contenido.getDni().equals(dni)) {
            return this.usuarios[pos];
        } else {
            Encadenador puntero = this.usuarios[pos];
            while (puntero.siguiente != null && (!puntero.contenido.getDni().equals(dni))) {
                puntero = puntero.siguiente;
                if (puntero.contenido.getDni().equals(dni)) {
                    return puntero;
                }
            }
            puntero = null;
            return puntero;
        }

    }
}
