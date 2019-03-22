package ru.trainjava.sandbox;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UIo {
    public static void main(String[] args) {
        String dg = "1 2 3 4";
        String[] arr = dg.split(" ");
//        String sr = dg.trim();
        for(String ds : arr)
        System.out.println(ds);
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
////        List<Integer> str = dg.charAt(1)
//        List<Integer> filteredList = list.stream().filter(val -> val >= 2_0)
//                .collect(Collectors.toList());
//
//        boolean hasValue10 = IntStream.range(1, 11).anyMatch(x -> x == 10);
//
//        IntSummaryStatistics stat = IntStream.rangeClosed(1, 55_555).summaryStatistics();
//        System.out.println(hasValue10);
//        System.out.println(filteredList);

    }

}


