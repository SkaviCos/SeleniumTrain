package ru.trainjava.sandbox;

import java.util.Scanner;

public class RegExpSample {

  public static void main(String[] args) {
//    String acbRegex = "......";
//    String pattern = "22 dollars";
//    String patterntwo = "..? trees?";
//    String pattern = ".....\\.";
//
//    System.out.println("trees".matches(patterntwo));
//    System.out.println("Hello!".matches(acbRegex));
    //System.out.println("ABC".matches(acbRegex));
    //System.out.println("abc1".matches(acbRegex));
//    Scanner sc = new Scanner(System.in);
//    String input = sc.nextLine();
//
//    int number = Integer.parseInt(input);
//    System.out.println(number + 1);
    //public void OutputREPL() {

    Scanner scanner = new Scanner(System.in);

//    int num  = scanner.nextInt();
//    int num1 = scanner.nextInt();

    while (true) {
      String s = "/exit";
      String s1 = " ";
      if(scanner.hasNextLine()) {
        s1 = scanner.nextLine();
      }
//      scanner.nextLine();
//              scanner.nextLine();

      if (s1.matches(s)) {
        System.out.println("bye");
        break;
      } //else {
//      s = scanner.nextLine();
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();

//      s = scanner.nextLine();
        System.out.println(num + num1);
//      s1 = scanner.nextLine();
      //}
//    for(int i = 0;i<2;i++){
//      num1 += num;
//    }
//    System.out.println(num1);
//    String string = scanner.nextLine();
//    int index = scanner.nextInt();
//    if (string.length() == index){
//      System.out.println("Out of bounds!");
//    }
//    else{
//      System.out.println(string.charAt(index));
//    }


    }
  }
}