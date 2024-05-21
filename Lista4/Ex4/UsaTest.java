public class UsaTest {
    public static void main(String[] args){
        Test test1=new Test(5);
        Test test2=new Test(10);
        System.out.println("Antes da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
        troca(test1, test2);
        System.out.println("Depois da troca");
        System.out.println("ob1.a = " + test1.getA());
        System.out.println("ob2.a = " + test2.getA());
    }

    public static void troca(Test ob1, Test ob2){
        int temp=ob1.getA();
        ob1.setA(ob2.getA());
        ob2.setA(temp);
    }
}
/*Isso ocorre porque o método troca troca os valores de a entre os objetos ob1 e ob2. 
No entanto, é importante notar que a troca é feita apenas nos valores de a e não nos objetos em si.
Ou seja, test1 e test2 ainda são os mesmos objetos, mas seus valores de a foram trocados. */