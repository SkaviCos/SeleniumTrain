package ru.trainjava.sandbox;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sorter {

        public static List<String> sort(List<String> textbooks) {
            //Cramming right before a test can't be that bad?
            //ArrayList<String> srt= new ArrayList<>();
            //for(String sorty:srt){
              //  srt.add[textbooks];
            //}
            //ArrayList<String> sr = new ArrayList<>();
            textbooks.sort(String::compareToIgnoreCase);
            return textbooks;
        }
        //return srt;
    }
