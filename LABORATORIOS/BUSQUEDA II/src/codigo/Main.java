/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.Arrays;

/**
 *
 * @author Eduar
 */
public class Main {
    public static void main(String[] args) {
        Empresa empresa=new Empresa();
        empresa.Ordenar();
        int pos=empresa.busquedaIndexada(601);
        if (pos!=-1) {
            System.out.println(empresa.getNombreDelEmpleado(pos));
            System.out.println(empresa.getNumeroDeComparaciones());
        }
        System.out.println(empresa.getNumeroDeComparaciones());
        
    }
}
