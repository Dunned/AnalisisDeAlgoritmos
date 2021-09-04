package dispersion;

import java.util.Scanner;

public class ReasignacionPorDobleDireccion {
    
    //Funciones Hash
    public static int hash(int clave){
        return clave%19;
    }
    
    //Funcion Has 2
    public static int hash2(int clave){
        return (clave+7)%19;
    }
    
    //Insertar en tabla has por resolucion de doble direccion
     public static boolean InsertarReasignacionDobleDireccion(Instituto instituto,int codigo, String nombre, float pension){
        int pos, pos_sigte;
        pos = hash (codigo);
        if (instituto.getCodigoDelAlumno(pos)==0){ //Si esa pos esta libre
            instituto.setCodigoDelAlumno(codigo, pos);
            instituto.setNombreDelAlumno(nombre, pos);
            instituto.setPensionDelAlumno(pension, pos);
            return true;
        }
        else { //
            pos_sigte = hash2(pos);
            while(pos_sigte < instituto.getNumeroDeAlumnos() &&
            instituto.getCodigoDelAlumno(pos_sigte) !=0/*/Estalleno*/ &&
            pos_sigte!=pos){
                pos_sigte=hash2(pos_sigte);   
            }
            if (instituto.getCodigoDelAlumno(pos_sigte)==0){
                instituto.setCodigoDelAlumno(codigo, pos_sigte);
                instituto.setNombreDelAlumno(nombre, pos_sigte);
                instituto.setPensionDelAlumno(pension, pos_sigte);
                return true;
            }
            else{
              
              return ReasignacionLineal.insertarReasignacionLineal(instituto, codigo, nombre, pension);  
            }
        }  
    }
    
     //Busqueda en tabla has por resolucion de doble direccion
    public static int BusquedaReasignacionDobleDireccion(Instituto instituto,int codigo){
            int pos, pos_sigte;
            pos = hash (codigo);
            if (instituto.getCodigoDelAlumno(pos)==codigo){ //Si esa pos esta libre
                return pos;
            }
            else { 
            System.out.println("valor de pos: "+pos);
            pos_sigte = hash2(pos);
            System.out.println("Primer valor de pos siguiente: "+pos_sigte);
            while(pos_sigte < instituto.getNumeroDeAlumnos() &&
            instituto.getCodigoDelAlumno(pos_sigte) !=0/*/Estalleno*/ &&
            pos_sigte!=pos && instituto.getCodigoDelAlumno(pos_sigte)!=codigo){
                System.out.println(pos_sigte);
                pos_sigte=hash2(pos_sigte);    
            }
            if (instituto.getCodigoDelAlumno(pos_sigte)==0 || instituto.getCodigoDelAlumno(pos_sigte)!=codigo){  
                System.out.println(pos_sigte);
                int aux=ReasignacionLineal.buscarReasignacionLineal(instituto, codigo);
                if (aux!=-1) {
                    return aux;
                }
                else{
                     return -1; //código no existe
                }              
            }
            else{
                return pos_sigte;
            }
        }  
    }
    
    //Borrar en tabla has por resolucion de doble direccion
    public static void borrarResignacionDobleDireccion(Instituto instituto,int codigo){
        int pos=ReasignacionPorDobleDireccion.BusquedaReasignacionDobleDireccion(instituto, codigo);
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
