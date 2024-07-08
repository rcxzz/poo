public class Exercicio2part2 {
    public static void main(String[] args){
        Figura[] geo=new Figura[2];
        geo[0]=new Quadrado();
        geo[1]=new Circulo();
        System.out.println("Area da Figura 1 (Quadrado): " + geo[0].area(4));
        System.out.println("Area da Figura 2 (Circulo): " + geo[1].area(3));
    }
}