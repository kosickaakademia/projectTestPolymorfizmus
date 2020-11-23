package sk.kosickaakademia.onofrej.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> zas = new Stack<>(4);
        zas.push(15);
        zas.push(-10);
        zas.push(21);
        zas.print();
        zas.pop();
        zas.push(35);
        zas.push(82);
        zas.push(9);
        zas.print();

        Stack<String> inyZas = new Stack<>(5);
    }
}
