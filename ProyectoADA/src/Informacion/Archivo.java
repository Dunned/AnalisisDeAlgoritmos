package Informacion;

import alternativa.Usuario;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

public class Archivo {

    File archivo;
    String archivoUsuarios = "Usuarios.bin";
    TablaHashEncadenamiento tablaHash;

    public boolean existeUsuario(Usuario usuario) {
        recuperarTabla();
        Encadenador encadenador = tablaHash.buscarEncadenamiento(usuario.getDni());
        if (encadenador == null) {
            return false;
        }
        return true;
    }

  
    public int crearUsuario(Usuario usuario) {
        int op = 0;
        archivo = new File(archivoUsuarios);
        if (archivo.exists()) {
            if (existeUsuario(usuario) == false) {
                try {
                    op = 1;
                    recuperarTabla();
                    FileOutputStream archivo1 = new FileOutputStream(archivo);
                    ObjectOutputStream escritura = new ObjectOutputStream(archivo1);
                    if (tablaHash.insertarEncadenamiento(usuario)) { //Si se pudo insertar
                        escritura.writeObject(tablaHash);
                        escritura.close();
                        op=1;
                    } else {
                        System.out.println("no se pudo insertar");
                    }
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "EXISTE UN USUARIO CON ESTE DNI");
            }
        } else {
            try {
                FileOutputStream archivo = new FileOutputStream(archivoUsuarios);
                ObjectOutputStream escritura = new ObjectOutputStream(archivo);
                tablaHash = new TablaHashEncadenamiento();
                tablaHash.insertarEncadenamiento(usuario);
                escritura.writeObject(tablaHash);
                escritura.close();
                op=1;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return op;
    }

    public void recuperarTabla() {
        try {
            FileInputStream archivo = new FileInputStream(archivoUsuarios);
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            while (true) {
                tablaHash = (TablaHashEncadenamiento) entrada.readObject();
            }
        } catch (EOFException ex) {
            return;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
   /* public static void main(String[] args) {
        Archivo archivo = new Archivo(); //73954094 / 73954095/73954080
        Usuario usuario = new Usuario("73954080", "123456789", "Gerardo", "Manuel", "231", null);
        archivo.recuperarTabla();
        TablaHashEncadenamiento tablaHashEncadenamiento=archivo.tablaHash;
        Encadenador encadenado=tablaHashEncadenamiento.buscarEncadenamiento("73954040");
        System.out.println(encadenado.contenido.getApellido());
        //archivo.eliminar();
        //System.out.println(archivo.existeUsuario(usuario));
        //recuperarTabla();
        //TablaHashEncadenamiento tablaHashEncadenamiento=Archivo.tablaHash;
        //System.out.println(tablaHashEncadenamiento.buscarEncadenamiento("73954090"));
    }*/

    public TablaHashEncadenamiento getTablaHash() {
        return tablaHash;
    }
}
