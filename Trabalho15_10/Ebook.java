// Classe que representa um eBook, que herda da classe Livro
public class Ebook extends Livro implements Emprestavel {
    // Construtor da classe Ebook
    public Ebook(String titulo, String autor, String categoria) {
        super(titulo, autor, categoria); // Chama o construtor da classe pai
    }

    // Implementação do método podeEmprestar
    @Override
    public boolean podeEmprestar() {
        return true; // Ebooks podem ser emprestados a qualquer momento
    }

    // Método para emprestar o eBook (sem implementação específica)
    @Override
    public void emprestar() {
        // Não há controle de exemplares para Ebooks
    }
}
