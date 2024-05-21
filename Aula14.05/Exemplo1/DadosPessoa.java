public class DadosPessoa{
    private int codigo;
    private String nome;

    public DadosPessoa(int codigo, String nome){
        this.codigo=codigo;
        this.nome=nome;
    }

    public DadosPessoa(int codigo){
        this.codigo=codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }
}
