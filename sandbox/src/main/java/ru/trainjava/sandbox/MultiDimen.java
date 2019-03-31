package ru.trainjava.sandbox;

public class MultiDimen {
  public static void main(String[] args) {
    String[][] a = new String[3][3];
    //int i, j, k = 0;
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = "X"+j;
        System.out.print(a[i][j]+" ");
      }
//    for (i = 0; i < a.length; i++) {
//      for (j = 0; j < i; j++)
//      {
//        System.out.print(a[i][j] + " ");
//        System.out.println();
//      }
//    }
  }
}

