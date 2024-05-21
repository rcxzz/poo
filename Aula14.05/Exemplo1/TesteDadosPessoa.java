public class TesteDadosPessoa{
    public static void main(String[] args) {
        DadosPessoa pessoa1=new DadosPessoa(1, "Audrey");

        System.out.println("Codigo: " + pessoa1.getCodigo());
        System.out.println(" Nome: " + pessoa1.getNome());

        DadosPessoa pessoa2=new DadosPessoa(2);

        System.out.println("\nCodigo: " + pessoa2.getCodigo());
        System.out.println(" Nome: " + pessoa2.getNome());
    }
}
