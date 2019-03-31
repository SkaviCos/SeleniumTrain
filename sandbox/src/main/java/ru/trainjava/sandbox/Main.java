package ru.trainjava.sandbox;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static String toUpperCase(String str) {
            if (str == null)
                return "NULL";
            return str.toUpperCase(Locale.getDefault());
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.equalsIgnoreCase("none") ? null : line;
        System.out.println(toUpperCase(line));
    }


}
