
public class Main{
    public static void main(String[] args){
        try{
            throw new ExcC("ERRO C");
        } catch(ExcA exc){
            System.out.println(exc);
        }
        
        try {
            throw new ExcB("ERRO B");
        } catch(ExcA exc){
            System.out.println(exc);
        }
    
        try {
            throw new ExcA("ERRO A");
        } catch(ExcA exc){
            System.out.println(exc);
        }
    }
}