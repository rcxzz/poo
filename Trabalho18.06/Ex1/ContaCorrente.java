public class ContaCorrente{
    private double deposito;
    protected double saque;
    protected double saldo;
    private double taxa;

    public double depositar(double deposito){
        this.deposito=deposito;
        saldo=saldo+deposito;
        return deposito;
    }

    public double sacar(double saque){
        this.saque=saque;
        saldo=saldo-saque-(saque*0.005);
        return saque;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getTaxa(){
        taxa=saque*0.005;
        return taxa;
    }
    
}