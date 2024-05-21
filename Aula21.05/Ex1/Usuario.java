public class Usuario {
    private String nome;
    private int matricula;
    private Dispositivo dispositivo;
    
    Usuario(int matricula, String nome){ // Construtor que inicializa as propriedades nome e matricula
        this.matricula=matricula;
        this.nome=nome;
    }

    public void setDispositivo(Dispositivo dispositivo){ // Método que define o dispositivo do usuário
        this.dispositivo=dispositivo;
    }

    public void trabalhar(){ // Método que usa o dispositivo do usuário
        dispositivo.usar(nome);
    }
}

