import java.time.LocalDate; // Importa a classe LocalDate para manipulação de datas

public class Emprestimo {
    private Cliente cliente; // Cliente que fez o empréstimo
    private Livro livro; // Livro que foi emprestado
    private LocalDate dataEmprestimo; // Data do empréstimo
    private LocalDate dataDevolucao; // Data de devolução
    private StatusEmprestimo status; // Status do empréstimo

      // Construtor da classe Emprestimo
    public Emprestimo(Cliente cliente, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.cliente = cliente; // Inicializa o cliente que fez o empréstimo
        this.livro = livro; // Inicializa o livro que foi emprestado
        this.dataEmprestimo = dataEmprestimo; // Inicializa a data do empréstimo
        this.dataDevolucao = dataDevolucao; // Inicializa a data de devolução
        this.status = StatusEmprestimo.EM_ANDAMENTO; // Define o status inicial como "EM_ANDAMENTO"
    }

    // Método para devolver o livro
    public void devolver() throws PrazoDevolucaoExcedidoException {
        // Verifica se a data atual é após a data de devolução
        if (LocalDate.now().isAfter(dataDevolucao)) {
            status = StatusEmprestimo.ATRASADO; // Atualiza o status para "ATRASADO"
            throw new PrazoDevolucaoExcedidoException("Devolução fora do prazo."); // Lança exceção se devolução estiver atrasada
        }
        status = StatusEmprestimo.DEVOLVIDO; // Atualiza o status para "DEVOLVIDO"
    }

    // Método getter para acessar o status do empréstimo
    public StatusEmprestimo getStatus() {
        return status; // Retorna o status do empréstimo
    }
}