public class Cliente {
    
    public double calcularDesconto(double valor){
        double aux, desconto;
        aux=valor*10;
        desconto=aux/100;
        return (valor-desconto);
    }
}