package ru.trainjava.sandbox;


/* Implement a class named Cat with two instance fields: string name and int age, and one static int field counter.
 The static counter field allows you to known how many cats have been already created.

The class should have a constructor for initializing the instance fields.
 During the initialization of a new cat, the static field should be incremented.
  If the counter > 5, the message "You have too many cats" must be printed out in the System.out.

Also, you need to implement a static method getNumberOfCats. It should return the current numbers of created cats.

Use the provided template, do not make the class public.

Example. Let's assume seven instances of the class Cat have been already created, then the correct implemented method Cat.getNumberOfCats()
should return 7 and the message "You have too many cats" has to appear twice.*/

class Cat {
//  class ConstantsAndUtilites {

  // write static and instance variables
  String name;
  int age;
  static int counter = 0;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
    Cat.getNumberOfCats();
    if(counter>5){
      System.out.println("You have too many cats");
    }
//    System.out.println(counter);
    // implement the constructor
    // do not forgot to check the number of cats
  }

  public static int getNumberOfCats() {
    // implement the static method



    System.out.println(counter);
    return counter++;

  }

  public static void main(String[] args) {
    Cat cat = new Cat("re",98);
    Cat cat1 = new Cat("",43);
    Cat cat2 = new Cat("r",0);
    Cat cat3 = new Cat("k",9);
    Cat cat4 = new Cat("b",2);
    Cat cat5 = new Cat("b",2);
  }
  }

