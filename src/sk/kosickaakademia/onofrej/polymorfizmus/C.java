package sk.kosickaakademia.onofrej.polymorfizmus;

public class C extends B{

    public C(){
        System.out.println("I am constructor C()");
    }

    @Override  // Anotacia - prekryly metodu print
    public void print(){
        super.print();
        System.out.println("Class C: print()");
    }

    public void day(){
        System.out.println("Monday");
    }

    @Override
    public void drink() {
        System.out.println("Fanta mango");
    }
}
