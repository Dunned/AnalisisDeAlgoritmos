package dispersion;

import java.util.Scanner;


public class ReasignacionPorArregloAnidado {
     //Funciones Hash
    public static int hash(int clave){
        return clave%19;
    }
    
    //Insertar en tabla hash por resolucion de colisionArregloAnidado
     public static boolean InsertarArregloAnidado(Instituto instituto,int codigo, String nombre, float pension){
        int pos[]=new int[2];
        int pos_sigte;
        pos[0] = hash (codigo);
        pos[1]=0;
        if (instituto.getCodigoDelAlumno2(pos[0],pos[1])==0){ 
            instituto.setCodigoDelAlumno2(codigo, pos[0],pos[1]);
            instituto.setNombreDelAlumno2(nombre, pos[0],pos[1]);
            instituto.setPensionDelAlumno2(pension, pos[0],pos[1]);
            return true;
        }
        else { 
            pos[1]=1;
            if (instituto.getCodigoDelAlumno2(pos[0],pos[1])==0){ 
            instituto.setCodigoDelAlumno2(codigo, pos[0],pos[1]);
            instituto.setNombreDelAlumno2(nombre, pos[0],pos[1]);
            instituto.setPensionDelAlumno2(pension, pos[0],pos[1]);
            return true;
            }
            else{
                pos_sigte = pos[0] + 1;
                pos[1]=0;
                while(pos_sigte < instituto.getNumeroDeAlumnos() &&
                instituto.getCodigoDelAlumno2(pos_sigte,pos[1]) !=0 &&
                pos_sigte!=pos[0]){
                    pos[1]=pos[1]+1;
                    if (instituto.getCodigoDelAlumno2(pos_sigte,pos[1])==0){ 
                    instituto.setCodigoDelAlumno2(codigo, pos_sigte,pos[1]);
                    instituto.setNombreDelAlumno2(nombre, pos_sigte,pos[1]);
                    instituto.setPensionDelAlumno2(pension, pos_sigte,pos[1]);
                    return true;
                    }
                    if ( pos_sigte == instituto.getNumeroDeAlumnos()){
                        pos_sigte=0;
                    }
                    if (pos[1]==2 ) {
                    pos[1]=0;
                    }
                    pos_sigte++;
                }
                    
                if (instituto.getCodigoDelAlumno2(pos_sigte,pos[1])==0){
                    instituto.setCodigoDelAlumno2(codigo, pos_sigte,pos[1]);
                    instituto.setNombreDelAlumno2(nombre, pos_sigte,pos[1]);
                    instituto.setPensionDelAlumno2(pension, pos_sigte,pos[1]);
                    return true;
                }
                else{
                  return false;  
                }
            }
            
        }  
    }
    
    //Buscar en tabla hash por colision arregloAnidado
    public static int[] buscarArregloAnidado(Instituto instituto,int codigo){
        int  pos[]=new int[2];
        int  pos_sigte;
        pos[0] = hash (codigo);
        pos[1]=0;
        if (instituto.getCodigoDelAlumno2(pos[0],pos[1])==codigo){
            return pos;
        }
        
        else{
            pos[1]=1;
            if (instituto.getCodigoDelAlumno2(pos[0],pos[1])==codigo) {
                return pos;
            }
            else{
               pos_sigte = pos[0] + 1;
               pos[1]=0;
               while(pos_sigte < instituto.getNumeroDeAlumnos() &&
                instituto.getCodigoDelAlumno2(pos_sigte,pos[1]) !=0 &&
                pos_sigte!=pos[0] &&
                instituto.getCodigoDelAlumno2(pos_sigte,pos[1])!=codigo){
                pos[1]=pos[1]+1;
                
                if(instituto.getCodigoDelAlumno2(pos_sigte, pos[1])==codigo){
                    pos[0]=pos_sigte;
                    return pos;
                }
                if ( pos_sigte == instituto.getNumeroDeAlumnos()){
                    pos_sigte=0;
                }
                if (pos[1]==2 ) {
                    pos[1]=0;
                }
                pos_sigte++; 
                }  
            }
           
            if (instituto.getCodigoDelAlumno2(pos_sigte,pos[1])==0 || pos_sigte==pos[0]){
            return null; //código no existe
            }
            else{
                pos[0]=pos_sigte;
                return pos;
            }
        }
    }
    
    //Borrar EN TABLA HASH POR ARREGLO ANIDADO
    public static void borrarArregloAnidado(Instituto instituto,int codigo){
        int[] pos=ReasignacionPorArregloAnidado.buscarArregloAnidado(instituto, codigo);
        if (pos!=null) {
            instituto.setCodigoDelAlumno2(0,pos[0],pos[1]);
            instituto.setNombreDelAlumno2("", pos[0],pos[1]);
            instituto.setPensionDelAlumno2(0, pos[0],pos[1]); 
            System.out.println("Eliminado con Exito");
        }
        else{
            System.out.println("No se encontro");
        }
    }
    
}
