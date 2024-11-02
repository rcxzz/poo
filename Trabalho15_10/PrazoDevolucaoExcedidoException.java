// Exceção personalizada para indicar que o prazo de devolução foi excedido
public class PrazoDevolucaoExcedidoException extends Exception {
    public PrazoDevolucaoExcedidoException(String mensagem) {
        super(mensagem); // Chama o construtor da classe pai com a mensagem
    }
}