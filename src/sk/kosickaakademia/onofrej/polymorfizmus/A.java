package sk.kosickaakademia.onofrej.polymorfizmus;

public class A implements I1 {
    private int number;

    public A(){
        System.out.println("I am constructor A()");
        this.number = 40;
    }

    public A(String text){
        this(); // zavola sa konstruktor A();
        System.out.println("I am constructor A() and I got a text: "+text);
    }

    public A(String text, String name){
        this(text);
        System.out.println("I am constructor A(),your name is:"+name+" and I got a text: "+text);
    }

    @Override
    public void animal() {
        System.out.println("Dog");
    }

    public void print(){
        System.out.println("Class A : print()");
    }

    public void time(){
        System.out.println("Time: 10:20:22");
        M m =new M();
        m.run(this); // metode run posielam odkaz na seba sameho ( ja som trieda A)
    }
}
