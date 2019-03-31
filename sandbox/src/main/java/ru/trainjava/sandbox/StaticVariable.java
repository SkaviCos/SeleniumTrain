package ru.trainjava.sandbox;

import java.util.Date;

public class StaticVariable {

  public static String staticStringField;

  public static Date lastCreated;

  public static int staticIntField;

  public static final double E = 2.7182818284590452354;

  public static final double PI = 3.14159265358979323846;

  public StaticVariable(){
    lastCreated = new Date();
  }
}
class Static {
  public static void main(String[] args) {
    System.out.println(StaticVariable.E);

//    StaticVariable as = new StaticVariable();
//
//    StaticVariable.staticIntField = 10;
//    StaticVariable.staticStringField = "it's is a static member";
//
//    System.out.println(as.staticIntField); // It prints "10"
//    System.out.println(StaticVariable.staticStringField);

    System.out.println(StaticVariable.lastCreated);

//    StaticVariable ins1 = new StaticVariable();
//    System.out.println(StaticVariable.lastCreated);
//    StaticVariable ins2 = new StaticVariable();
//    System.out.println(StaticVariable.lastCreated);



  }
}
