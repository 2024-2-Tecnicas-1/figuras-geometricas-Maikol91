public class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        return lado1 * lado2;
    }

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }

    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}

