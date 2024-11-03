public abstract class Livro {
    private String titulo;
    private String autor;
    private String categoria; 

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
