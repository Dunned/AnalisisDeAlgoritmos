package codigo;

import java.util.HashMap;

public class Grafo {

    HashMap<Character, HashMap<Character, Integer>> Grafo;
    public char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G','H'};

    public Grafo() {
        Grafo = new HashMap<Character, HashMap<Character, Integer>>();
        HashMap<Character, Integer> aux = new HashMap<>(); //Para guardar Relaciones
        aux = new HashMap<>();
        //Vertice a
        aux.put('B', 4);
        aux.put('C', 2);
        crearVertice('A', aux);
        //Vertice b
        aux = new HashMap<>();
        aux.put('F', 4);
        aux.put('C', 6);
        crearVertice('B', aux);
        //Vertice c
        aux = new HashMap<>();
        //aux.put('F', 5);
        aux.put('D', 3);
        crearVertice('C', aux);
        //Vertice d
        aux = new HashMap<>();
        //aux.put('C', 3);
        aux.put('A', 3);
        aux.put('E', 5);
        aux.put('G', 4);
        crearVertice('D', aux);
        //Vertice e
        aux = new HashMap<>();
        aux.put('F', 3);
        crearVertice('E', aux);
        //Vertice f
        aux = new HashMap<>();
        aux.put('B', 4);
        aux.put('G', 3);
        crearVertice('F', aux);
        //Vertice g
        aux = new HashMap<>();
        aux.put('E', 6);
        crearVertice('G', aux);
        //Vertice h
        aux = new HashMap<>();
        aux.put('E', 2);
        crearVertice('H', aux);
    }

    public void crearVertice(char vertice, HashMap<Character, Integer> relacion) {
        Grafo.put(vertice, relacion);
    }

    public HashMap<Character, Integer> getVertice(char vertice) {
        return Grafo.get(vertice);
    }

    public char ultimoVertice() {
        return vertices[vertices.length - 1];
    }

    public int tamanio() {
        return vertices.length;
    }

    public int[][] matrizAdyacencia() {
        char ultimo = vertices[vertices.length - 1];
        int[][] matriz = new int[vertices.length][vertices.length];
        int f = 0;
        int c = 0;
        for (char i = vertices[0]; i <= ultimo; i++) {
            c = 0;
            HashMap<Character, Integer> vertice = getVertice(i);
            for (char j = vertices[0]; j <= ultimo; j++) {
                try {
                    if (f == c) {
                        matriz[f][c] = 0;
                        c++;
                        continue;
                    }
                    int a = 0;
                    a = vertice.get(j);
                    matriz[f][c] = a;
                    c++;
                } catch (Exception e) {
                    if (i == j) {
                        matriz[f][c] = 0;
                    }
                    matriz[f][c] = 9999;
                    c++;
                }
            }
            f++;
        }
        return matriz;
    }
}
