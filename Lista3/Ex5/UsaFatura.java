public class UsaFatura {
    public static void main(String[] args) {
        Fatura fatura1=new Fatura("12345", "Teclado", 2, 35.99);
        Fatura fatura2=new Fatura("67890", "Monitor", 1, 199.99);

        System.out.printf("Fatura 1: " + "\n Numero: " + fatura1.getNumero() + "\n Tipo: " + fatura1.getDescricao() + "\n Quantidade: " + fatura1.getQuantidade() + " a " + fatura1.getPreco() + " = " + fatura1.getQtdeFatura());  
        System.out.printf("\n Fatura 2: " + "\n Numero: " + fatura2.getNumero() + "\n Tipo: " + fatura2.getDescricao() + "\n Quantidade: " + fatura2.getQuantidade() + " a " + fatura2.getPreco() + " = " + fatura2.getQtdeFatura());   
    }
}