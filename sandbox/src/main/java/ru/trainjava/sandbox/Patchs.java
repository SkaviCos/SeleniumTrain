package ru.trainjava.sandbox;

public class Patchs extends Patchies  {

    @Override
    public int doit(int a, int b) {
        return a+3+b+9;
    }

    public static void main(String[] args) {
        Patchs patchs = new Patchs();
        patchs.doit(2,9);
    }
}
