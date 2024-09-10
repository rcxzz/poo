/* 1- Todas as classes herdam direta ou indiretamente da classe Exception.

   2- Devem fazer parte da instrução "try".

   3- A instrução "catch" define qual código será executado, dependendo da exceção gerada.
      Apenas o primeiro bloco que refere-se a exceção lançada é executado, os outros blocos "catch" são ignorados.

   4- A JVM lança uma exceção que indica qual o erro presente.

   5- Se o programa estiver utilizando as instruções "try" e "catch" ele irá capturar os dados e irá tratar essa exceção.

   6- A instrução "try" é utilizada para monitorar o bloco de código desejado, a instrução "catch" é para tratar essa exceção e permitir 
      que o usuário insira novamente os dados para uma execução correta do código. A instrução "finally" é sempre executada ocorrendo ou não
      erros dentro do trecho delimitado pela "try".

   7- A instrução "catch" está sendo utilizada sem utilizar uma instrução "try" antes. Não se pode ter um "catch" sem ter um "try".

   8- */

public class Exercicio1{
    public static void main(String[] args){
        int[] vetor=new int[] { 2, 4, 6, 8, 10, 12 };
        for(int i=0; i<12;i++){
            try{
                System.out.println(vetor[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Fim do Vetor!");
                break;
            }
        }
    }
}