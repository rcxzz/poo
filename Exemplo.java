public class Exemplo {
    
    public static void main(String[] args) {
        /*int soma = 0;
        int n1 = 1;
        int n2 = 2;
        soma = n1 + n2;
        System.out.println("Soma: " + soma);*/

        char c = 'a';
        //código Unicode de a = 97
        System.out.println("c: " + c);
        c++;
        System.out.println("c: " + c);
        c= (char)(c*100/80);
        System.out.println("c: " + c);
        int i = c;      
        System.out.println("i: " + i);
    }
}
