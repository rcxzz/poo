public class Teste{
    public static void main(String[] args){
        ContaCorrente c1=new ContaCorrente();         
        ClienteEspecial x1=new ClienteEspecial();

        System.out.println("====== CONTA CORRENTE ======\n");
        System.out.println("Valor do depósito: R$" + c1.depositar(2500.0));
        System.out.println("Saldo atual: R$" + c1.getSaldo());
        System.out.println("Valor do saque: R$" + c1.sacar(300));
        System.out.println("Valor da taxa de operação: R$" + c1.getTaxa());
        System.out.println("Saldo após o saque: R$" + c1.getSaldo());

        System.out.println("\n\n====== CLIENTE ESPECIAL ======\n");
        System.out.println("Valor do depósito: R$" + x1.depositar(80000.0));
        System.out.println("Saldo atual: R$" + x1.getSaldo());
        System.out.println("Valor do saque: R$" + x1.sacar(15000.0));
        System.out.println("Valor da taxa de operação para cliente especial: R$" + x1.getTaxaEspecial());
        System.out.println("Saldo após o saque: R$" + x1.getSaldo());
    }
}
