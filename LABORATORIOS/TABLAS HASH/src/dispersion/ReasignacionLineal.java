package dispersion;

import java.util.Scanner;

public class ReasignacionLineal {
    
        
    //Funciones Hash clave codigo Alumno
    public static int hash(int clave){
        return clave%19;
    }
    
    
    //Funcion Hash clave Nombre 
    public static int hash(String nombre){
        String cadena=nombre.replace(" ", ""); //Eliminamos espacios en blanco
        int hash=0;
        for (int i = 0; i < cadena.length(); i++) {
            int ascii=(int)(cadena.toCharArray()[i]);
            hash=hash+ascii;
        }
        return hash%19;
    }
    
    //Insertar un Alumno en tabla Hash con clave codigo
    public static boolean insertarReasignacionLineal(Instituto instituto,int codigo, String nombre, float pension){
        int pos, pos_sigte;
        pos = hash (codigo);
        if (instituto.getCodigoDelAlumno(pos)==0){ //Si esa pos esta libre
            instituto.setCodigoDelAlumno(codigo, pos);
            instituto.setNombreDelAlumno(nombre, pos);
            instituto.setPensionDelAlumno(pension, pos);
            return true;
        }
        else { //Se produce colisión: Solución por reasignación por prueba lineal
            pos_sigte = pos + 1;
            while(pos_sigte < instituto.getNumeroDeAlumnos() &&
            instituto.getCodigoDelAlumno(pos_sigte) !=0 &&
            pos_sigte!=pos){
                pos_sigte++;
                if ( pos_sigte == instituto.getNumeroDeAlumnos())
                    pos_sigte=0;
            }
            if (instituto.getCodigoDelAlumno(pos_sigte)==0){
                instituto.setCodigoDelAlumno(codigo, pos_sigte);
                instituto.setNombreDelAlumno(nombre, pos_sigte);
                instituto.setPensionDelAlumno(pension, pos_sigte);
                return true;
            }
            else{
              return false;  
            }
        }  
    }
    
    //Insertar un Alumno en tabla Hash con clave Nombre
    public static boolean insertarReasignacionLinealNombre(Instituto instituto,int codigo, String nombre, float pension){
        int pos, pos_sigte;
        pos = hash (nombre);
        if (instituto.getNombreDelAlumno(pos)==""){ //Si esa pos esta libre
            instituto.setCodigoDelAlumno(codigo, pos);
            instituto.setNombreDelAlumno(nombre, pos);
            instituto.setPensionDelAlumno(pension, pos);
            return true;
        }
        else { //Se produce colisión: Solución por reasignación por prueba lineal
            pos_sigte = pos + 1;
            while(pos_sigte < instituto.getNumeroDeAlumnos() &&
            instituto.getCodigoDelAlumno(pos_sigte) !=0 &&
            pos_sigte!=pos){
                pos_sigte++;
                if ( pos_sigte == instituto.getNumeroDeAlumnos())
                    pos_sigte=0;
            }
            if (instituto.getCodigoDelAlumno(pos_sigte)==0){
                instituto.setCodigoDelAlumno(codigo, pos_sigte);
                instituto.setNombreDelAlumno(nombre, pos_sigte);
                instituto.setPensionDelAlumno(pension, pos_sigte);
                return true;
            }
            else{
              return false;  
            }
        }  
    }
    
    //Buscar en tabla has con clave codigo
    public static int buscarReasignacionLineal(Instituto instituto,int codigo){
        int pos, pos_sigte;
        pos = hash (codigo);
        if (instituto.getNombreDelAlumno(pos).equals("")){
            return pos;
        }
        else{//Se produce colisión: Solución por reasignación por prueba lineal
            pos_sigte = pos + 1;
            while(pos_sigte < instituto.getNumeroDeAlumnos()&&
            pos_sigte!=pos &&
            instituto.getCodigoDelAlumno(pos_sigte)!=codigo){
                 pos_sigte++;
                if ( pos_sigte == instituto.getNumeroDeAlumnos()){
                    pos_sigte=0;
                }
            }
            
            if (instituto.getCodigoDelAlumno(pos_sigte)==codigo){
                System.out.println("funcion: "+pos_sigte);
                return pos_sigte; 
            }
            else{
                return -1;
            }
        }
    }
    
    
    //Buscar en tabla has con clave Nombre
    public static int buscarReasignacionLinealNombre(Instituto instituto,String nombre){
        int pos, pos_sigte;
        pos=hash(nombre);

        if (instituto.getNombreDelAlumno(pos).equals(nombre)){
            return pos;
        }
        else{//Se produce colisión: Solución por reasignación por prueba lineal
            
            pos_sigte = pos + 1;
            while(pos_sigte < instituto.getNumeroDeAlumnos()
            && pos_sigte!=pos &&
            !instituto.getNombreDelAlumno(pos_sigte).equals(nombre)){
                System.out.println(instituto.getNombreDelAlumno(pos_sigte));
                pos_sigte++;
                if ( pos_sigte == instituto.getNumeroDeAlumnos()){
                    pos_sigte=0;
                }
            }
            if (instituto.getNombreDelAlumno(pos_sigte).equals(nombre)){
                System.out.println("funcion: "+pos_sigte);
                return pos_sigte; 
            }
            else{
                return -1;
            }
        }
    }
     
    
    //Elimar en tabla has con clave codigo
    public static void eliminarReasignacionLineal(Instituto instituto,int codigo){
        int pos=buscarReasignacionLineal(instituto,codigo);
        if (pos!=-1) {
            instituto.setCodigoDelAlumno(0,pos);
            instituto.setNombreDelAlumno("", pos);
            instituto.setPensionDelAlumno(0, pos); 
            System.out.println("Eliminado con Exito");
        }
        else{
            System.out.println("No se encontro");
        }
    }
    
    //Elimar en tabla has con clave Nombre
     public static void eliminarReasignacionLinealNombre(Instituto instituto,String nombre){
        int pos=buscarReasignacionLinealNombre(instituto,nombre);
        if (pos!=-1) {
            instituto.setCodigoDelAlumno(0,pos);
            instituto.setNombreDelAlumno("", pos);
            instituto.setPensionDelAlumno(0, pos); 
            System.out.println("Eliminado con Exito");
        }
        else{
            System.out.println("No se encontro");
        }
    }
     
     
}
