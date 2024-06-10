public class SomaVarargs{
  public static int soma(int... nums){
    int soma=0;
    for(int num:nums){
      soma+=num;
    }
    return soma;
  }
}