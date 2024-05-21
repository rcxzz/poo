public class Carro {
    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;
    private Banco banco;

     // Construtor que inicializa as variáveis marca, modelo, fabricante, motor e banco
    Carro(String marca, String modelo, String fabricante, Motor motor, Banco banco){
        this.marca=marca;
        this.modelo=modelo;
        this.fabricante=fabricante;
        this.motor=motor;
        this.banco=banco;
    }
    // Método que sobrescreve o método toString() da classe Object e retorna uma String com as informações do carro
    @Override
    public String toString(){
        return "Carro Marca: " + marca + "\n Modelo: " + modelo + "\n Fabricante: " + fabricante + "\n Motor: " + motor.getTipo() + "\n Bancos: " + banco.getFabricante();
    }
    // Método que retorna o fabricante do banco do carro
    public String getFabriBanco(){
        return banco.getFabricante();
    }
    // Método que retorna o tipo do motor do carro
    public String getTipoMotor(){
        return motor.getTipo();
    }
}
