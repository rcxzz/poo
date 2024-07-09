public class Moto extends Veiculo{
    private double km;

    public Moto(String modelo, double preco, double km){
        super(modelo, preco);
        this.km=km;
    }

    public void setKm(double km){
        this.km=km;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("KM: " + km + "\n");
    }
}