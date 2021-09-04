package dispersion;

import java.util.Scanner;


public class ReasignacionPorEncadenamiento {
    
    //Funciones Hash
    public static int hash(int clave){
        return clave%19;
    }
    
     //Insertar en tabla has por resolucion de colision mediante Encadenamiento
     public static boolean insertarEncadenamiento(Instituto instituto,int codigo, String nombre, float pension){
        int pos=hash(codigo);
        if (instituto.alumnos3[pos].contenido.getCodigoDelAlumno()==0){ 
            instituto.alumnos3[pos].contenido.setCodigoDelAlumno(codigo);
            instituto.alumnos3[pos].contenido.setNombreDelAlumno(nombre);
            instituto.alumnos3[pos].contenido.setPensionDelAlumno(pension);
        }  
        else { 
            nodo puntero=instituto.alumnos3[pos];
            while(puntero.siguiente!=null){
                puntero=puntero.siguiente;   
            }
            nodo nuevo=new nodo(new Alumno(codigo,nombre,pension));
            puntero.siguiente=nuevo;
            puntero=null;
        }   
        return true;
    }
    
     //Buscar en tabla has por resolucion de colision mediante Encadenamiento
    public static nodo buscarEncadenamiento(Instituto instituto,int codigo){
        int pos=hash(codigo);
        if (instituto.getCodigoDelAlumno3(pos)==codigo){ 
            return instituto.alumnos3[pos];
        }
        else { 
            nodo puntero=instituto.alumnos3[pos];
            while(puntero.siguiente!=null && puntero.contenido.getCodigoDelAlumno()!=codigo){
                puntero=puntero.siguiente;
                if (puntero.contenido.getCodigoDelAlumno()==codigo) {
                    return puntero;
                }
            }
            puntero=null;
            return puntero;
        }        
    }
    
    //Borrar en tabla has por resolucion de colision mediante Encadenamiento
    public static void borrar(Instituto instituto,int codigo){
        int hash=ReasignacionPorEncadenamiento.hash(codigo);
        nodo puntero=instituto.getAlumno(hash);
        if (puntero.contenido.getCodigoDelAlumno()==codigo) {
            if (puntero.siguiente==null) {
                instituto.setAlumno(hash, null);
                puntero=null;
            }
            else{
                instituto.setAlumno(hash, puntero.siguiente);
                puntero=null;
            }
          
        }
        else{
            boolean cambio=false;
            while(puntero!=null){
                if (puntero.siguiente!=null) {
                    if (puntero.siguiente.contenido.getCodigoDelAlumno()==codigo){
                        puntero.siguiente=puntero.siguiente.siguiente;   
                    }
                }
                puntero=puntero.siguiente;
            }
        }
    }
}
