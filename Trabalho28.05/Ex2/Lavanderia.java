public class Lavanderia{
    private LavaRoupa lavaRoupa;
    private Ferro ferro;
    private Secadora secadora;

    public Lavanderia(){// Cria novas instâncias dos eletrodomésticos
        this.lavaRoupa=new LavaRoupa();
        this.ferro=new Ferro();
        this.secadora=new Secadora();
    }

    //Metodos get e set para acessar e modificar estas instancias
    public LavaRoupa getLavaRoupa(){
        return this.lavaRoupa;
    }
    public void setLavaRoupa(LavaRoupa lavaRoupa){
        this.lavaRoupa=lavaRoupa;
    }

    public Ferro getFerro(){
        return this.ferro;
    }
    public void setFerro(Ferro ferro){
        this.ferro=ferro;
    }
    public Secadora getSecadora(){
        return this.secadora;
    }
    public void setSecadora(Secadora secadora){
        this.secadora=secadora;
    }
    public void ligar(){ //Liga os eletrodomesticos
        this.lavaRoupa.ligar();
        this.ferro.ligar();
        this.secadora.ligar();
    }
    public void desligar(){ //Desliga os eletrodomesticos
        this.lavaRoupa.desligar();
        this.ferro.desligar();
        this.secadora.desligar();
    }
}
