public class TesteLavanderia{
    public static void main(String[] args) {
        Lavanderia lavanderia=new Lavanderia(); //Cria uma instância da classe Lavanderia
        
        //Obtém as instâncias dos eletrodomésticos da lavanderia
        LavaRoupa lavaRoupa=lavanderia.getLavaRoupa();
        Ferro ferro=lavanderia.getFerro();
        Secadora secadora=lavanderia.getSecadora();
        lavanderia.ligar();//Liga todos os eletrodomésticos da lavanderia

        //Imprime o estado atual dos eletrodomésticos
        System.out.println(lavaRoupa.observar());
        System.out.println(ferro.observar());
        System.out.println(secadora.observar());

        lavanderia.desligar();//Desliga todos os eletrodomésticos da lavanderia

        //Imprime o estado atual dos eletrodomésticos novamente
        System.out.println(lavaRoupa.observar());
        System.out.println(ferro.observar());
        System.out.println(secadora.observar());
    }
}
