public class Triangulo extends Figura implements Comparable {

    private double base;
    private double altura;
    
    public double calcularLados() {
        return 3;
    }

    public Triangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }

    public double calcularArea() {
        return (base * altura)/2;
    }

    public int compareTo(Comparable otro) {
        if(this.calcularArea() == ((Triangulo)otro).calcularArea())
            if(this.calcularLados() == ((Triangulo)otro).calcularLados())
                return 0;
            // Como los lados son un valor fijo no tiene sentido poner una condición de else a este if
            // pues siempre se va a retornar 0 si los lados son iguales.
        else if (this.calcularArea() > ((Triangulo)otro).calcularArea()){
            return 1;
        }
        return -1;
    }
   
}
