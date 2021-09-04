package codigo;

public class Empleado {
     //Atributos
    private int codigoDelEmpleado;
    private String nombreDelEmpleado;
    private float sueldoDelEmpleado;
    
    //Metodo contrusctor
    public Empleado(int codigo, String nombre, float sueldo) {
    codigoDelEmpleado = codigo;
    nombreDelEmpleado = nombre;
    sueldoDelEmpleado = sueldo;
    }
    
    //Metodos De Acceso
    public void setCodigoDelEmpleado(int codigo)
    {
    codigoDelEmpleado = codigo;
    }
    public int getCodigoDelEmpleado()
    {
    return codigoDelEmpleado;
    }
    public void setNombreDelEmpleado(String nombre)
    {
    nombreDelEmpleado = nombre;
    }
    public String getNombreDelEmpleado()
    {

    return nombreDelEmpleado;
    }
    public void setSueldoDelEmpleado(float sueldo)
    {
    sueldoDelEmpleado = sueldo;
    }
    public float getSueldoDelEmpleado()
    {
    return sueldoDelEmpleado;
    }
}
