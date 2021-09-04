package laboratorio001_semana02;

public class PruebaLaboratiorio001 {
    public static void main(String[] args) {
        Laboratorio001 laboratorio001=new Laboratorio001();
        System.out.println("*******PROBANDO EL MCD*******");
        int a=10;
        int b=5;
        int c=53;
        int d=7;
        int e=0;
        int f=0;
        int g=10;
        System.out.println("Maximo como un divisor de ("+a+","+b+") es: "+laboratorio001.maximoComunDivisor(a,b));
        System.out.println("Con un contador de: "+laboratorio001.getContadorTiempo()+" pasos");
        System.out.println("------");
        System.out.println("Maximo como un divisor de ("+c+","+d+") es: "+laboratorio001.maximoComunDivisor(c,d));
        System.out.println("Con un contador de: "+laboratorio001.getContadorTiempo()+" pasos");
        System.out.println("------");
        System.out.println("Maximo como un divisor de ("+e+","+d+") es: "+laboratorio001.maximoComunDivisor(e,f));
        System.out.println("Con un contador de: "+laboratorio001.getContadorTiempo()+" pasos");
        System.out.println("------");
        System.out.println("Maximo como un divisor de ("+f+","+g+") es: "+laboratorio001.maximoComunDivisor(f,g));
        System.out.println("Con un contador de: "+laboratorio001.getContadorTiempo()+" pasos");

        System.out.println();
        System.out.println("*******PROBANDO EL BUSQUEDA SECUENCIAL*******");

        Integer[] numeros= {-2,-25,3,99,5,10,12,0};
        String[] palabras= {"eduardo","william","carlos","fernando","cristian"};
        Double[] decimales= {10.2,9.9,7.2,0.3,-5.3};

        System.out.println("En el vector: "+laboratorio001.mostrarVector(numeros));
        System.out.println("Se encuentra el dato 2?: "+laboratorio001.buscar(numeros,2)+",  #pasos: "+laboratorio001.getContadorTiempo());
        System.out.println("Se encuentra el dato 3?: "+laboratorio001.buscar(numeros,3)+",  #pasos: "+laboratorio001.getContadorTiempo());
        System.out.println("------");
        System.out.println("En el vector: "+laboratorio001.mostrarVector(palabras));
        System.out.println("Se encuentra el valor eduardo?: "+laboratorio001.buscar(palabras,"eduardo")+",  #pasos: "+laboratorio001.getContadorTiempo());
        System.out.println("Se encuentra el valor jimmy?: "+laboratorio001.buscar(palabras,"jimmy")+",  #pasos: "+laboratorio001.getContadorTiempo());
        System.out.println("------");
        System.out.println("En el vector: "+laboratorio001.mostrarVector(decimales));
        System.out.println("Se encuentra el valor 0.3?: "+laboratorio001.buscar(decimales,0.3)+",  #pasos: "+laboratorio001.getContadorTiempo());
        System.out.println("Se encuentra el valor 96.3?: "+laboratorio001.buscar(decimales,96.3)+",  #pasos: "+laboratorio001.getContadorTiempo());

    }

}
