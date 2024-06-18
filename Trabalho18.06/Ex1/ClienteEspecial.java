public class ClienteEspecial extends ContaCorrente{
    private double taxaEspecial;

    public double sacar(double saque){
        this.saque=saque;
        saldo=saldo-saque-(saque*0.001);
        return saque;
    }

    public double getTaxaEspecial(){
        taxaEspecial=saque*0.001;
        return taxaEspecial;
    }    
    
}