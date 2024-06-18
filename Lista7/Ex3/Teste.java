public class Teste{
    public static void main(String[] args){
        Notebook n1 = new Notebook();
    }
}

/* O que é impresso: 

   Computador()
   Notebook()   
   Codigo: 12345 

   "Computador()" é impresso pois, implicitamente, ele é chamado na classe Notebook quando usamos "extends Computador".
   "Notebook()" é impresso pois ele esta na propia classe Notebook.
   "Codigo: 12345" é impresso pelo metodo ligar().

   Todos eles sao parte da classe Notebook, como no main temos uma instancia de Notebook -> n1. Todos construtores ou metodos ligados a classe Notebook serao impressos.
*/