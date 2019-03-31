package ru.trainjava.sandbox;

import java.util.Arrays;

public class ArrayDemo {
    public static String smash(String[] words) {

        //int sample[] = new int[10];
        //int  i;

        String t = "";

        //String t="opoppop";
        t.replace("o","O");

        for (String s : words)
            t += s + " ";
        return t.isEmpty() ? "" : t.substring(0, t.length() - 1);
        //return String.join("",words);
//advertiseronetwothree4

    }
}
            /*for (i = 0; i < 10; i++)
                sample[i] = i;

        for(i=0;i<10;i++) {
            //System.out.println("\n");
        }
        System.out.println("[" + i +"]" + " " + sample[i]);
    }*/


/*class MinMax{
    public static void main(String args[]){

        int nums[] = {99,-10,100123,18,-978,5623,463,-9,287,49};
        int min, max;

        min = max = nums[0];
        for(int i =1;i<10;i++){
            //if(nums[i]<min) min = nums[i];
            //if(nums[i]>max) max = nums[i];
        }
        System.out.println(min +" "+ max);
    }
}*/