public class Trabajador {
    int id;
    int[] tiempoTareas;
    boolean asignado;

    public Trabajador(int id, int[] tiempoTreas) {
        this.id = id;
        this.tiempoTareas = tiempoTreas;
        asignado=false;
    }  
}
