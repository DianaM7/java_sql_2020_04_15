package Homework;

import java.util.Map;
import java.util.TreeMap;

public class Bandymas {

    public static void main(String[] args) {
        Map<Integer, String> names = new TreeMap<>();
        names.put(2, "Tu");
        names.put(1, "As");
        names.put(2, "Jis");

        for(Integer map : names.keySet()){
            System.out.println("id" + map + "value" + names.get(map));
        }

    }
}



