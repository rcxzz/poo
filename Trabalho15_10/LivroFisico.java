// Classe que representa um livro físico, que herda da classe Livro
public class LivroFisico extends Livro implements Emprestavel {
    private int exemplaresDisponiveis; // Número de exemplares disponíveis

    // Construtor da classe LivroFisico
    public LivroFisico(String titulo, String autor, String categoria, int exemplares) {
        super(titulo, autor, categoria); // Chama o construtor da classe pai
        this.exemplaresDisponiveis = exemplares; // Inicializa o número de exemplares
    }

    // Implementação do método podeEmprestar
    @Override
    public boolean podeEmprestar() {
        return exemplaresDisponiveis > 0; // Retorna true se houver exemplares disponíveis
    }

    // Método para emprestar o livro
    @Override
    public void emprestar() throws LivroIndisponivelException {
        if (exemplaresDisponiveis <= 0) {
            throw new LivroIndisponivelException("Livro indisponível para empréstimo.");
        }
        exemplaresDisponiveis--; // Decrementa o número de exemplares disponíveis
    }

    // Método para devolver o livro
    public void devolver() {
        exemplaresDisponiveis++; // Incrementa o número de exemplares disponíveis
    }
}
    
