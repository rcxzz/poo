enum Naipe{
    COPAS, OURO, ESPADA, PAUS
}

enum Valor{
    AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI
}

public class Carta{
    private Naipe naipe;
    private Valor valor;

    public Carta(Naipe naipe, Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return valor + " de " + naipe;
    }
}