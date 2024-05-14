public class UsaFatura {
    public static void main(String[] args) {
        Fatura fatura1=new Fatura("12345", "Teclado", 2, 35.99);
        Fatura fatura2=new Fatura("67890", "Monitor", 1, 199.99);

        System.out.printf("Fatura 1: " + fatura1.getNumero() + fatura1.getDescricao() +  fatura1.getQuantidade() + " a " + fatura1.getPreco() + " = " + fatura1.getQtdeFatura());  
        System.out.printf("Fatura 2: " + fatura2.getNumero() + fatura2.getDescricao() + fatura2.getQuantidade() + " a " + fatura2.getPreco() + " = " + fatura2.getQtdeFatura());   
    }
}