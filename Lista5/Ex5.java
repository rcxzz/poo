public class Ex5{
  public static void main(String[] args) {
    int[] array={2, 3, 4, 5, 7, 4, 1, 8, 9, 6};
    int x=5;

    //Encontrando e imprimindo o par de posições consecutivas cujos números possuam a maior diferença entre os mesmos
    int maxDif=0;
    int pos1=0;
    int pos2=0;
    for(int i=0; i<array.length-1; i++){
      int dif=Math.abs(array[i]-array[i+1]);
      if(dif>maxDif){
        maxDif=dif;
        pos1=i;
        pos2=i+1;
      }
    }
    System.out.println("Par de posições consecutivas com maior diferença: " + pos1 + " e " + pos2);

    //Verificando e imprindo se o array está em ordem crescente, decrescente ou não ordenado
    boolean crescente=true;
    boolean decrescente=true;
    for(int i=0; i<array.length-1; i++){
      if(array[i]>array[i+1]){
        crescente=false;
      }
      if(array[i]<array[i+1]){
        decrescente=false;
      }
    }
    if(crescente){
      System.out.println("Array está em ordem crescente");
    }else if(decrescente){
      System.out.println("Array está em ordem decrescente");
    }else{
      System.out.println("Array não está ordenado");
    }

    //Apresentando quantos números no array são maiores que X, menores que X e iguais a X
    int maiorQueX=0;
    int menorQueX=0;
    int igualAX=0;
    for(int num:array){
      if(num>x){
        maiorQueX++;
      }else if(num<x){
        menorQueX++;
      }else{
        igualAX++;
      }
    }
    System.out.println("Números maiores que " + x + ": " + maiorQueX);
    System.out.println("Números menores que " + x + ": " + menorQueX);
    System.out.println("Números iguais a " + x + ": " + igualAX);
  }
}