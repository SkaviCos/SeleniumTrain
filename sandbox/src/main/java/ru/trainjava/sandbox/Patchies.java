package ru.trainjava.sandbox;

public abstract class Patchies implements Patch {


    public Patchies() {
    }

    @Override
    public int doit(int a, int b) {
        return a+b;
    }

}
