public class Carro extends Veiculo{
    private int ano;

    public Carro(String modelo, double preco, int ano){
        super(modelo, preco);
        this.ano=ano;
    }

    public void setAno(int ano){
        this.ano=ano;
    }

    public void imprimirDados(){
        super.imprimirDados();
        System.out.println("Ano: " + ano + "\n");
    }
}