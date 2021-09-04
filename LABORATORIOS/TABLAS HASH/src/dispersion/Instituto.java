package dispersion;


public class Instituto {
    
    private Alumno alumnos[];     //Arreglo HashComun 
    private Alumno[][] alumnos2;  //ArregloAnidado
    public nodo alumnos3[];       //Arreglo de Nodos
    
    private final int TAM_TABLA = 20;
    private final int grosor=2; //Para ArregloAnidado
    
   
    public Instituto(String modo){ //Modo en que se crea la tabla hash
        switch(modo){
            case "simple": //Lineal,Cuadratico,DobleDireccion
                alumnos = new Alumno[TAM_TABLA];
                for (int i=0; i<TAM_TABLA; i++){
                    alumnos[i] = new Alumno(0,"",0);
                    }
                break;
            case "arregloAnidado": //ArregloAnidado
                alumnos2 = new Alumno[TAM_TABLA][grosor];
                for (int i=0; i<TAM_TABLA; i++){
                    for (int j = 0; j < grosor; j++) {
                        alumnos2[i][j] = new Alumno(0,"",0);
                    }  
                }
                break;
            case "listaenlazada": //Encadenamiento
                alumnos3=new nodo[TAM_TABLA];
                for (int i=0; i<TAM_TABLA; i++){
                    Alumno alumno=new Alumno(0,"",0);
                    alumnos3[i]=new nodo(alumno);
                }
                break;     
        }
    }
    
    
    public void setCodigoDelAlumno (int codigo, int i){
        alumnos[i].setCodigoDelAlumno(codigo);
    }
    
     //Para arregloanidado
    public void setCodigoDelAlumno2 (int codigo,int i,int j){
        alumnos2[i][j].setCodigoDelAlumno(codigo);
    }
    
    //Para lista enlazada
    public void setCodigoDelAlumno3 (int codigo, int i){
        alumnos3[i].contenido.setCodigoDelAlumno(codigo);
    }
    public int getCodigoDelAlumno (int i){
        return alumnos[i].getCodigoDelAlumno();
    }
    
    //Para arregloanidado
    public int getCodigoDelAlumno2 (int i,int j){
        return alumnos2[i][j].getCodigoDelAlumno();
    }
    
    //Para lista enlazada
    public int getCodigoDelAlumno3 (int i){
        return alumnos3[i].contenido.getCodigoDelAlumno();
    }
    
    public void setNombreDelAlumno (String nombre, int i){
        alumnos[i].setNombreDelAlumno(nombre);
    }
    
    //Para arregloanidado
     public void setNombreDelAlumno2 (String nombre, int i,int j){
        alumnos2[i][j].setNombreDelAlumno(nombre);
    }
     
    //Para lista enlazada
    public void setNombreDelAlumno3 (String nombre, int i){
        alumnos3[i].contenido.setNombreDelAlumno(nombre);
    }
    
    public String getNombreDelAlumno (int i){
        return alumnos[i].getNombreDelAlumno();
    }
    
    //Para arregloanidado
    public String getNombreDelAlumno2 (int i,int j){
        return alumnos2[i][j].getNombreDelAlumno();
    }
   
    
    //Para arregloanidado
    public void setPensionDelAlumno (float pension, int i){
        alumnos[i].setPensionDelAlumno(pension);
    }
    
    //Para arregloanidado
     public void setPensionDelAlumno2 (float pension, int i,int j){
        alumnos2[i][j].setPensionDelAlumno(pension);
    }
     
     //Para lista enlazada
    public void setPensionDelAlumno3 (float pension,int i){
        alumnos3[i].contenido.setPensionDelAlumno(pension);
    }
    
    public float getPensionDelAlumno (int i){
        return alumnos[i].getPensionDelAlumno();
    }
    
     public float getPensionDelAlumno2 (int i,int j){
        return alumnos2[i][j].getPensionDelAlumno();
    }
    
    public int getNumeroDeAlumnos(){
        return TAM_TABLA;
    }
    
    //Para arreglo anidado
    public int getGrosor(){
        return grosor;
    }
    
    public nodo getAlumno(int i){
        return alumnos3[i];
    }
    
    public void setAlumno(int i,nodo Alumno){
        alumnos3[i]=Alumno;
    }
    
    //Funciones Hash
    public int hash(int clave){
        return clave%19;
    }
    
    public int hash2(int clave){
        return (clave+7)%19;
    }
    
    
    public int hash(String nombre){
        String cadena=nombre.replace(" ", ""); //Eliminamos espacios en blanco
        int hash=0;
        for (int i = 0; i < cadena.length(); i++) {
            int ascii=(int)(cadena.toCharArray()[i]);
            hash=hash+ascii;
        }
        return hash%19;
    }
    ///////////////////
    
    //Resolucion de colision por metodo reasignacion lineal
    public boolean Insertar(int codigo, String nombre, float pension){
        int pos, pos_sigte;
        pos = hash (codigo);
        if (getCodigoDelAlumno(pos)==0){ //Si esa pos esta libre
            setCodigoDelAlumno(codigo, pos);
            setNombreDelAlumno(nombre, pos);
            setPensionDelAlumno(pension, pos);
            return true;
        }
        else { //Se produce colisión: Solución por reasignación por prueba lineal
            pos_sigte = pos + 1;
            while(pos_sigte < getNumeroDeAlumnos() &&
            getCodigoDelAlumno(pos_sigte) !=0 &&
            pos_sigte!=pos){
                pos_sigte++;
                if ( pos_sigte == getNumeroDeAlumnos())
                    pos_sigte=0;
            }
            if (getCodigoDelAlumno(pos_sigte)==0){
                setCodigoDelAlumno(codigo, pos_sigte);
                setNombreDelAlumno(nombre, pos_sigte);
                setPensionDelAlumno(pension, pos_sigte);
                return true;
            }
            else{
              return false;  
            }
        }  
    }
    
    public int Buscar(int codigo){
        int pos, pos_sigte;
        pos = hash (codigo);
        if (getCodigoDelAlumno(pos)==codigo){
            return pos;
        }
        else{//Se produce colisión: Solución por reasignación por prueba lineal
            pos_sigte = pos + 1;
            while(pos_sigte < getNumeroDeAlumnos() &&
            getCodigoDelAlumno(pos_sigte) !=0 &&
            pos_sigte!=pos &&
            getCodigoDelAlumno(pos)!=codigo){
                pos_sigte++;
                if ( pos_sigte == getNumeroDeAlumnos()){
                    pos_sigte=0;
                }
            }
            if (getCodigoDelAlumno(pos_sigte)==0 || pos_sigte==pos){
            return -1; //código no existe
            }
            else{
                return pos_sigte;
            }
        }
    }
     
    
    public void eliminar(int codigo){
        int pos=Buscar(codigo);
        if (pos!=-1) {
            setCodigoDelAlumno(0,pos);
            setNombreDelAlumno("", pos);
            setPensionDelAlumno(0, pos); 
            System.out.println("Eliminado con Exito");
        }
        else{
            System.out.println("No se encontro");
        }
      
    }
    
}
