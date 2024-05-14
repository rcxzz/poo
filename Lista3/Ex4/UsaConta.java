import java.util.Scanner;
public class UsaConta {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Conta conta1=new Conta(1000.00);
        Conta conta2=new Conta(150.00);
        System.out.printf("Saldo da Conta1: R$ " + conta1.getSaldo() + "\n");
        System.out.printf("Saldo da Conta2: R$ " + conta2.getSaldo() + "\n");
        System.out.print("Digite o valor de retirada da conta1: ");
        double qtdeRetirada1=scanner.nextDouble();
        System.out.printf("Subtraindo " + qtdeRetirada1 + " do saldo da conta1. \n");
        conta1.debitar(qtdeRetirada1);
        System.out.printf("Saldo da Conta1: R$  " + conta1.getSaldo() + "\n");
        System.out.printf("Saldo da Conta2: R$  " + conta2.getSaldo() + "\n");
        System.out.print("Digite o valor de retirada da conta2: ");
        double qtdeRetirada2=scanner.nextDouble();
        System.out.printf("Subtraindo " + qtdeRetirada2 + " do saldo da conta2. \n\n");
        conta2.debitar(qtdeRetirada2);
        System.out.printf("Saldo da Conta1: R$ " + conta1.getSaldo() + "\n");
        System.out.printf("Saldo da Conta2: R$ " + conta2.getSaldo());
    }
}