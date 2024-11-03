import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros; // Lista de livros disponíveis na biblioteca
    private List<Cliente> clientes; // Lista de clientes cadastrados na biblioteca

    public Biblioteca() {
        this.livros = new ArrayList<>(); // Inicializa a lista de livros
        this.clientes = new ArrayList<>(); // Inicializa a lista de clientes
    }

    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro); 
    }

    // Método para adicionar um cliente à biblioteca
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente); 
    }

    // Método getter para acessar a lista de livros
    public List<Livro> getLivros() {
        return livros; 
    }

    // Método getter para acessar a lista de clientes
    public List<Cliente> getClientes() {
        return clientes; 
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
