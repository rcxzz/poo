public class Aluno extends Pessoa implements Falante{

    public Aluno(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void falar() {
        System.out.println("Ola, eu sou aluno de Matemática Aplicada e Computacional.");
    }

    @Override
    public String seuIdioma() {
        return "Português";
    }
    
    public void identificarSe(){
        System.out.println("Eu sou o aluno(a): " + getNome() + ", idade: " + getIdade());
    }
}
