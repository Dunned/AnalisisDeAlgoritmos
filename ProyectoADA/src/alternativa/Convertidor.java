package alternativa;

public class Convertidor {

    public static final int infinito = 999;;

    public static int letraANumero(String letra) {
        int numero = 0;
        switch (letra) {
            case "A":
                numero = 0;
                break;
            case "B":
                numero = 1;
                break;
            case "C":
                numero = 2;
                break;
            case "D":
                numero = 3;
                break;
            case "E":
                numero = 4;
                break;
        }
        return numero;
    }

    public static String numeroALetra(int numero) {
        String letra = "";
        switch (numero) {
            case 0:
                letra = "A";
                break;
            case 1:
                letra = "B";
                break;
            case 2:
                letra = "C";
                break;
            case 3:
                letra = "D";
                break;
            case 4:
                letra = "E";
                break;
        }
        return letra;
    }
}
