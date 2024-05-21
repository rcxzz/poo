/*O código escrito está incorreto porque é impossível ter dois métodos com o mesmo nome e mesma assinatura (mesmos parâmetros) em uma mesma classe. 
Isso é chamado de sobrecarga de métodos (método overload) e é permitido apenas se os métodos tiverem assinaturas diferentes, ou seja, 
se os métodos tiverem um número diferente de parâmetros ou se os tipos dos parâmetros forem diferentes.

Portanto, o código a seguir está correto:*/

public class X {
    public int metodo1(int a, int b){
        ...
    }

    public String metodo1(int a, double b) {
        ...
    }
}