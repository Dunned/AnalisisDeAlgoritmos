
public class SeleccionActividades {

    public void seleccionActividades(Actividad[] c, Actividad s[]) {
        OrdenBurbuja(c);
        s[0] = c[0];
        int i = 0;
        int prev = 0;
        int n = c.length;
        while (i < n) { //Solucion?
            Actividad x = c[i]; //Seleccionamos una actividad
            if (x.inicio >= s[prev].fin) { //Factible - no se sobrepone
                s[prev + 1] = x; //añadimos la actividad
                prev++;
            }
            i++;
        }
    }

    private void OrdenBurbuja(Actividad[] o) {
        Actividad temp = new Actividad("", 0, 0);
        //Numero de vueltas
        for (int i = 1; i < o.length; i++) {
            //Compararamos el elemento del final 
            for (int j = o.length - 1; j >= i; j--) {
                if (o[j - 1].fin > o[j].fin) {
                    temp.id = o[j - 1].id;
                    o[j - 1].id = o[j].id;
                    o[j].id = temp.id;
                    temp.inicio = o[j - 1].inicio;
                    o[j - 1].inicio = o[j].inicio;
                    o[j].inicio = temp.inicio;
                    temp.fin = o[j - 1].fin;
                    o[j - 1].fin = o[j].fin;
                    o[j].fin = temp.fin;
                }
            }
        }
    }

    public static void main(String[] args) {
        Actividad a = new Actividad("A", 8, 14);
        Actividad b = new Actividad("B", 9, 12);
        Actividad c = new Actividad("C", 11, 13);
        Actividad d = new Actividad("D", 11, 16);
        Actividad e = new Actividad("E", 12, 15);
        Actividad f = new Actividad("F", 13, 17);
        Actividad g = new Actividad("G", 14, 18);
        Actividad h = new Actividad("H", 16, 19);
        Actividad[] actividades = {a, b, c, d, e, f, g, h};
        Actividad[] solucion = new Actividad[actividades.length];
        for (int i = 0; i < solucion.length; i++) {
            Actividad tmp = new Actividad("", 0, 0);
            solucion[i] = tmp;
        }
        SeleccionActividades seleccionActividades = new SeleccionActividades();
        seleccionActividades.seleccionActividades(actividades, solucion);
        for (int i = 0; i < solucion.length; i++) {
            System.out.println(solucion[i].id);
        }
    }
}
