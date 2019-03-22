package ru.trainjava.sandbox;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;
import static java.util.stream.Collectors.*;

public class Numeric {
//    public static void main(String[] args) {
////        List<String> list = new ArrayList<>();
////        list.add("358");
////        list.add("fjsdkfh");
////
////        for(String lists : list){
////
////        }
////        try{
////            String s = "123fskdfs";
////            String s1 = "789";
////            Integer in = Integer.valueOf(s);
////            System.out.println(in);
////        }catch (NumberFormatException e){
////            System.out.println("Not a number");
////        }
//        List<String> nameList = new ArrayList<>(asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
//
//
//        //write your code here
//        String[] strArray = nameList.toArray(new String[0]);
//
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }

//    public static <T> T getElementByIndex(List<T> lst, int index) {
////        // write your code here
////
//////        for(int i = 0; i < lst.size();i++){
//////            lst.add(i,);
//////        }
////        if(index<0)
////            index = lst.size()-(index*(-1));
////        return lst.get(index);
////    }
////
////    /* Do not change code below */
////    public static void main(String[] args) {
////
////        final Scanner scanner = new Scanner(System.in);
////
////        final List<String> values = Arrays
////                .stream(scanner.nextLine().split("\\s+"))
////                .collect(toList());
////
////        final int index = Integer.parseInt(scanner.nextLine());
////
////        try {
////            String element = getElementByIndex(values, index);
////            System.out.println(element);
////        } catch (IndexOutOfBoundsException e) {
////            System.out.println("Exception");
////        }
////    }
static void changeList(List<String> list){
    // write your code here

    list.replaceAll(s -> s = list.stream().max(Comparator.comparingInt(String::length)).get());
//    String max = "";
//    for(int i = 0;i<list.size();i++){
//        if(list.get(i).length()> max.length()) {
//
//            max = list.get(i);
//        }
//
//    }
//    System.out.println(max);
////    list.clear();
////    clear Collections.replaceAll(list,list.get(i), max);
//    for(int i = 0;i<list.size();i++){
//        Collections.replaceAll(list,list.get(i), max);
//    }
////    for(String l : list) {
////        System.out.println(l);
////    }
//    return ;

}

    /* Do not change code below */
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Gamma");
        set.add("Alpha");
        set.add("Omega");
        set.size();
        System.out.println(set);

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }

    }



