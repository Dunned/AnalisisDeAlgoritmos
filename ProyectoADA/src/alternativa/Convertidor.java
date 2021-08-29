package alternativa;

public class Convertidor {

    public static final int infinito = 999;

    ;

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
            case "F":
                numero = 5;
                break;
            case "G":
                numero = 6;
                break;
            case "H":
                numero = 7;
                break;
            case "I":
                numero = 8;
                break;
            case "J":
                numero = 9;
                break;
            case "K":
                numero = 10;
                break;
            case "L":
                numero = 11;
                break;
            case "M":
                numero = 12;
                break;
            case "N":
                numero = 13;
                break;
            case "O":
                numero = 14;
                break;
            case "P":
                numero = 15;
                break;
            case "Q":
                numero = 16;
                break;
            case "R":
                numero = 17;
                break;
            case "S":
                numero = 18;
                break;
            case "T":
                numero = 19;
                break;
            case "U":
                numero = 20;
                break;
            case "V":
                numero = 21;
                break;
            case "W":
                numero = 22;
                break;
            case "X":
                numero = 23;
                break;
            case "Y":
                numero = 24;
                break;
            case "Z":
                numero = 25;
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
            case 5:
                letra = "F";
                break;
            case 6:
                letra = "G";
                break;
            case 7:
                letra = "H";
                break;
            case 8:
                letra = "I";
                break;
            case 9:
                letra = "J";
                break;
            case 10:
                letra = "K";
                break;
            case 11:
                letra = "L";
                break;
            case 12:
                letra = "M";
                break;
            case 13:
                letra = "N";
                break;
            case 14:
                letra = "O";
                break;
            case 15:
                letra = "P";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "R";
                break;
            case 18:
                letra = "S";
                break;
            case 19:
                letra = "T";
                break;
            case 20:
                letra = "U";
                break;
            case 21:
                letra = "V";
                break;
            case 22:
                letra = "W";
                break;
            case 23:
                letra = "X";
                break;
            case 24:
                letra = "Y";
                break;
            case 25:
                letra = "Z";
                break;
        }
        return letra;
    }
}
