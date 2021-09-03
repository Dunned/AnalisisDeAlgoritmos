package ManejoDeArchivos;

import Codigo.Usuario;
import java.io.Serializable;

public class TablaHashEncadenamiento implements Serializable {

    public Encadenador[] usuarios;
    private int TAM_TABLA = 98;

    /**
     * DESCRIPCION: METODO CONSTRUCTOR DE UNA TABLA HASH , INICIALIZA COMO NULOS TODA LAS CELDAS DEL ARRAY DE LISTAS ENLAZADAS
     */
    public TablaHashEncadenamiento() {
        usuarios = new Encadenador[TAM_TABLA]; // 0-97 
        for (int i = 0; i < TAM_TABLA; i++) {
            Usuario usuario = new Usuario("", "", "", "", "", "", null);
            usuarios[i] = new Encadenador(usuario);
        }
    }

    /**
     * DESCRIPCION: FUNCION HASH PARA OBTENER LA POS EN DONDE SE GUARDARA UN USUARIO MEDIANTE SU DNI
     * @param dni: DNI DEL USUARIO
     * @return : CLAVE PARA EL USUARIO CON EL DNI
     */
    //Funciones Hash
    public int hash(int dni) {
        return dni % 97;
    }

    /**
     * DESCRIPCION: METODO QUE PERMITE INSERTAR UN USUARIO EN UNA POS DE LA TABLA HASH
     * @param usuario: USUARIO A INSERTAR
     * @return VALOR DE VERDAD O FALSO, SI SE HA PODIDO REALIZAR CORRECTAMENTE LA INSERSION
     */
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
            this.usuarios[pos].contenido.setPlantasFavoritas(usuario.getPlantasFavoritas());
        } else {
            Encadenador puntero = this.usuarios[pos];
            while (puntero.siguiente != null) {
                puntero = puntero.siguiente;
            }
            Encadenador nuevo = new Encadenador(new Usuario(usuario.getDni(), usuario.getNumeroCelular(),
                    usuario.getNombre(), usuario.getApellido(),
                    usuario.getContraseña(), usuario.getFoto(), usuario.getPlantasFavoritas()));
            puntero.siguiente = nuevo;
            puntero = null;
        }
        return true; // se Inserto correctamente
    }

    /**
     * DESCRIPCION: METODO QUE PERMITE BUSCAR UN USUARIO MEDIANTE SU DNI EN LA TABLA HASH
     * @param dni: USUARIO DEL DNI A BUSCAR
     * @return : EL NODO DONDE ESTA EL USUARIO , RETORNA NULO SI NO EXISTE
     */
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
