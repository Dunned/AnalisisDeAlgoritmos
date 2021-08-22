
public class Objetos {
    String nombre;
    double valor;
    double peso;
    double valorPeso;
    public Objetos(String nombre,double valor, double peso) {
        this.nombre=nombre;
        this.valor = valor;
        this.peso = peso;
        this.valorPeso=valor/peso;
    }
    
    
}
