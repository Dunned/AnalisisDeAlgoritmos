package codigo;

import java.util.Arrays;

public class Empresa {
    private Empleado empleados[];
    private final int NUMERO_EMPLEADOS = 20;
    private int numeroDeComparaciones;
    
    public Empresa(){
        int[] codigos = {204, 305, 105, 204,
                        415, 106, 500, 100, 
                        540, 420,100, 215, 
                        340, 180, 600, 312, 
                        147, 165, 510, 601};
        String[] nombres={"Juan", "Ana", "Rosa", 
                        "Carlos", "Raúl","Pedro", 
                        "Rosario", "Martha", "Saúl", 
                        "Karen", "Rosa", "Francis", 
                        "Ricardo", "Luis", "Damaris",
                        "Diana","Pablo","Marcelo",
                        "Carolina","Ingrid"};
        float sueldos[ ] = {1500, 800, 2000, 
                            550, 1200, 3500, 
                            1800, 900, 750, 
                            4000,750, 1500, 
                            1200, 3500, 4000, 
                            1800, 950, 1400, 600, 5500};

        empleados = new Empleado[NUMERO_EMPLEADOS];
        for (int i=0; i<empleados.length; i++)
        empleados[i] = new Empleado(codigos[i], nombres[i], sueldos[i]);
    }

    
    //Ordenamiento
    public void ReduceQuicksort(int ini, int fin ){
    Empleado aux = new Empleado(0,"",0);
    int izq=ini,der=fin,pos=ini;
    boolean flag=true;
    while(flag==true){
        flag=false;
        while((empleados[pos].getCodigoDelEmpleado()<=empleados[der].getCodigoDelEmpleado())&& (pos != der)  ){
            der=der-1;
        }
        if(pos != der){
                 aux.setCodigoDelEmpleado(empleados[pos].getCodigoDelEmpleado());
                 empleados[pos].setCodigoDelEmpleado(empleados[der].getCodigoDelEmpleado());
                 empleados[der].setCodigoDelEmpleado(aux.getCodigoDelEmpleado());
                 aux.setNombreDelEmpleado(empleados[pos].getNombreDelEmpleado());
                 empleados[pos].setNombreDelEmpleado(empleados[der].getNombreDelEmpleado());
                 empleados[der].setNombreDelEmpleado(aux.getNombreDelEmpleado());
                 aux.setSueldoDelEmpleado(empleados[pos].getSueldoDelEmpleado());
                 empleados[pos].setSueldoDelEmpleado(empleados[der].getSueldoDelEmpleado());
                 empleados[der].setSueldoDelEmpleado(aux.getSueldoDelEmpleado());
                 pos=der;
                 while((empleados[pos].getCodigoDelEmpleado()>=empleados[izq].getCodigoDelEmpleado()) && (pos!=izq)){
                     izq=izq+1;
                 }
                 if(pos !=izq){
                     empleados[pos].setCodigoDelEmpleado(empleados[izq].getCodigoDelEmpleado());
                     empleados[izq].setCodigoDelEmpleado(aux.getCodigoDelEmpleado());
                     aux.setNombreDelEmpleado(empleados[pos].getNombreDelEmpleado());
                     empleados[pos].setNombreDelEmpleado(empleados[izq].getNombreDelEmpleado());
                     empleados[izq].setNombreDelEmpleado(aux.getNombreDelEmpleado());
                     aux.setSueldoDelEmpleado(empleados[pos].getSueldoDelEmpleado());
                     empleados[pos].setSueldoDelEmpleado(empleados[izq].getSueldoDelEmpleado());
                     empleados[izq].setSueldoDelEmpleado(aux.getSueldoDelEmpleado()); 
                     pos=izq;
                     flag=true;
                  }
        }
        
    }
    if(pos-1>ini){
        ReduceQuicksort(ini,pos-1);
    }
    if(fin>pos+1){
        ReduceQuicksort(pos+1,fin);
    }
    }
    
     
    public void Ordenar(){
        ReduceQuicksort(0,empleados.length-1);
    }
    
    ////////
    
    
    public int busquedaSecuencialDesordenada(int codigo){
        int i=0;
        int pos=-1;
        boolean encontrado=false;
        while ((i<=(NUMERO_EMPLEADOS-1)) && (encontrado=false)) { 
            numeroDeComparaciones++;
            if (empleados[i].getCodigoDelEmpleado()==codigo) {
                pos=i;
                encontrado=true;
            }
            i++;
        }
        return pos; //Retorna la pos del elemento buscado 
                    //Retorna -1 si no encuentra dicho elemento
    }
    
    //Arreglo de empleados debe estar ordenado por Codigos
    public int busquedaSecuencialOrdenada(int codigo){
        int i=0;
        int pos=-1;
        boolean encontrado=false;
        while ((i<=(NUMERO_EMPLEADOS-1)) && (encontrado=false) 
                && (codigo>=empleados[i].getCodigoDelEmpleado())) { 
            numeroDeComparaciones++;
            if (empleados[i].getCodigoDelEmpleado()==codigo) {
                pos=i;
                encontrado=true;
            }
            i++;
        }
        return pos; //Retorna la pos del elemento buscado 
                    //Retorna -1 si no encuentra dicho elemento
    }
    
    
    
    //Arreglo preeviamente ordenado
    public int busquedaSecuencialPorBloques(int codigo){
        int k=(int) Math.sqrt(NUMERO_EMPLEADOS); //tamaño del bloque
        int inicio=0; //Posicion inicial del primer bloque
        int fin=k-1; //Posicion final del primer bloque
        int i=1; //Contador para recorrer bloques
        
        //Calculando #BLOQUES (m)
        int m;
        if (empleados.length % k ==0) { //Division entera
            m=empleados.length/k;
        }
        else{ //Division no entera
            m= (int)((empleados.length/k) + 1);
        }
        
      
        //Busqueda Secuencial en los ultimos elementos de cada bloque
        while ( (i<=m) && (empleados[fin].getCodigoDelEmpleado()<=codigo) ) { 
            numeroDeComparaciones++;
            if (codigo==empleados[fin].getCodigoDelEmpleado()) { //Encontrado
                return fin;
            }
            
            i++;
            inicio=inicio+k;
            fin=fin+k;
            
            //Para controlar el ultimo bloque
            if (fin>empleados.length-1) { //Ultimo bloque de otro tamaño != m
                fin=empleados.length-1;
            }
        }
        
        //Busqueda secuencial en una seccion del bloque
        int j=inicio;
        while ( (j<=fin-1) && (empleados[j].getCodigoDelEmpleado()<=codigo) ) { 
            numeroDeComparaciones++;
            if (codigo==empleados[j].getCodigoDelEmpleado()) { //Encontro
                return j;
            }
            j++;
        }
        return -1; //Si nunca lo encuntra (no existe)
    }
    
    public int busquedaBinariaIterativa(int codigo){
        int ini=0;
        int fin=empleados.length-1;
        while (ini<=fin) {            
            int medio=(int)((ini+fin)/2);
            if (codigo==empleados[medio].getCodigoDelEmpleado()) {
                numeroDeComparaciones++;
                return medio;
            }
            else{
                if (codigo<empleados[medio].getCodigoDelEmpleado()) {
                    numeroDeComparaciones++;
                    fin=medio-1;
                }
                else{
                    numeroDeComparaciones++;
                    ini=medio+1;
                }
            }
        }
        return -1; //Si no encuentra nada
    }
    
    public int busquedaBinariaRecursiva(int ini,int fin,int codigo){
        if (ini>fin) {
            return -1;
        }
        else{
            int medio=(int)((ini+fin)/2);
            if (codigo==empleados[medio].getCodigoDelEmpleado()) {
                numeroDeComparaciones++;
                return medio;
            }
            else{
                if (codigo<empleados[medio].getCodigoDelEmpleado()) {
                    numeroDeComparaciones++;
                    busquedaBinariaRecursiva(ini,medio-1,codigo);
                }
            }
            
        }
        return -1;
    }
    
    //*METODO POR INDEXACION
    public class ElementoIndice{
        public int clave;
        public int pos;

        public ElementoIndice(int clave, int pos) {
            this.clave = clave;
            this.pos = pos;
        }

       
      
    }
    
    public ElementoIndice[] crearArregloIndice(){
        int n=empleados.length;
        int k=(int)(Math.sqrt(n));
        int m;
        if (n % k ==0) {
            m=(int)(n/k);
        }
        else{
            m=(int)((n/k)+1);
        }
        
        ElementoIndice[] indice=new ElementoIndice[m];
        int inicio=0;
        for (int i = 0; i < m; i++) {
            ElementoIndice temp=new ElementoIndice(empleados[inicio].getCodigoDelEmpleado(),inicio);
            indice[i]=temp;
            inicio=inicio+k;
        }
        return indice;
    }
    
    public int busquedaIndexada(int codigo){
        int n=empleados.length;
        int k=(int)(Math.sqrt(n));
        int m;
        if (n % k==0) {
            m=(int)(n/k);
        }
        else{
            m=(int)((n/k)+1);
        }
        int inicio=0;
        int fin=m-1;
        int centro;
        ElementoIndice[] indice=crearArregloIndice();
        while(inicio<=fin){
            centro=(inicio+fin)/2;
            if (codigo==indice[centro].clave) {
                numeroDeComparaciones++;
                return indice[centro].pos;
            }
            else{
                if (codigo<indice[centro].clave) {
                    numeroDeComparaciones++;
                    fin=centro-1;
                }
                else{
                    numeroDeComparaciones++;
                    inicio=centro+1;
                }
            }
        }
        
        
        if (fin==-1) {
            return -1;
        }
        else{
            inicio=indice[fin].pos;
            fin=inicio+k-1;
            if (fin>=n) {
                fin=n-1;
            }
            while(inicio<=fin){
                centro=(int)((inicio+fin)/2);
                if (codigo==empleados[centro].getCodigoDelEmpleado()) {
                    return centro;
                }
                else{
                    if (codigo<empleados[centro].getCodigoDelEmpleado()) {
                        fin=centro-1;
                    }
                    else{
                        inicio=centro+1;
                    }
                }
            }
            return -1;
        }
    }
    
     
    
    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public int getNUMERO_EMPLEADOS() {
        return NUMERO_EMPLEADOS;
    }
    
    public int getCodigoDelEmpleado (int i)
    {
        
    return empleados[i].getCodigoDelEmpleado( );
    }
    
    public void setCodigoDelEmpleado (int codigo, int i)
    {
    empleados[i].setCodigoDelEmpleado(codigo);
    }

    public String getNombreDelEmpleado (int i){
    return empleados[i].getNombreDelEmpleado( );
    }
    
    public void setNombreDelEmpleado (String nombre, int i){
    empleados[i].setNombreDelEmpleado(nombre);
    }
    
    public float getSueldoDelEmpleado (int i){
    return empleados[i].getSueldoDelEmpleado();
    }
    
    public void setSueldoDelEmpleado (float sueldo, int i){
    empleados[i].setSueldoDelEmpleado(sueldo);
    }

    public int getNumeroDeComparaciones() {
        return numeroDeComparaciones;
    }

}