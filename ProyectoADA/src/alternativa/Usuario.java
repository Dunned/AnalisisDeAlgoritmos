package alternativa;

import java.io.File;



public class Usuario {
    private int dni;
    private int numeroCelular;
    private String nombre;
    private String apellido;
    private String contraseña;
    private File foto;

    public Usuario(int dni, int numeroCelular, String nombre, String apellido, String contraseña, File foto) {
        this.dni = dni;
        this.numeroCelular = numeroCelular;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contraseña = contraseña;
        this.foto = foto;
    }

    public int getDni() {
        return dni;
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public File getFoto() {
        return foto;
    }
    
    
    
    
    
    
    

    
    
}
