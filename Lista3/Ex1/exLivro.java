public class exLivro{
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        livro1.setTitulo("A volta dos que não foram.");
        livro1.setAutor("Connor McGregor");
        livro1.exibeMensagem();
        livro2.setTitulo("Harry Potter");
        livro2.setAutor("J.K. Rowling");
        livro2.exibeMensagem();
    }
}
