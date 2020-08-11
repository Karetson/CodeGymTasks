package pl.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Tylko dla bogaczy
*/

public class Solution {
    public static HashMap<String, Integer> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("Nazwisko", 600);
        map.put("Nazwisko1", 400);
        map.put("Nazwisko2", 500);
        map.put("Nazwisko3", 300);
        map.put("Nazwisko4", 900);
        map.put("Nazwisko5", 600);
        map.put("Nazwisko6", 600);
        map.put("Nazwisko7", 600);
        map.put("Nazwisko8", 550);
        map.put("Nazwisko9", 600);

        return map;
    }

    public static void usunPozycjeZmap(HashMap<String, Integer> map) {
        //tutaj wpisz swój kod
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            if (entry.getValue() < 500) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}