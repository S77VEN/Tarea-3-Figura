public class Rectangulo extends Figura implements Comparable{

    private double base;
    private double altura;
   
    public double calcularLados() {
        return 4;
    }

    public Rectangulo(double pBase, double pAltura){
        base = pBase;
        altura = pAltura;
    }
    
    public double calcularArea() {
        return base * altura;
    }

    public int compareTo(Comparable otro) {
        if(this.calcularArea() == ((Rectangulo)otro).calcularArea())
            if(this.calcularLados() == ((Rectangulo)otro).calcularLados())
                return 0;
            // Como los lados son un valor fijo no tiene sentido poner una condición de else a este if
            // pues siempre se va a retornar 0 si los lados son iguales.
        else if (this.calcularArea() > ((Rectangulo)otro).calcularArea()){
            return 1;
        }
        return -1;
    }
 
}
