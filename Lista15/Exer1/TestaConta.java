public class TestaConta{
    public static void main(String[] args){
        Cliente cliente = new Cliente("Eric", "Carlos");
        Conta conta = new Conta(3500, 4000, 6000, cliente);
        try{
            conta.saque(-50000);
            System.out.println("Saque ou deposito realizado com sucesso!");
        } catch(IllegalArgumentException illegalArgumentException){
            System.out.println("Saldo insuficiente!");
        } catch(ValorNegativoException exc){
            System.out.println(exc);
        }
        System.out.println("Dados conta: " + conta.toString());
    }
}