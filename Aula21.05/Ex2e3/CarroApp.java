public class CarroApp {
    public static void main(String[] args) {
         // Cria um objeto Carro com modelo "Mustang", tipo "Conversivel", fabricante "Ford", motor "m1" e banco "b1"
        Motor m1=new Motor("3.8L V6");
        Banco b1=new Banco("Recaro");
        Carro c1=new Carro("Mustang", "Conversivel", "Ford", m1, b1);
        // Cria um objeto Carro com modelo "Fiesta", tipo "Popular", fabricante "Ford", motor "m2" e banco "b2"
        Motor m2=new Motor("Zetec Rocam 1.0");
        Banco b2=new Banco("Recaro");
        Carro c2=new Carro("Fiesta", "Popular", "Ford", m2, b2);
         // Cria um objeto Carro com modelo "Captiva", tipo "SUV", fabricante "Chevrolet", motor "m3" e banco "b3"
        Motor m3=new Motor("2.4L Ecotec");
        Banco b3=new Banco("Chevrolet");
        Carro c3=new Carro("Captiva", "SUV", "Chevrolet", m3, b3);
        
        // Imprime os objetos c1, c2 e c3
        System.out.println(c1);

        System.out.println(c2);

        System.out.println(c3);
    }
}
