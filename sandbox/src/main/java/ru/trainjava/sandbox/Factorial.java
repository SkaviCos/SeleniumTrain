package ru.trainjava.sandbox;

public class Factorial {
    public static int fact(int f) {

        if (f == 0)
            return 1;
        return f * fact(f - 1);
    }
}
