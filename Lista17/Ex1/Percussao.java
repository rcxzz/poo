public class Percussao implements Instrumento{

    @Override
    public void nome() {
        System.out.println("Percussão");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando instrumento Percussão.");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento Percussão");
    }

}
