public class Microondas{
    private boolean ligado;

    public Microondas(){// Inicia a variável ligado com o valor false
        this.ligado=false;
    }
    public void ligar(){// Define a variável ligado como true
        this.ligado=true;
    }
    public void desligar(){ //Define a variável ligado como false
        this.ligado=false;
    }
    public boolean isLigado(){// Retorna o valor da variável ligado
        return this.ligado;
    }
    public String observar(){// Verifica o estado da variável ligado e retorna se esta ligado ou desligado
        if(this.isLigado()){
            return "Microondas ligado";
        }else{
            return "Microondas desligado";
        }
    }
}   
