package sk.kosickaakademia.onofrej.arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> pole = new ArrayList<>();
        System.out.println("Enter a count of numbers : ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        Random random = new Random();
        int i;
        for(i=0;i<count;i++){
            pole.add( random.nextInt(100));
        }
        // vypis pola
        /*for(i=0;i<count;i++){
            System.out.print(pole.get(i)+" ");
        }*/
        // namiesto for -> foreach

        for(Integer temp: pole){
            System.out.print(temp+" ");
        }

        System.out.println();
        System.out.println("Enter number:");
        int value = sc.nextInt();
        if(pole.contains(value)){
            System.out.println("Pole contains a value: "+value);
        }else{
            System.out.println("Pole does not contain a value: "+value);
        }
    }

}
