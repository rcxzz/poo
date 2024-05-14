public class testTurma{
    public static void main(String[] args) {
        Turma turma1=new Turma();      
        Turma turma2=new Turma();

        System.out.println("Turma 1: ");
        turma1.setCurso("Matematica Aplicada");
        turma1.setDisciplina("Projetos 1");
        turma1.exibMensagem();

        System.out.println("Turma 2: ");
        turma2.setCurso("Ciencia da Computacao");
        turma2.setDisciplina("Arquitetura de Computadores");
        turma2.exibMensagem();
    }
}
