public class Turma{
    private String curso;
    private String disciplina;

    public String getCurso(){
        return curso;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public void setCurso(String c){
        curso=c;
    }
    public void setDisciplina(String d){
        disciplina=d;
    }
    public void exibMensagem(){
        System.out.println("Curso: " + curso + "\n Disciplina: " + disciplina);
    }
}