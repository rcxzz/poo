public class Exercicio3part2 {
    public static void main(String[] args){
        Cliente[] clientes=new Cliente[2];
        clientes[0]=new ClienteEspecial();
        clientes[1]=new Cliente();
        System.out.println("Valor apos desconto do Cliente Especial: " + clientes[0].calcularDesconto(1000));
        System.out.println("Valor apos desconto do Cliente Normal: " + clientes[1].calcularDesconto(1000));
    }
}