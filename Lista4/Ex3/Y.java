/*A classe Y não está correta, pois o atributo cont da classe X é privado e não pode ser acessado diretamente fora da classe. 
Para resolver isso, é necessário utilizar o método acessor (setter) setCont para definir o valor do atributo cont.

A classe Y corrigida ficaria da seguinte forma:*/

public class Y {
    public static void main(String[] args){
        X ob=new X();
        ob.setCont(10);
    }
}
/*Dessa forma, o objeto ob da classe X terá seu atributo cont definido como 10 através do método setCont.*/