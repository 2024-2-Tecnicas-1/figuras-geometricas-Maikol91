public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public double obtenerArea() {
        return (base * altura) / 2;
    }

    /**
     * Complejidad temporal: O(1) Tiempo constante.
     */
    
    public double obtenerPerimetro() {
        // Asumimos que es un triángulo rectángulo para poder simplificar
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

