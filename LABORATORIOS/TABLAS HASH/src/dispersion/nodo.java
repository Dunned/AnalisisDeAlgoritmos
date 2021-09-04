
package dispersion;

public class nodo {
    public nodo siguiente=null;
    public Alumno contenido;

    public nodo(Alumno contenido) {
        this.siguiente = null;
        this.contenido = contenido;
    }
    
    public void insertarAlumno(Alumno alumno){
        contenido.setCodigoDelAlumno(alumno.getCodigoDelAlumno());
        contenido.setNombreDelAlumno(alumno.getNombreDelAlumno());
        contenido.setPensionDelAlumno(alumno.getPensionDelAlumno());
    }
    
    public Alumno retornarAlumno() {
        return this.contenido;
    }
}
