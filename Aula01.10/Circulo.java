public class Circulo implements ObjetoGeometrico{

    private double raio;

    public Circulo(double raio){
        this.raio=raio;
    }

    @Override
    public double getArea() {
        return Math.PI*raio*raio;
    }

    @Override
    public double getPerimetro() {
        return 2.0*Math.PI*raio;
    }
   
    @Override
    public String toString(){
        return "Circulo com raio = " + raio;
    }
}