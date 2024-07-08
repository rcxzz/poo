public class Exercicio1part2 {
    public static void main(String[] args){
        Animal[] animal=new Animal[3];
        animal[0]=new Cachorro();
        animal[1]=new Gato();
        animal[2]=new Preguica();
        for(int i=0; i<3; i++){
            System.out.println("Som do animal " + (i+1));
            animal[i].emitirSom();
            System.out.println();
        }
    }
}