public class Pedido{
    private int numero;
    private Cliente cliente;
    private Veiculo veiculo;

    public Pedido(int numero, Cliente cliente, Veiculo veiculo){
        this.numero=numero;
        this.cliente=cliente;
        this.veiculo=veiculo;
    }

    public void imprimirDados(){
        System.out.println("Número do pedido: " + numero);
        System.out.println("=====CLIENTE===== ");
        cliente.imprimirDados();
        System.out.println("=====VEICULO===== ");
        veiculo.imprimirDados();
    }
}