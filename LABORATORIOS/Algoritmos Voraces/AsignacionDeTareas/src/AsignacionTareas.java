
import com.sun.org.apache.bcel.internal.generic.IUSHR;
import java.util.Arrays;

public class AsignacionTareas {

    public int voraz(Trabajador[] candidatos, String[] solucion) {
        int tiempoTotal=0;
        Trabajador x = ordenar(candidatos, 0)[0];
        insertar(x, solucion, 0);
        tiempoTotal=tiempoTotal+x.tiempoTareas[0]; // para el tiempo total
        int tarea = 1;
        int candidato = 0;
        while (!Solucion(solucion)) { //Mientras no asignemos todas las tareas
            x = ordenar(candidatos, tarea)[candidato];
            if (factible(x)) {
                insertar(x, solucion, tarea);
                tiempoTotal=tiempoTotal+x.tiempoTareas[tarea]; // para el tiempo total
                tarea++;
                candidato=0;
            } else {
                candidato++; //Si esta ocupado buscamos en el segundo menor tiempo para esa tarea
            }
        }
        return tiempoTotal;
    }

    
    //Metodo que ordena ascendentemente a trabajadores de menor tiempo en una tarea especifica
    public Trabajador[] ordenar(Trabajador[] trabajadores, int tarea) {
        int[] arregloTemp = {0, 0, 0, 0};
        Trabajador temp = new Trabajador(0, arregloTemp);
        for (int i = 1; i < trabajadores.length; i++) {
            for (int j = trabajadores.length - 1; j >= i; j--) {
                if (trabajadores[j - 1].tiempoTareas[tarea] > trabajadores[j].tiempoTareas[tarea]) {
                    temp.id = trabajadores[j - 1].id;
                    trabajadores[j - 1].id = trabajadores[j].id;
                    trabajadores[j].id = temp.id;
                    temp.tiempoTareas = trabajadores[j - 1].tiempoTareas.clone();
                    trabajadores[j - 1].tiempoTareas = trabajadores[j].tiempoTareas.clone();
                    trabajadores[j].tiempoTareas = temp.tiempoTareas;
                    temp.asignado = trabajadores[j - 1].asignado;
                    trabajadores[j - 1].asignado = trabajadores[j].asignado;
                    trabajadores[j].asignado = temp.asignado;
                }
            }
        }
        return trabajadores;
    }

    //Comprobamos si se asigno todas las tareas
    public boolean Solucion(String[] solucion) {
        int contador = 0;
        for (int i = 0; i < solucion.length; i++) {
            if (!solucion[i].equals("")) {
                contador++;
            }
        }
        if (contador==4) {
            return true;
        } else {
            return false;
        }
    }

    //Asignamos tarea a un trabajador
    public void insertar(Trabajador x, String[] solucion, int tarea) {
        String contenido="TRABAJADOR " + x.id + "----> #HORAS: " + x.tiempoTareas[tarea];
        solucion[tarea] = contenido;
        x.asignado = true;
    }

    //Comprobamos si esa tarea ya fue ocupada
    public boolean factible(Trabajador x) {
        if (x.asignado == true) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tiempoTrabajador1 = {14, 5, 8, 7};
        Trabajador trabajador1 = new Trabajador(1, tiempoTrabajador1);
        int[] tiempoTrabajador2 = {2, 12, 6, 5};
        Trabajador trabajador2 = new Trabajador(2, tiempoTrabajador2);
        int[] tiempoTrabajador3 = {7, 8, 3, 9};
        Trabajador trabajador3 = new Trabajador(3, tiempoTrabajador3);
        int[] tiempoTrabajador4 = {2, 4, 6, 10};
        Trabajador trabajador4 = new Trabajador(4, tiempoTrabajador4);
        Trabajador[] trabajadores = {trabajador1, trabajador2, trabajador3, trabajador4};
        String[] solucion = new String[4];
        for (int i = 0; i < solucion.length; i++) {
            solucion[i]="";
        }
        AsignacionTareas asignacionTareas = new AsignacionTareas();
        asignacionTareas.voraz(trabajadores, solucion);
        
        
        /*asignacionTareas.ordenar(trabajadores, 0);
        System.out.println("TAREA 1");
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i].id);
        }
        asignacionTareas.ordenar(trabajadores, 1);
        System.out.println("TAREA 2");
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i].id);
        }
        asignacionTareas.ordenar(trabajadores, 2);
        System.out.println("TAREA 3");
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i].id);
        }
        asignacionTareas.ordenar(trabajadores, 3);
        System.out.println("TAREA 4");
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i].id);
        }*/

    }
}
