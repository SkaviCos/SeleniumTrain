package ru.trainjava.sandbox;

import java.util.Scanner;

public class Mein {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

//    System.out.println("Hello! My name is Aid.");
//    System.out.println("I was created in 2018.");
//    System.out.println("Please, remind me your name.");
//
//    String name = scanner.nextLine();
//
//    System.out.println("What a great name you have, " + name + "!");
//    System.out.println("Let me guess your age.");
//    System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
//
//    int rem3 = scanner.nextInt();
//    int rem5 = scanner.nextInt();
//    int rem7 = scanner.nextInt();
//
//    int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
//
//    System.out.println("Your age is " + age + "; that's a good time to start programming!");
//    System.out.println("Now I will prove to you that I can count to any number you want.");

    // read a number and count to it here
//    int j = scanner.nextInt();
//    for(int i=0;i<=j;i++){
//      System.out.println(i + "" +"!");
//    }
    System.out.println("Why do we use methods?");
    String one = ". To repeat a statement multiple times.";
    String two = ". To decompose a program into several small subroutines.";
    String three = ". To determine the execution time of a program.";
    String four = ". To interrupt the execution of a program.";
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    System.out.println(a+""+one);
    System.out.println(b+""+two);
    System.out.println(c+""+three);
    System.out.println(d+""+four);
//    int answer = scanner.nextInt();
    while(true){
      int answer = scanner.nextInt();
//     String answer = scanner.next();
     if(answer!=a){
       System.out.println("Please, try again.");
     }
     else{
       System.out.println("Completed, have a nice day!");
       break;
     }

    }

//    System.out.println("Completed, have a nice day!");
  }
}