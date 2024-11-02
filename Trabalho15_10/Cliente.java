import java.util.ArrayList;
import java.util.List;

// Classe que representa um cliente da biblioteca
public class Cliente {
    private String nome; // Nome do cliente
    private List<Emprestimo> emprestimos; // Lista de empréstimos do cliente

    // Construtor da classe Cliente
    public Cliente(String nome) {
        this.nome = nome; // Inicializa o nome do cliente
        this.emprestimos = new ArrayList<>(); // Inicializa a lista de empréstimos
    }

    // Método getter para acessar o nome do cliente
    public String getNome() {
        return nome;
    }

    // Método para adicionar um empréstimo à lista do cliente
    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo); // Adiciona o empréstimo à lista
    }

    // Método getter para acessar a lista de empréstimos
    public List<Emprestimo> getEmprestimos() {
        return emprestimos; // Retorna a lista de empréstimos
    }
}