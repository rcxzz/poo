public class ProdutoApp{
    public static void main(String[] args){ 
        Produto p1=new Produto("Notebook",6000.00);
        Livro l1=new Livro("Harry Potter - A pedra filosofal", 36.00, 500, "J. K. Rowling");

        System.out.println(p1.descricao());
        System.out.println(l1.descricao(true));
        System.out.println("O produto é caro? " + p1.ehCaro());
        System.out.println("O livro é extenso? " + l1.ehExtenso());
    }
}