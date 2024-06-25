import java.util.Scanner;
public class Ex2{
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Digite uma palavra com mais de 8 caracteres: ");
        String palavra=sc1.nextLine();
        if(palavra.length()<8){
            System.out.println("ERRO: A palavra deve ter pelo menos 8 caracteres.");      
        }else{
            String parte1=palavra.substring(0, 2);
            String parte2=palavra.substring(palavra.length()-2);
            System.out.println("Nova palavra: " + parte1 + parte2);
        }
        sc1.close();
    }
}