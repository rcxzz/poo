public class Motor {
    private String tipo;

    Motor(String tipo){ // Construtor que inicializa o tipo do motor
        this.tipo=tipo;
    }
    public String getTipo(){ // Método que retorna o tipo do motor
        return tipo;
    }
}
