public class TesteCozinha{
    public static void main(String[] args) {
        Cozinha cozinha=new Cozinha(); //Cria uma instância da classe Cozinha
        
        //Obtém as instâncias dos eletrodomésticos da cozinha
        Liquidificador liquidificador=cozinha.getLiquidificador();
        Microondas microondas=cozinha.getMicroondas();
        Geladeira geladeira=cozinha.getGeladeira();

        cozinha.ligar();//Liga todos os eletrodomésticos da cozinha

        //Imprime o estado atual dos eletrodomésticos
        System.out.println(liquidificador.observar());
        System.out.println(microondas.observar());
        System.out.println(geladeira.observar());

        cozinha.desligar();//Desliga todos os eletrodomésticos da cozinha

        //Imprime o estado atual dos eletrodomésticos novamente
        System.out.println(liquidificador.observar());
        System.out.println(microondas.observar());
        System.out.println(geladeira.observar());
    }
}
