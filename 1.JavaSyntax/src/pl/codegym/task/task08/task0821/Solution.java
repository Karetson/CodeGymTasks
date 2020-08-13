package pl.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Współdzielone nazwiska i imiona
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> mapa = utworzMapLudzi();
        printMapLudzi(mapa);
    }

    public static Map<String, String> utworzMapLudzi() {
        //tutaj wpisz swój kod
        Map<String, String> map = new HashMap<>();

        map.put("Naziwsko", "Imie");
        map.put("Naziwsko4", "Imie2");
        map.put("Naziwsko", "Imie");
        map.put("Naziwsko3", "Imie5");
        map.put("Naziwsko", "Imie");
        map.put("Naziwsko", "Imie3");
        map.put("Naziwsko5", "Imie4");
        map.put("Naziwsko", "Imie");
        map.put("Naziwsko2", "Imie7");
        map.put("Naziwsko1", "Imi7e");

        return map;
    }

    public static void printMapLudzi(Map<String, String> mapa) {
        for (Map.Entry<String, String> s : mapa.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
