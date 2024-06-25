public class Ex4{
    public static void main(String[] args) {
       Process ps=new Process();

       String str1=null; //testando com a string=null
       String teste1=ps.processar(str1);
       System.out.println(teste1);
       
       String str2="hello word"; //testando com a string="hello word"
       String teste2=ps.processar(str2);
       System.out.println(teste2);
    }    
}
