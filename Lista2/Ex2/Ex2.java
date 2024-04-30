public class Ex2 {
    public static void main(String[] args) {
        Universidade uni1=new Universidade();
        Aluno aluno1=new Aluno();
        uni1.nome="Unicentro";
        uni1.cidade="Guarapuava";
        uni1.estado="Parana";
        aluno1.nome="Eric";
        aluno1.curso="MAC";
        uni1.exibeDados();
        aluno1.exibeDados();
    }
}