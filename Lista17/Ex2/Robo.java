public class Robo implements Falante{

    @Override
    public void falar() {
        System.out.println("Olá, eu sou um Robô");
    }

    @Override
    public String seuIdioma() {
        return "Português";
    }

    public void reboot(){
        System.out.println("Utilizando reboot...");
    }

}
