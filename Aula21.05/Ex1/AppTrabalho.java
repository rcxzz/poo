public class AppTrabalho {
    public static void main(String[] args) {
        Dispositivo dispositivo1=new Dispositivo(1, "Notebook"); // Cria um objeto Dispositivo com código 1 e nome "Notebook"
        Dispositivo dispositivo2=new Dispositivo(2, "Desktop"); // Cria um objeto Dispositivo com código 2 e nome "Desktop"

        Usuario usuario1=new Usuario(1, "Theodoro"); // Cria um objeto Usuario com matrícula 1 e nome "Theodoro"
        Usuario usuario2=new Usuario(2, "Ana"); // Cria um objeto Usuario com matrícula 2 e nome "Ana"

        usuario1.setDispositivo(dispositivo1); // Associa o objeto dispositivo1 ao objeto usuario1
        usuario1.trabalhar(); // Chama o método trabalhar() do objeto usuario1, que imprime uma mensagem indicando que o usuário está usando o dispositivo
        usuario2.setDispositivo(dispositivo2); // Associa o objeto dispositivo2 ao objeto usuario2
        usuario2.trabalhar(); // Chama o método trabalhar() do objeto usuario2, que imprime uma mensagem indicando que o usuário está usando o dispositivo
        //     }    
    }    
}
