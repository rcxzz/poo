/*Se todos os objetos de uma classe tiverem que compartilhar a mesma variável, essa variável deve ser declarada como um atributo estático da classe.
Um atributo estático é um atributo que pertence a classe em vez de pertencer a um objeto específico da classe.
Isso significa que a variável será compartilhada por todos os objetos da classe e terá apenas um único valor para todos eles.
A declaração de um atributo estático é feita adicionando a palavra-chave static antes do tipo do atributo, como mostrado no exemplo a seguir:*/

public class Classe{
    private static int x;

    public Classe(){
        x++;
    }

    public static int getX(){
        return x;
    }
}