package ru.trainjava.sandbox;

import java.util.function.Consumer;
import java.util.function.Function;

public class lambdas {
    Consumer<String> printer = str -> System.out.println(str);
    Function<Long, Double> converter = Long::doubleValue;
}
