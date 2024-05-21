public class Funcionario{
    private String primeiroNome;
    private String ultimoNome;
    private static int contador=0;

    public Funcionario(String primeiroNome, String ultimoNome){
        this.primeiroNome=primeiroNome;
        this.ultimoNome=ultimoNome;
        ++contador;
        System.out.println("Construtor funcionario: " + primeiroNome + ultimoNome + " Contador: " + contador);
    }
    
    public String getPrimeiroNome(){
        return primeiroNome;
    }

    public String getUltimoNome(){
        return ultimoNome;
    }

    public static int getContador(){
        return contador;
    }
}
