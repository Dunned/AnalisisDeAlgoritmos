public class Mochila01 {

    
    public void Voraz(Objetos[] v,double[] sol, double cap) {
        OrdenBurbuja(v); //Ordenamos el arreglo de objetos en funcion de su valor
        double resto=cap;
        int i=0;
        while (i < v.length &&v [i].peso<=resto) {
            sol[i]=1;
            resto=resto-v[i].peso;
            i++;
        }
    }
    
    public void OrdenBurbuja(Objetos[] o){
        Objetos temp = new Objetos("",0.0,0.0);
        //Numero de vueltas
        for (int i = 1; i< o.length; i++ ){
            //Compararamos el elemento del final 
            for (int j = o.length-1 ; j >= i; j--){
                if(o[j-1].valor <o[j].valor){
                    temp.nombre=o[j-1].nombre;
                    o[j-1].nombre=o[j].nombre;
                    o[j].nombre=temp.nombre;  
                    temp.peso=o[j-1].peso;
                    o[j-1].peso=o[j].peso;
                    o[j].peso=temp.peso;
                    temp.valor=o[j-1].valor;
                    o[j-1].valor=o[j].valor;
                    o[j].valor=temp.valor;                
                }
            }
        }
    }
      
}
