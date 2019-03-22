package ru.trainjava.sandbox;

import java.util.*;

//public class hSet {
//
//    public static Set<Integer> getSetFromString(String str) {
//        // write your code here
//        HashSet<Integer> set = new HashSet<>();
//        String sret = str.replace(" ","");
////        char[] out = sret.toCharArray();
//        for(int i = 0;i<sret.length();i++){
//            System.out.println(sret);
//        }
//            for(String input : set) {
//                int in = Integer.parseInt(String.valueOf(input));
//                set.add(in);
//                System.out.println(set);
//            }
//        return set;
//
//    }
//
//    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
//       for(Integer tes : set) {
//           if (tes / 10 > 1) {
//               set.remove(tes);
//           }
//       }
//       System.out.println(set);
//    }
//}
//
///* Do not change code below */
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String numbers = scanner.nextLine();
//        Set<Integer> set = hSet.getSetFromString(numbers);
//        hSet.removeAllNumbersGreaterThan10(set);
//        set.forEach(e -> System.out.print(e + " "));
//    }
//
//}
