public class MediaArray {
    public static void main(String[] args){
      double[] notas={8.0, 5.9, 9.9, 10.0, 4.8};
  
      double soma=0;
      for(int i=0; i<notas.length; i++){
        soma+=notas[i];
      }
  
      double media= soma/notas.length;
  
      System.out.println("A média é: " + media);
    }
  }