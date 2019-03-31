package ru.trainjava.sandbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        //int size = sc.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        ArrayList<String> srt = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            String s = reader.readLine();
            srt.add(0, s);
        }
        for (int i = 0; i < 5; i++) {

            System.out.println(srt.get(i) + "место в листе" + i);
        }
    }
}
