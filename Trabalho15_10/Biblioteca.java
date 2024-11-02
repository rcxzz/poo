import java.util.ArrayList;
import java.util.List;

// Classe que representa a biblioteca
public class Biblioteca {
    private List<Livro> livros; // Lista de livros disponíveis na biblioteca
    private List<Cliente> clientes; // Lista de clientes cadastrados na biblioteca

    // Construtor da classe Biblioteca
    public Biblioteca() {
        this.livros = new ArrayList<>(); // Inicializa a lista de livros
        this.clientes = new ArrayList<>(); // Inicializa a lista de clientes
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro); // Adiciona o livro à lista de livros
    }

    // Método para adicionar um cliente à biblioteca
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente); // Adiciona o cliente à lista de clientes
    }

    // Método getter para acessar a lista de livros
    public List<Livro> getLivros() {
        return livros; // Retorna a lista de livros
    }

    // Método getter para acessar a lista de clientes
    public List<Cliente> getClientes() {
        return clientes; // Retorna a lista de clientes
    }

    // Método para buscar um livro pelo título
    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            // Compara o título do livro com o título buscado (ignora maiúsculas/minúsculas)
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro; // Retorna o livro se encontrado
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }
}
