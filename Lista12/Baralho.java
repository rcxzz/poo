public class Baralho{
    private Carta[] cartas;
    private int tamanho;

    public Baralho(){
        cartas=new Carta[52];
        tamanho=0;
        for(Naipe naipe : Naipe.values()){
            for(Valor valor : Valor.values()){
                cartas[tamanho++]=new Carta(naipe, valor);
            }
        }
    }

    public void embaralhar(){
        int tamanho=cartas.length;
        for(int i=tamanho-1;i>0;i--){
            int j=(int)(Math.random()*(i+1));
            Carta temp=cartas[i];
            cartas[i]=cartas[j];
            cartas[j]=temp;
        }
    }

    public Carta comprar(){
        return cartas[--tamanho];
    }

    public int cartasRestantes(){
        return tamanho;
    }
}
