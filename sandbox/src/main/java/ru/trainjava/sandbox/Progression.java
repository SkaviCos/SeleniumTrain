package ru.trainjava.sandbox;

public class Progression {

    public static void arithmeticSequenceElements(int first, int step, long total) {
        // Solution goes here
        for(long  i = 0;i<total;i++){
             first += step;
             String s = "" + first;
            System.out.println(s);
        }
        return ;
    }


        public static void main(String[] args) {
            Progression p = new Progression();
            p.arithmeticSequenceElements(1,8,9);
        }
    }


