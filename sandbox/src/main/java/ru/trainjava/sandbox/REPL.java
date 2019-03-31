package ru.trainjava.sandbox;

import java.util.Scanner;

public class REPL {
  public static void main(String[] args) {
    String s = "/exit";
    int a;
    int b;
    Scanner sc = new Scanner(System.in);
    while(true) {
      a = sc.nextInt();
      b = sc.nextInt();
//      if(a ){
//        sc.nextLine();
//      }
      System.out.println(a + b);

      String s1 = sc.next();
      if (s.matches(s1)) {
        System.out.println("bye");
        break;
      }
      sc.nextLine();
      continue;
    }


  }
}
