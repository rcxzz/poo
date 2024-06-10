import java.util.Random;

public class Matriz3x3{
  public static void main(String[] args){
    int[][] matriz=new int[3][3];

    Random random=new Random();

    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        matriz[i][j]=random.nextInt(9); // gera um número entre 0 e 8
      }
    }

    System.out.println("Matriz A:");
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        System.out.print(matriz[i][j] + " ");
      }
      System.out.println();
    }
  }
}