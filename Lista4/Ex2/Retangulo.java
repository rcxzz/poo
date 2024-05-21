public class Retangulo {
    private double comprimento;
    private double largura;

    // Construtor sem parâmetros
    public Retangulo(){
        this.comprimento=1;
        this.largura=1;
    }

    // Construtor com dois parâmetros
    public Retangulo(double comprimento, double largura){
        this.comprimento=comprimento;
        this.largura=largura;
    }

    // Métodos para calcular perímetro e área
    public double calcularPerimetro(){
        return 2*(comprimento + largura);
    }

    public double calcularArea(){
        return comprimento*largura;
    }

    // Métodos para imprimir perímetro e área
    public void imprimirPerimetro(){
        System.out.println("Perímetro: " + calcularPerimetro());
    }

    public void imprimirArea(){
        System.out.println("Área: " + calcularArea());
    }

    // Métodos acessadores e modificadores
    public double getComprimento(){
        return comprimento;
    }

    public void setComprimento(double comprimento){
        this.comprimento=comprimento;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura=largura;
    }
}