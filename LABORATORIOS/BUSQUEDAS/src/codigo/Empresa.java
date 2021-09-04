package codigo;

public class Empresa {
   private Empleado empleados[];
    private final int NUMERO_EMPLEADOS = 20;
    private int intercambios = 0;
    private int comparaciones = 0;
    private static int intercambiosQuickSort=0;
     private static int comparacionesQuickSort=0;
    
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

    
    public void OrdenBurbuja(){
        Empleado temp = new Empleado(0,"",0);
        comparaciones = 0;
        intercambios = 0;
        //Numero de vueltas
        for (int i = 1; i< empleados.length; i++ ){
            //Compararamos el elemento del final 
            for (int j = empleados.length-1 ; j >= i; j--){
                comparaciones++;
                //Si el empleado en pos j-1 tiene
                if(empleados[j-1].getCodigoDelEmpleado() >
                   empleados[j].getCodigoDelEmpleado()){

                    temp.setCodigoDelEmpleado(empleados[j-1].getCodigoDelEmpleado());
                    empleados[j-1].setCodigoDelEmpleado (empleados[j].getCodigoDelEmpleado());
                    empleados[j].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
                    temp.setNombreDelEmpleado(empleados[j-1].getNombreDelEmpleado());
                    empleados[j-1].setNombreDelEmpleado(empleados[j].getNombreDelEmpleado());
                    empleados[j].setNombreDelEmpleado(temp.getNombreDelEmpleado());
                    temp.setSueldoDelEmpleado(empleados[j-1].getSueldoDelEmpleado());
                    empleados[j-1].setSueldoDelEmpleado(empleados[j].getSueldoDelEmpleado());
                    empleados[j].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());
                    intercambios++;
                }
            }
        }
    }
    
    
    public void OrdenInsercionDirecta(){
        Empleado temp = new Empleado(0,"",0);
        comparaciones = 0;
        intercambios = 0;
        int k;
        for (int i = 1; i < empleados.length; i++){
            comparaciones++;
            temp.setCodigoDelEmpleado(empleados[i].getCodigoDelEmpleado());
            temp.setNombreDelEmpleado(empleados[i].getNombreDelEmpleado());
            temp.setSueldoDelEmpleado(empleados[i].getSueldoDelEmpleado());
            k = i - 1;
            while ( k >= 0 && temp.getCodigoDelEmpleado()<empleados[k].getCodigoDelEmpleado())
            {
                empleados[k+1].setCodigoDelEmpleado(empleados[k].getCodigoDelEmpleado());
                empleados[k+1].setNombreDelEmpleado(empleados[k].getNombreDelEmpleado());
                empleados[k+1].setSueldoDelEmpleado(empleados[k].getSueldoDelEmpleado());
                k--;
                intercambios++;
            }
            empleados[k+1].setCodigoDelEmpleado(temp.getCodigoDelEmpleado());
            empleados[k+1].setNombreDelEmpleado(temp.getNombreDelEmpleado());
            empleados[k+1].setSueldoDelEmpleado(temp.getSueldoDelEmpleado());
        }
        
    }
    
    public void OrdenSeleccionDirecta(){
        Empleado min=new Empleado(0,"",0);
        comparaciones = 0;
        intercambios = 0;
        for (int i = 0; i < empleados.length-2; i++) {
            min.setCodigoDelEmpleado(empleados[i].getCodigoDelEmpleado());
            min.setNombreDelEmpleado(empleados[i].getNombreDelEmpleado());
            min.setSueldoDelEmpleado(empleados[i].getSueldoDelEmpleado());
            int pos=i;
            for (int j = i+1; j < empleados.length-1; j++) {
                comparaciones++;
                if (empleados[j].getCodigoDelEmpleado()<min.getCodigoDelEmpleado()){
                    intercambios++;
                    min.setCodigoDelEmpleado(empleados[j].getCodigoDelEmpleado());
                    min.setNombreDelEmpleado(empleados[j].getNombreDelEmpleado());
                    min.setSueldoDelEmpleado(empleados[j].getSueldoDelEmpleado());
                    pos=j;
                }
            }
            intercambios++;
            empleados[pos].setCodigoDelEmpleado(empleados[i].getCodigoDelEmpleado());
            empleados[pos].setNombreDelEmpleado(empleados[i].getNombreDelEmpleado());
            empleados[pos].setSueldoDelEmpleado(empleados[i].getSueldoDelEmpleado());
            empleados[i].setCodigoDelEmpleado(min.getCodigoDelEmpleado());
            empleados[i].setNombreDelEmpleado(min.getNombreDelEmpleado());
            empleados[i].setSueldoDelEmpleado(min.getSueldoDelEmpleado());
        }
    }
    
    public void ReduceQuicksort(int ini, int fin ){
    Empleado aux = new Empleado(0,"",0);
    int izq=ini,der=fin,pos=ini;
    boolean flag=true;
    while(flag==true){
        flag=false;
        while((empleados[pos].getCodigoDelEmpleado()<=empleados[der].getCodigoDelEmpleado())&& (pos != der)  ){
            comparacionesQuickSort++;
            der=der-1;
        }
        if(pos != der){
                intercambiosQuickSort++;
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
                     comparacionesQuickSort++;
                     izq=izq+1;
                 }
                 if(pos !=izq){
                     intercambiosQuickSort++;
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
    
    public void MetodoQuickSort(){
        ReduceQuicksort(0,empleados.length-1);
    }
    
    
    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    public int getIntercambios() {
        return intercambios;
    }

    public void setIntercambios(int intercambios) {
        this.intercambios = intercambios;
    }

    public int getComparaciones() {
        return comparaciones;
    }

    public void setComparaciones(int comparaciones) {
        this.comparaciones = comparaciones;
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

    public static int getIntercambiosQuickSort() {
        return intercambiosQuickSort;
    }

    public static void setIntercambiosQuickSort(int intercambiosQuickSort) {
        Empresa.intercambiosQuickSort = intercambiosQuickSort;
    }

    public static int getComparacionesQuickSort() {
        return comparacionesQuickSort;
    }

    public static void setComparacionesQuickSort(int comparacionesQuickSort) {
        Empresa.comparacionesQuickSort = comparacionesQuickSort;
    }
    
}
