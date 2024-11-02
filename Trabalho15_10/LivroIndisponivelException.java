// Exceção personalizada para indicar que um livro está indisponível para empréstimo
public class LivroIndisponivelException extends Exception {
    public LivroIndisponivelException(String mensagem) {
        super(mensagem); // Chama o construtor da classe pai com a mensagem
    }
}
