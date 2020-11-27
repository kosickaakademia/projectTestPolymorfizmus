package sk.kosickaakademia.onofrej.abstracts.tree.coniferous;

import sk.kosickaakademia.onofrej.abstracts.Coniferous;
import sk.kosickaakademia.onofrej.abstracts.Tree;

public class Pine extends Tree implements Coniferous {

    public Pine(int age) {
        super(age);
    }

    @Override
    public void description() {
        System.out.println("Som sucha a opadava mi ihlicie");
    }
}
