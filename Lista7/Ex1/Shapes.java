public class Shapes{
    public static void main(String[] args){
        Triangulo t1=new Triangulo();
        Triangulo t2=new Triangulo();
        Retangulo r1=new Retangulo();
        Retangulo r2=new Retangulo();

        t1.setLargura(4.0);
        t1.setAltura(4.0);
        t1.estilo="cheio";

        t2.setLargura(8.0);
        t2.setAltura (12.0);
        t2.estilo="contorno";

        r1.setLargura(4.0);
        r1.setAltura(4.0);

        r2.setLargura(8.0);
        r2.setAltura(12.0);

        System.out.println("Info para t1: ");
        t1.mostraEstilo();
        t1.mostraDim();
        System.out.println("Area = " + t1.area());

        System.out.println();
        
        System.out.println("Info para t2: ");
        t2.mostraEstilo();
        t2.mostraDim();
        System.out.println("Area = " + t2.area());

        System.out.println();

        System.out.println("Info para r1: ");
        r1.mostraDim();
        System.out.println("Area = " + r1.area());
        System.out.println("E quadrado: " + r1.verificarQuadrado());

        System.out.println();

        System.out.println("Info para r2: ");
        r2.mostraDim();
        System.out.println("Area = " + r2.area());
        System.out.println("E quadrado: " + r2.verificarQuadrado());
    }
}       

/*a) O erro ocorre na classe Triangulo pois o atributo estilo esta como private. Alterando para protected,
é possivel que as outras classes acessem este atributo.
*/

//c) Caso os atributos largura e altura sejam alterados para private vai ocorrer um erro indicando a impossibilidade de acesso desses atributos.

