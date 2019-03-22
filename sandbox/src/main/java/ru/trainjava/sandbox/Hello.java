package ru.trainjava.sandbox;

public class Hello {
    public static void main(String[] args) {
        String s = "//*[@id='content']/form/table/tbody/tr[2]/td[5]/a";
        int i = 2;
        System.out.println("//*[@id='content']/form/table/tbody/tr[" + i + "]/td[5]/a");
        for (int j = 0; j < j + 1; j++) {
            System.out.println();
        }


        System.out.println(s);
        System.out.println("ru.trainjava.sandbox.Hello");
    }
}
