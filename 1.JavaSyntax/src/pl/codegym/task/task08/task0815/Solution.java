package pl.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Spis ludności
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, String> map = new HashMap<>();

        map.put("Kareta", "Robert");
        map.put("Kareta1", "Robert");
        map.put("Kareta2", "Robert");
        map.put("Kareta3", "Robert");
        map.put("Kareta4", "Robert");
        map.put("Kareta5", "Robert");
        map.put("Kareta", "Piotr");
        map.put("Kareta", "Ewelina");
        map.put("Kareta", "Maria");
        map.put("Kareta", "Józef");
        map.put("Nowak", "Ola");
        map.put("Nowak", "Norbert");
        map.put("Slimak", "Norbert");
        map.put("Wariat", "Robert");
        map.put("Dobosz", "Ola");

        return map;
    }

    public static int getLicznikTakichSamychImion(HashMap<String, String> map, String imie) {
        //tutaj wpisz swój kod
        int licznik = 0;

        for (String s : map.values()) {
            if (s.equals(imie)) {
                licznik++;
            }
        }
        return licznik;
    }

    public static int getLicznikTakichSamychNazwisk(HashMap<String, String> map, String nazwisko) {
        //tutaj wpisz swój kod
        int licznik = 0;

        for (String s : map.keySet()) {
            if (s.equals(nazwisko)) {
                licznik++;
            }
        }
        return licznik;
    }

    public static void main(String[] args) {

    }
}
