public class Cliente{
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}