package sk.kosickaakademia.onofrej.generic;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Algorithm alg = new Algorithm();
        AlgorithmG algG = new AlgorithmG();
        System.out.println( alg.add(15, 28) );
        System.out.println( alg.add(15.4, 28.9) );
        System.out.println( algG.random(15,134.5,"Ahoj") );

        System.out.println( new AlgorithmG<String>().random("Janko","Ferko","Lenka"));

        new AlgorithmG<String>().checktType("Mirko");
        new AlgorithmG<Date>().checktType(new Date());
        new AlgorithmG<Integer>().checktType(38);
        new AlgorithmG().checktType(55.7);
    }
}
