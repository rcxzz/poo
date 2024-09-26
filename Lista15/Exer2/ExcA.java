public class ExcA extends Exception{
    private String msg;

    public ExcA(String mensagem){
        this.msg = msg;
    }
    
    @Override
    public String toString(){
        return msg;
    }
}