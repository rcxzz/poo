public class Livro{
    private String titulo;
    private String autor;

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setTitulo(String t){
        titulo=t;
    }
    public void setAutor(String a){
        autor=a;
    }
    public void exibeMensagem(){
        System.out.println("Titulo: " + titulo + "\n Autor: " + autor);
    }
}