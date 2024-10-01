public class Quadrado implements ObjetoGeometrico{
    private double lado;

    
    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return 4*lado;
    }

    @Override
    public String toString() {
        return "Quadrado de lado = " + lado;
    }

}