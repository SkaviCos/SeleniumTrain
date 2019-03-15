package ru.trainjava.sandbox;

import java.util.*;

public class One {
    public static void main(String[] args) {
        List<String> a = Arrays.asList("qwq", "wewe", "gfgf0", "yryryr");

        for (String v : a) {
            System.out.println(v);
        }

        LinkedList<String> d = new LinkedList<>();

        d.add("4546");
        d.add("sasa");
        d.add("ewe");


        for (int i = 0; i < d.size(); i++) {
            System.out.println(d.get(i));

        }

        HashMap<String, String> map = new HashMap<>();

        map.put("Wet", "123");
        map.put("Soft", "456");
        map.put("Water", "789");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            //ключ
            String value = pair.getValue();        //значение
            System.out.println(key + ":" + value);
        }


    }
}
