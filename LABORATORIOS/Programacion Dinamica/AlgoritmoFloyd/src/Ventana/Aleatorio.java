/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Eduar
 */
public class Aleatorio {
    Random r=new Random();
    char ini,fin;
    int lim=60;
    int limite=530;
    ArrayList<Point> thiss;

    
    public Aleatorio(char fin) {
        ini='A';
        this.fin = fin;
        thiss= new ArrayList<>();
        crearCirculo();
    }
    
    public boolean rango(int distancia,int e){
        boolean salida=false;
        if(thiss.isEmpty()){
            return true;
        }
        else{
            for(Point i: thiss){
                int x=i.x;
                int y=i.y;
                if (((distancia>=x+lim)||(distancia<=x-lim)&& e==1)|| (((distancia>=y+lim)||(distancia<=y-lim))&& e==0) ) {
                    return true;
                }
            }
        }
        return salida;
    }
    
    public void crearCirculo(){
        if (ini>fin) {
            
        }
        else{
            int xx=r.nextInt(limite);
            int y=r.nextInt(limite);
            if (rango(xx, 1)||rango(y, 0)) {
                thiss.add(new Point(xx,y));
                ini++;
            }
            crearCirculo();
        }
    }
    
    public ArrayList<Point> getList(){
        return thiss;
    }
}
