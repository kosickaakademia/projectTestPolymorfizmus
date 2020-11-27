package sk.kosickaakademia.onofrej.abstracts.tree.leafy;

import sk.kosickaakademia.onofrej.abstracts.Tree;

public class Linden extends Tree {
    public Linden(int age) {
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Zasad lipu a budes mat vynikajuci caj po cely rok");
    }
}
