package ru.trainjava.sandbox;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambda {
public static void acFunct(Function<Integer, Integer> f){

  System.out.println(f.apply(10));
}
Function<Integer, Integer> f=(x) -> x+12;

   BiFunction<Integer, Integer, Integer>adder = (x, y) -> {
    if (x <= y) {
      return y;
    } else {
      return x;
    }
  };

  public static void main(String[] args) {
//    System.out.println(adder(2,3));
    Function<Integer, Integer> f=(x) -> x+12;
    acFunct(f);

  }

//  private static boolean adder(int i, int i1) {
//
//  }

}

@FunctionalInterface
interface Func<T, R> {
  R apply(T val);

  static void doNothingStatic() {

  }

  default void doNothingByDefault() {

  }

  Func<Long, Long> square = new Func<Long, Long>() {
    @Override
    public Long apply(Long val) {
      return val * val;
    }
  };



//  Integer adder
//  long val = square.apply(10L);


}

