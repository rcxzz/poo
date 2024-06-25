public class Ex1{
    public static void main(String[] args){
        String nome="Abrobrinha";
        System.out.println("Número de caracteres:" + nome.length());
        String vogais="aeiouAEIOU";
        int contador=0;
        for (char c:nome.toCharArray()){
          if (vogais.indexOf(c)!=-1){
            contador++;
          }
        }
        System.out.println("Número de vogais: " + contador);
    }
}     