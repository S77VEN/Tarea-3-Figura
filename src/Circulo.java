import java.lang.Math;

public class Circulo extends Figura implements Comparable{

    private double radio;

    public double calcularLados() {
        return 0;
    }

    public Circulo(double pRadio, double pAltura){
        radio = pRadio;
    }

    public double calcularArea() {
        return (Math.PI)*(Math.pow(radio,2));
    }

    public int compareTo(Comparable otro) {
        if(this.calcularArea() == ((Circulo)otro).calcularArea())
            if(this.calcularLados() == ((Circulo)otro).calcularLados())
                return 0;
            // Como los lados son un valor fijo no tiene sentido poner una condición de else a este if
            // pues siempre se va a retornar 0 si los lados son iguales.
        else if (this.calcularArea() > ((Circulo)otro).calcularArea()){
            return 1;
        }
        return -1;
    }
   
}
