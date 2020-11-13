package sk.kosickaakademia.onofrej.polymorfizmus;

public class C extends B{

    public C(){
        System.out.println("I am constructor C()");
    }

    @Override  // Anotacia - prekryly metodu print
    public void print(){
        System.out.println("Class C: print()");
    }
}
