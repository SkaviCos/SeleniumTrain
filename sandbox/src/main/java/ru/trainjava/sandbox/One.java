package ru.trainjava.sandbox;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("qwq","wewe","gfgf0","yryryr");
        LinkedList<String> d = new LinkedList<>();
        d.add("4546");
        d.add("sasa");
        d.add("ewe");
        for(int i=0;i<d.size();i++){
            System.out.println(d.get(i));

        }
        for(String v:d){
            System.out.println(v);

        }

    }
}
