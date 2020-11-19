package sk.kosickaakademia.onofrej.polymorfizmus;

public class Main {
    public static void main(String[] args) {
        B p1 = new B();   // zavola sa kontruktor A, potom B
        p1.print();   // zavola sa metoda print() z triedy B

        A p2=new C();   // zavola sa kontruktor A, potom B, potom C
        p2.print();     // zavola sa print z triedy C
        ((B)p2).print(); // vypise print z triedy C
        p2.wildAnimal(); // vypise cow
        ((C)p2).programmingLanguage();  // metodu mozem volat len po pretypovani na B alebo C
        ((C) p2).drink();

        A p3 = new A();  // vola sa konstruktor A
        p3.wildAnimal();  // vypise horse

        I1 p4 = new B(); // vypise sa kontruktor A,B
        p4.wildAnimal(); // vypise cow
        ((A)p4).print(); // metoda print nie je sucastou I1, a preto je mozne ju volat len po pretypovani na A alebo B

        C p5 = new C(); // vila sa kontruktor A,B a nakoniec C
        p5.print(); // vypise C

        A p6 = new A("mobil phone","Milan");

        I1 p7= new C();
        ((C)p7).day();

        B p8 = new C();
        p8.print();
        p8.time();

        I2 p9 = new C();
        p9.drink();
        ((C)p9).time();

        A p10 = new A();
        p10.time();

        String data = "Fero";
        M m = new M();
        m.start(data);
    }


}
