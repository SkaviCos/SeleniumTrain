package ru.trainjava.sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSc {
    public static void main(String[] args) {
        String[] text = new String[11];
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String line;
        System.out.println("Please insert text:");
        while (!(line = sc.nextLine()).equals("")) {
            list.add(line);
            i++;
        }
        for(String s : list){
            System.out.println(s);
        }

    }
}




