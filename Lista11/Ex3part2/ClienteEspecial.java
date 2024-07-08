public class ClienteEspecial extends Cliente {
    
    @Override
    public double calcularDesconto(double valor){
        double aux, desconto;
        aux=valor*20;
        desconto=aux/100;
        return (valor-desconto);
    }
}