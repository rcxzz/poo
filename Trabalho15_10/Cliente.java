import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome; 
    private List<Emprestimo> emprestimos; // Lista de empréstimos do cliente

    // Construtor da classe Cliente
    public Cliente(String nome) {
        this.nome = nome;
        this.emprestimos = new ArrayList<>();
    }

    // Método getter para acessar o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método para adicionar um empréstimo à lista do cliente
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    // Método getter para acessar a lista de empréstimos
    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
