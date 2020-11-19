package sk.kosickaakademia.onofrej.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> mnozina = new HashSet<>();
        mnozina.add(45);
        mnozina.add(22);
        mnozina.add(45);
        mnozina.add(18);
        mnozina.add(45);
        for(Integer temp : mnozina){
            System.out.println(temp);
        }
    }
}
