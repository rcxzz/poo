import java.util.Scanner;

public class Lista1{
    public static void main(String[] args){
        /* EX 1 
        int base=5;
        int altura=9;
        float area = base * altura;
        float perimetro = (base*2) + (altura*2);
        System.out.println("Área: " + area + "\nPerímetro: " + perimetro);*/

        /* EX 2 
        int lado=24;
        int area= lado*lado;
        int perimetro=lado*4;
        System.out.println("Área: " + area + "\nPerímetro: " + perimetro);*/

        /*EX 3
        Scanner sc=new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        if(numero>0){
            System.out.println("Este numero e positivo.");
        }else if(numero<0){
            System.out.println("Este numero e negativo.");
        }else{
            System.out.println("Este numero e zero");
        }
        sc.close();
        */  

        /*EX 4
        Scanner scanner=new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int num1=scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        int num2=scanner.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int num3=scanner.nextInt();
        int soma=0;
        if(num1>num2 && num1>num3){
            if(num2>num3){
                soma=num1+num2;
            }else{
                soma=num1+num3;
            }
        }else if(num2>num1 && num2>num3){
            if(num1>num3){
                soma=num2+num1;
            }else{
                soma=num2+num3;
            }
        }else{
            if(num1>num2){
                soma=num3+num1;
            }else{
                soma=num3+num2;
            }
        }
        System.out.println("A soma dos dois maiores números é: " + soma);
        scanner.close();*/

        /*EX 5 
        Scanner scanner=new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 1 e 7: ");
        int num=scanner.nextInt();
        if(num>=1 && num<=7){
            switch(num){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda-feira");
                    break;
                case 3:
                    System.out.println("Terça-feira");
                    break;
                case 4:
                    System.out.println("Quarta-feira");
                    break;
                case 5:
                    System.out.println("Quinta-feira");
                    break;
                case 6:
                    System.out.println("Sexta-feira");
                    break;
                case 7:
                    System.out.println("Sábado");
                    break;
            }
        }else{
            System.out.println("Erro: o número deve ser entre 1 e 7.");
        }
        scanner.close();*/

        /*EX 6 
        Scanner scanner=new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num=scanner.nextInt();
        if(num<2){
            System.out.println("Erro: o número deve ser maior ou igual a 2.");
            return;
        }
        boolean Primo=true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                Primo=false;
                break;
            }
        }
        if(Primo){
            System.out.println("O número " + num + " é primo.");
        }else{
            System.out.println("O número " + num + " não é primo.");
        }
        scanner.close();*/
        
        /*EX 7 
        Scanner scanner=new Scanner(System.in);
        int[]vet=new int[10];
        int contPares=0;
        System.out.println("Digite 10 números inteiros:");
        for(int i=0; i<10; i++){
            vet[i]=scanner.nextInt();
        }
        for(int i=0; i<10; i++){
            if(vet[i]%2==0){
                contPares++;
            }
        }
        System.out.println("Número de números pares: " + contPares);
        scanner.close();*/
    }
}
        