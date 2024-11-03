import java.time.LocalDate; // Importa a classe LocalDate para manipulação de datas

public class Emprestimo {
    private Cliente cliente; 
    private Livro livro; 
    private LocalDate dataEmprestimo; 
    private LocalDate dataDevolucao; 
    private StatusEmprestimo status;

      // Construtor da classe Emprestimo
    public Emprestimo(Cliente cliente, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.cliente = cliente; 
        this.livro = livro; 
        this.dataEmprestimo = dataEmprestimo; 
        this.dataDevolucao = dataDevolucao;
        this.status = StatusEmprestimo.EM_ANDAMENTO; 
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
        return status;
    }
}
