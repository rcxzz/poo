// Classe abstrata que representa um livro
public abstract class Livro {
    private String titulo; // Título do livro
    private String autor;  // Autor do livro
    private String categoria; // Categoria do livro

    // Construtor da classe Livro
    public Livro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    // Métodos getters para acessar os atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract boolean podeEmprestar();
}
