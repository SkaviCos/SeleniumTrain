package ru.trainjava.sandbox;

interface Patch {
    int Do();
}

abstract class Patchs implements Patch {
    int a, b = 90;

    public int Do() {
        return a + b;
    }
}

class Pathies extends Patchs {

    public int Do(int c) {
        return c;
    }

}
