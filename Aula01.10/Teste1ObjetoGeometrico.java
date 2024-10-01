public class Teste1ObjetoGeometrico{
    public static void main(String[] args) {
        Circulo c1=new Circulo(4);
        Circulo c2=new Circulo(2);
        Quadrado q1=new Quadrado(5);
        Quadrado q2=new Quadrado(10);

        exibeTodososDados(c1);
        exibeTodososDados(c2);
        exibeTodososDados(q1);
        exibeTodososDados(q2);
    }
    public static void exibeTodososDados(ObjetoGeometrico og){
        System.out.println(og);
        System.out.println("Perímetro = " + og.getPerimetro());
        System.out.println("Área = " = og.getArea());
        System.out.println();
    }
}
