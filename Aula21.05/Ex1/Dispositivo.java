public class Dispositivo {
    private int codigo;
    private String nome;

    Dispositivo(int codigo, String nome){ // Construtor que inicializa as propriedades código e nome
        this.codigo=codigo;
        this.nome=nome;
    }

    public void usar(String usuario){ // Método que imprime uma mensagem indicando que um usuário está usando o dispositivo
        System.out.println(usuario + " esta usando o dispositivo " + nome);
    }
}
