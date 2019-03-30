package ru.trainjava.sandbox;

import java.util.*;

public class DataStructure {
    public static void main(String[] args) {


        List<Integer> linked = new LinkedList<>(Arrays.asList(2, 2, 3, 4));
        System.out.println(linked.size());
        System.out.println(((LinkedList<Integer>) linked).getFirst());
        System.out.println(((LinkedList<Integer>) linked).getLast());

        for (Integer b : linked) {
            System.out.println(b);
        }

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        HashMap<String, String> map = new HashMap<>();
        map.put("d2", "l2");
        map.put("d3", "l3");
        map.put("d4", "l4");
        map.put("d5", "l5");

    }

}
