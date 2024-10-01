public class Main {
    public static void main(String[] args) {
        Series serie1=new MaisDois();
        Series serie2=new MaisTres();

        System.out.println("Serie MaisDois: \n");
        obtendoDados(serie1);
        serie1.reset();
        System.out.println("Serie MaisDois após reinicializar: \n");
        obtendoDados(serie1);
        serie1.setStart(100);
        System.out.println("Serie MaisDois iniciando com valor 100: \n");
        obtendoDados(serie1);

        System.out.println("Serie MaisTres: \n");
        obtendoDados(serie2);
        serie2.reset();
        System.out.println("Serie MaisTres após reinicializar: \n");
        obtendoDados(serie2);
        serie2.setStart(100);
        System.out.println("Serie MaisTres iniciando com valor 100: \n");
        obtendoDados(serie2);
    }

    public static void obtendoDados(Series sr){
        for(int i=0; i<5; i++){
            System.out.println(sr.getNext());
        }        
        System.out.println();
    }
}
