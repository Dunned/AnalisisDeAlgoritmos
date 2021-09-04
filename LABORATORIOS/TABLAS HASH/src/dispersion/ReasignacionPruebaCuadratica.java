package dispersion;

import java.util.Scanner;

public class ReasignacionPruebaCuadratica {
    
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
    
      public static boolean InsertarPruebaCuadratica(Instituto instituto,int codigo, String nombre, float pension){
        int pos, pos_sigte;
        pos = hash (codigo);
        if (instituto.getCodigoDelAlumno(pos)==0){ //Si esa pos esta libre
            instituto.setCodigoDelAlumno(codigo, pos);
            instituto.setNombreDelAlumno(nombre, pos);
            instituto.setPensionDelAlumno(pension, pos);
            return true;
        }
        else { //Se produce colisión: Solución por reasignación por prueba lineal
            int i=1;
            pos_sigte = pos + i*i;
            while(pos_sigte < instituto.getNumeroDeAlumnos() &&
            instituto.getCodigoDelAlumno(pos_sigte) !=0/*/Estalleno*/ &&
            pos_sigte!=pos){
                i++;
                pos_sigte=pos+i*i;
                if ( pos_sigte >= instituto.getNumeroDeAlumnos()){
                    pos_sigte=0;
                    while (pos_sigte < instituto.getNumeroDeAlumnos() &&
                           instituto.getCodigoDelAlumno(pos_sigte) !=0) {                        
                           pos_sigte++;
                    }
                }
                    
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
      
       public static boolean InsertarPruebaCuadraticaNombre(Instituto instituto,int codigo, String nombre, float pension){
        int pos, pos_sigte;
        pos = hash (nombre);
        if (instituto.getNombreDelAlumno(pos).equals("")){ //Si esa pos esta libre
            instituto.setCodigoDelAlumno(codigo, pos);
            instituto.setNombreDelAlumno(nombre, pos);
            instituto.setPensionDelAlumno(pension, pos);
            return true;
        }
        else { //Se produce colisión: Solución por reasignación por prueba lineal
            int i=1;
            pos_sigte = pos + i*i;
            while(pos_sigte < instituto.getNumeroDeAlumnos() &&
            !instituto.getNombreDelAlumno(pos_sigte).equals("")/*/Estalleno*/ &&
            pos_sigte!=pos){
                i++;
                pos_sigte=pos+i*i;
                if ( pos_sigte >= instituto.getNumeroDeAlumnos()){
                    pos_sigte=0;
                    while (pos_sigte < instituto.getNumeroDeAlumnos() &&
                           !instituto.getNombreDelAlumno(pos_sigte).equals("")) {                        
                           pos_sigte++;
                    }
                }
                    
            }
            if (instituto.getNombreDelAlumno(pos_sigte).equals("")){
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
    
    public static int BuscarColisionPruebaCuadratica(Instituto instituto,int codigo){
        int pos, pos_sigte;
        pos = hash (codigo);
        if (instituto.getCodigoDelAlumno(pos)==codigo){
            return pos;
        }
        else{//Se produce colisión: Solución por Prueba cuadratica
            int i=1;
            pos_sigte = pos + i*i;
            while(pos_sigte < instituto.getNumeroDeAlumnos() &&
            pos_sigte!=pos &&
            instituto.getCodigoDelAlumno(pos_sigte)!=codigo){
                i++;
                pos_sigte=pos+i*i;
                if ( pos_sigte >= instituto.getNumeroDeAlumnos()){
                    pos_sigte=0;
                    while (pos_sigte < instituto.getNumeroDeAlumnos() &&
                           instituto.getCodigoDelAlumno(pos_sigte)!=codigo) {                        
                           pos_sigte++;
                    }
                }
            }
            if (instituto.getCodigoDelAlumno(pos_sigte)==0 || pos_sigte==pos){         
            return -1; //código no existe
            }
            else{
                return pos_sigte;
            }
        }
    }
    
    
     public static int BuscarColisionPruebaCuadraticaNombre(Instituto instituto,String nombre){
        int pos, pos_sigte;
        pos = hash (nombre);
        if (instituto.getNombreDelAlumno(pos).equals(nombre)){
            return pos;
        }
        else{//Se produce colisión: Solución por Prueba cuadratica
            int i=1;
            pos_sigte = pos + i*i;
            while(pos_sigte < instituto.getNumeroDeAlumnos() &&
            pos_sigte!=pos &&
            !instituto.getNombreDelAlumno(pos_sigte).equals(nombre)){
                i++;
                pos_sigte=pos+i*i;
                if ( pos_sigte >= instituto.getNumeroDeAlumnos()){
                    pos_sigte=0;
                    while (pos_sigte < instituto.getNumeroDeAlumnos() &&
                           !instituto.getNombreDelAlumno(pos_sigte).equals(nombre)){                        
                           pos_sigte++;
                    }
                }
            }
            if (instituto.getNombreDelAlumno(pos_sigte).equals("") || pos_sigte==pos){         
            return -1; //código no existe
            }
            else{
                return pos_sigte;
            }
        }
    }
    
    public static void eliminarPruebaCuadratica(Instituto instituto,int codigo){
        int pos=ReasignacionPruebaCuadratica.BuscarColisionPruebaCuadratica(instituto, codigo);
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
    
    public static void eliminarPruebaCuadraticaNombre(Instituto instituto,String nombre){
        int pos=ReasignacionPruebaCuadratica.BuscarColisionPruebaCuadraticaNombre(instituto, nombre);
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
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Instituto miInstituto = new Instituto("simple");
        int codigo[] = {154236,140627,123952,563100,235691,122695,322145,621300,300621,100960,100820, 100120, 200110,
                        204530, 100150,100012, 100213, 100250, 100540, 100420}; // 100540 100420
        String nombre[] = {"Chiki Carrion","Mariel Barrios","Jordi Salas","Jesus Andres",
                            "Pedro Vino","Matias Succar","Paolo Guerrero","Pedro Aquino",
                            "Carlos Villena","Eduardo Jauregui","Juan Rosales", "Ana Ramirez", "Rosa Huapaya",
                            "Carlos Arana", "Raul Gonzales", "Pedro Mamani",
                            "Rosario Paredes", "Martha Huaman", "Saul Espino",
                            "Karen Mendiola"};
        float pension[] = {367,560,367,742,521,652,1000,963,177,322,320, 400, 300, 400, 350, 320, 450, 320, 450, 300};
        
        boolean flag;
        for (int i = 0; i < codigo.length; i++){
            flag = ReasignacionPruebaCuadratica.InsertarPruebaCuadratica(miInstituto,codigo[i],nombre[i],pension[i]);
            if (flag==false) {
                System.out.println("Tabla llena");
            }
        }
        for (int i = 0; i < miInstituto.getNumeroDeAlumnos(); i++){
            System.out.printf("%d\t%20s%10.2f\n",
            miInstituto.getCodigoDelAlumno(i),
            miInstituto.getNombreDelAlumno(i),
            miInstituto.getPensionDelAlumno(i));
        }
        System.out.println(hash(300));
                System.out.println("sssss"+miInstituto.getNombreDelAlumno(16));
               System.out.println("sssss"+miInstituto.getNombreDelAlumno(17));
               System.out.println("sssss"+miInstituto.getNombreDelAlumno(18));

        System.out.print("\n\nCodigo del alumno: ");
        int cod = entrada.nextInt();
        int pos = ReasignacionPruebaCuadratica.BuscarColisionPruebaCuadratica(miInstituto,cod);
        if (pos != -1 ){
            System.out.printf("\n%d\t%20s%10.2f\n",
            miInstituto.getCodigoDelAlumno(pos),
            miInstituto.getNombreDelAlumno(pos),
            miInstituto.getPensionDelAlumno(pos));
    
        }
        else{
            System.out.println("\n\nCodigo de alumno no existe"); 
        }
    }
}
