package ru.trainjava.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySort {

    public List<String> ArraySort(){
        List<String> countries = new ArrayList<>();
        countries.add("Adjad");
        countries.add("Aman");
        countries.add("Bahrain");
        countries.add("Japan");

        for(String count : countries){
            System.out.println("");
        }

        return countries;
    }

}
class Arr {
    public static void main(String[] args) {
        String[] names = new String[]{"Roman", "Anna", "Petr", "Maria"};
        //Listt<String>
        for(int i = 0;i<names.length;i++)
        for(String count : names){
          System.out.println(count);
        }
       // Arrays.sort(names);
        //for (int i = 0; i < names.length; i++) {
          //  System.out.print(names[i] + "  ");
        //}
    }
}
