import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criação da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Criação de livros
        LivroFisico livro1 = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", 1); // Apenas 1 exemplar
        Ebook ebook1 = new Ebook("1984", "George Orwell", "Ficção");

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(ebook1);

        // Criação de clientes
        Cliente cliente1 = new Cliente("Alice");
        Cliente cliente2 = new Cliente("Bob");

        // Adicionando clientes à biblioteca
        biblioteca.adicionarCliente(cliente1);
        biblioteca.adicionarCliente(cliente2);

        // Variável para armazenar o empréstimo
        Emprestimo emprestimo1 = null;

        // Realizando um empréstimo
        try {
            // Cliente 1 empresta um livro físico
            livro1.emprestar(); // Decrementa o número de exemplares disponíveis
            emprestimo1 = new Emprestimo(cliente1, livro1, LocalDate.now(), LocalDate.now().plusDays(7));
            cliente1.adicionarEmprestimo(emprestimo1); // Adiciona o empréstimo ao cliente

            // Cliente 2 tenta emprestar o mesmo livro físico
            livro1.emprestar(); // Isso deve lançar a exceção
            Emprestimo emprestimo2 = new Emprestimo(cliente2, livro1, LocalDate.now(), LocalDate.now().plusDays(7));
            cliente2.adicionarEmprestimo(emprestimo2); // Adiciona o empréstimo ao cliente

            System.out.println("Empréstimos realizados com sucesso!");

        } catch(LivroIndisponivelException e) {
            System.out.println(e.getMessage()); // Exibe mensagem de erro se o livro estiver indisponível
        }

        // Tentando devolver um livro
        if (emprestimo1 != null) { // Verifica se o empréstimo foi realizado
            try {
                // Cliente 1 devolve o livro
                emprestimo1.devolver(); // Tenta devolver o livro
                livro1.devolver(); // Incrementa o número de exemplares disponíveis
                System.out.println("Livro devolvido com sucesso!");

            } catch(PrazoDevolucaoExcedidoException e) {
                System.out.println(e.getMessage()); // Exibe mensagem de erro se a devolução estiver atrasada
            }
        }

        // Exibindo status dos empréstimos
        for(Emprestimo emprestimo : cliente1.getEmprestimos()) {
            System.out.println("Cliente: " + cliente1.getNome() + ", Status do Empréstimo: " + emprestimo.getStatus());
        }

        for(Emprestimo emprestimo : cliente2.getEmprestimos()) {
            System.out.println("Cliente: " + cliente2.getNome() + ", Status do Empréstimo: " + emprestimo.getStatus());
        }
    }
}