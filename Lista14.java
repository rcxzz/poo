/* Exercício 13 */
public class Lista14{
    public static void main (String[] args) {
        int num;
        try{
            num=Integer.parseInt(args[0]);
            if((num%2)==0)
                System.out.println("Número par");
            else
                System.out.println("Número impar");
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("ERRO - Indice inexistente.");
        }catch(NumberFormatException exc){
            System.out.println("ERRO - Não é um número valido.");
        }
    }
}

/*
1- Sim, você pode utilizar dois blocos "catch" aninhados.

2- Sim, um "catch" de uma exceção também captura subclasses das superclasses.

3- Uma exceção gerada dentro do bloco "try" interno que não for capturada por um "catch" associado a esse "try" será
propagada para o bloco "try" externo.

4- Sim, utilizando o "throw" dentro da cláusula "catch".

5- A instrução "throw" serve permite que uma exceção seja lançada manualmente.

6- Sim, objetos que são instâncias de classes que herdam da classe 'Throwable' ou de suas subclasses.  

7- Pode, utilizando o "throw" dentro da cláusula "catch" você lança uma exceção para ser tratada em outro "catch".

8- Caso a(), serão executadas as linhas 4 e 5. Caso b(), serão executadas as linhas 10 e 11. 
Isso ocorre porque o bloco "catch" é executado quando uma exceção é lançada no bloco "try" correspondente, 
sendo assim caso ocorra uma exceção no método a(), o método b() não será executado, e caso ocorra uma exceção no método b(), 
o método a() já terá sido executado e não será afetado.

9- Neste caso, as linhas 5 e 6 serão executadas e o método b() não será executado.

10- Não, o bloco finally é usado para executar um código que deve ser executado sempre, independentemente do resultado do bloco try.

11- As subclasses diretas do "Throwable" são o 'Exception' e o 'Error'.

12- Não, as exceções de tipo 'Error' são usadas para representar erros graves que não podem ser tratados pelo programa, 
como falta de memória ou erros de sistema. Esses erros são geralmente causados por problemas no ambiente de execução 
ou no próprio sistema, e não são resultado de erros de programação.
*/