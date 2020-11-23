package sk.kosickaakademia.onofrej.hashset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> mnozina = new HashSet<>();
        mnozina.add(45);
        mnozina.add(22);
        mnozina.add(45);
        mnozina.add(18);
        mnozina.add(45);

        Object[] pole = mnozina.toArray();
        Arrays.sort(pole);
        for(Object temp:pole)
        {
            System.out.println(temp);
        }

        /*
        for(Integer temp : mnozina){
            System.out.println(temp);
        }*/
    }
}
