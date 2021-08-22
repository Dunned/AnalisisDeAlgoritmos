
import java.util.Arrays;

public class MochilaFraccionaria {

    
    public void Voraz(Objetos[] v,double[] sol, double cap) {
        OrdenBurbuja(v); //Ordenamos el arreglo de objetos en funcion de su valor/peso
        double resto=cap;
        int i=0;
        while (i < v.length &&v [i].peso<=resto) {
            sol[i]=1;
            resto=resto-v[i].peso;
            i++;
        }
        if (resto>0) {
            if (i==v.length) {
                //NO HAY MAS OBJETOS PARA LLENAR LA MOCHILA
            }
            else{ // HAY MAS OBJETOS PEOR NO ENTRA COMPLETO
              sol[i]=resto/v[i].peso;  
            }
        }
    }
    
    public void OrdenBurbuja(Objetos[] o){
        Objetos temp = new Objetos("",0.0,0.0);
        //Numero de vueltas
        for (int i = 1; i< o.length; i++ ){
            //Compararamos el elemento del final 
            for (int j = o.length-1 ; j >= i; j--){
                if(o[j-1].valorPeso <o[j].valorPeso){
                    temp.nombre=o[j-1].nombre;
                    o[j-1].nombre=o[j].nombre;
                    o[j].nombre=temp.nombre;  
                    temp.peso=o[j-1].peso;
                    o[j-1].peso=o[j].peso;
                    o[j].peso=temp.peso;
                    temp.valor=o[j-1].valor;
                    o[j-1].valor=o[j].valor;
                    o[j].valor=temp.valor;
                    temp.valorPeso=o[j-1].valorPeso;
                    o[j-1].valorPeso=o[j].valorPeso;
                    o[j].valorPeso=temp.valorPeso;                   
                }
            }
        }
    }
    
    public static void main(String[] args) {
        MochilaFraccionaria mochila=new MochilaFraccionaria();
        Objetos o1=new Objetos("Hierro",30,20);
        Objetos o2=new Objetos("Zinc",55,50);
        Objetos o3=new Objetos("Carbon",40,40);
        Objetos o4=new Objetos("Oro",65,30);
        Objetos o5=new Objetos("Plata",20,10);
        Objetos[] objetos={o1,o2,o3,o4,o5};
        double[] sol={0,0,0,0,0};
        mochila.Voraz(objetos, sol, 100);
        for(int i=0;i<objetos.length;i++){
            System.out.print(objetos[i].valorPeso);
            System.out.print("--"+objetos[i].nombre+"\n");
        }
        System.out.println(Arrays.toString(sol));
    }
    
}
