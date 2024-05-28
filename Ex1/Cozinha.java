public class Cozinha{
    private Liquidificador liquidificador;
    private Microondas microondas;
    private Geladeira geladeira;

    public Cozinha(){// Cria novas instâncias dos eletrodomésticos
        this.liquidificador=new Liquidificador();
        this.microondas=new Microondas();
        this.geladeira=new Geladeira();
    }

    //Metodos get e set para acessar e modificar estas instancias
    public Liquidificador getLiquidificador(){
        return this.liquidificador;
    }
    public void setLiquidificador(Liquidificador liquidificador){
        this.liquidificador=liquidificador;
    }

    public Microondas getMicroondas(){
        return this.microondas;
    }
    public void setMicroondas(Microondas microondas){
        this.microondas=microondas;
    }
    public Geladeira getGeladeira(){
        return this.geladeira;
    }
    public void setGeladeira(Geladeira geladeira){
        this.geladeira=geladeira;
    }
    public void ligar(){ //Liga os eletrodomesticos
        this.liquidificador.ligar();
        this.microondas.ligar();
        this.geladeira.ligar();
    }
    public void desligar(){ //Desliga os eletrodomesticos
        this.liquidificador.desligar();
        this.microondas.desligar();
        this.geladeira.desligar();
    }
}

