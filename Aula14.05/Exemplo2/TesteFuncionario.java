public class TesteFuncionario{
    public static void main(String[] args) {
        System.out.println("Funcionario antes da instanciacao: " + Funcionario.getContador());

        Funcionario e1=new Funcionario("Joao", " Silva");
        Funcionario e2=new Funcionario("Ana", " Lopes");

        System.out.println("\nFuncionarios depois da instanciacao: ");
        System.out.println("por meio de e1.getContador(): " + e1.getContador());
        System.out.println("\npor meio de e2.getContador(): " + e2.getContador());
        System.out.println("\npor meio de Funcionario.getContador(): " + Funcionario.getContador());

        System.out.println("Funcionario 1: " + e1.getPrimeiroNome() + e1.getUltimoNome() + "\nFuncionario 2: " + e2.getPrimeiroNome() + e2.getUltimoNome());
    }
}
