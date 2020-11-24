package sk.kosickaakademia.onofrej.stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(3);
        try {
            stack.push(45);
            stack.push(9);
            stack.push(12);
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.print();
        }catch(StackException ex){
            ex.printStackTrace(); //System.out.println(ex.getMessage());
        }
    }
}
