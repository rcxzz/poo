public class Teste{
    public static void main(String[] args) {
        Cliente cliente1=new Cliente("Marcio", "099.189.144-29");
        Cliente cliente2=new Cliente("Marcelo", "142.999.322-76");

        Carro carro1=new Carro("Kadett", 20000.00, 1995);
        Carro carro2=new Carro("Civic SI", 90000.00, 2009);
        Moto moto1=new Moto("Pop-100", 12000.00, 3000.00);
        Moto moto2= new Moto("CBR 1000RR-R", 198500.00, 0.00);

        Pedido pedido1=new Pedido(1, cliente1, moto1);
        Pedido pedido2=new Pedido(2, cliente2, carro1);
        Pedido pedido3=new Pedido(3, cliente1, carro2);
        Pedido pedido4=new Pedido(4, cliente2, moto2);

        pedido1.imprimirDados();
        pedido2.imprimirDados();
        pedido3.imprimirDados();
        pedido4.imprimirDados();
    }
}