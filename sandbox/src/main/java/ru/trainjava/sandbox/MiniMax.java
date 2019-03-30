package ru.trainjava.sandbox;

import java.util.ArrayList;
import java.util.List;

public class MiniMax {
    public static String miniMax(List<Integer> list){
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;

        for(int i = 0;i<list.size();i++){
            if (max<list.get(i))
                max=list.get(i);
            if(list.get(i) < min)
                min = list.get(i);
            }


        return max + " " + min;


        }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(3);
        lst.add(43);
        lst.add(54);
        lst.add(65);
        lst.add(290909090);

        System.out.println(miniMax(lst));

    }

    }

