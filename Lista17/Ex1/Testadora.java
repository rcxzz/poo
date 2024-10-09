public class Testadora {
    public static void main(String[] args) {
        Instrumento[] instrumentos=new Instrumento[5];
        instrumentos[0]=new Sopro();
        instrumentos[1]=new Corda();
        instrumentos[2]=new Percussao();
        instrumentos[3]=new SoproMetal();
        instrumentos[4]=new SoproMadeira();

        sinfonia(instrumentos);
    }

    public static void sinfonia(Instrumento[] instrumentos) {
        for (Instrumento instrumento : instrumentos){
            instrumento.nome();
            instrumento.tocar();
            instrumento.afinar();
            System.out.println();
        }
    }
}
