public class OrdemDeConstrucao {
    public static void main(String[] args) {
        C c = new C();
    }
}

/*
Imprime:
Construção de A.
Construção de B.
Construção de C.
   
    Classe A 
        (construtor)
    Classe B
        (construtor)
    Classe C 
        (construtor)

Justificativa: É impresso primeiramente os contrutores das classes pai, por conta da ordem de herança.
 */