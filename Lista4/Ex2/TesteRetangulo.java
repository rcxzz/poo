public class TesteRetangulo {
    public static void main(String[] args){
        // Cria dois objetos, um com cada construtor
        Retangulo retangulo1=new Retangulo();
        Retangulo retangulo2=new Retangulo(3, 4);

        // Imprime perímetro e área dos retângulos
        retangulo1.imprimirPerimetro();
        retangulo1.imprimirArea();

        retangulo2.imprimirPerimetro();
        retangulo2.imprimirArea();
    }
}