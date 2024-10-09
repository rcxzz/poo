public class Corda implements Instrumento {

    @Override
    public void nome() {
        System.out.println("Corda.");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando instrumento corda.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento corda.");
    }
    
}
