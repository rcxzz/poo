import java.util.Scanner;
public class Ex3{
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra1=sc1.nextLine();
        System.out.println("Digite outra palavra: ");
        String palavra2=sc2.nextLine();

        if(palavra1.equals(palavra2)){
            System.out.println("As palavras são iguais!");
        }else{
            System.out.println("As palavras são diferentes.");
        }
        System.out.println(palavra1.equalsIgnoreCase(palavra2));

        sc1.close();
        sc2.close();
    }
}
