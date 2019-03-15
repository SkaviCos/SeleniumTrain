package ru.trainjava.sandbox;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args)throws Exception {


        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

        //ввод строк с клавиатуры
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            String s = reader.readLine();
            list.add(s);
        }
        System.out.println(list.size());

//вывод содержимого коллекции на экран
        for (int i = 0; i < list.size(); i++) {
            //int j = list.size() - i - 1;
            System.out.println(list.get(3));
        }
    }
}