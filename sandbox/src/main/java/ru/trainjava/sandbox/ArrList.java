package ru.trainjava.sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrList {
    public static void main(String[] args) {
        List<String> alphabet = new ArrayList<>();
        //for (int i = 2; i < 240; i++) {
            //String s = wd.findElement(By.xpath("//*[@id='content']/form/table/tbody/tr[" + i + "]/td[5]/a")).getAttribute("text");
            alphabet.add("jlkjk");
            alphabet.add("uiuoiu");

        for(String k : alphabet){
            System.out.println(k);
        }

        System.out.println(alphabet.size());
        List<String> alpha = new ArrayList<>(alphabet);
        //System.arraycopy(alphabet,0,alpha,0,2);
        for(String neu : alpha)
        System.out.println(neu);
        //Collections.sort(alphabet);
        //for (String h : alphabet) {
           // alpha.add(h);
        }
    }

