package sk.kosickaakademia.onofrej.abstracts.tree.leafy.fruits;

import sk.kosickaakademia.onofrej.abstracts.Tree;

public class AppleTree extends Tree {
    public AppleTree(int age){
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Mam sladucke jablcka");
    }

    @Override
    public void getFruit() {
        System.out.println("mam sladke jablcka");
    }
}
