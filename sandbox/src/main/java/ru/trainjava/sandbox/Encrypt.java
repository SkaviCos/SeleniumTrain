package ru.trainjava.sandbox;

import java.util.Scanner;

public class Encrypt {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String inp ="";
    inp += sc.nextLine();
//    System.out.println(a);
    String enc = inp.replaceAll("[a-zA-Z]","#");
    System.out.println(enc);

    }
  }

