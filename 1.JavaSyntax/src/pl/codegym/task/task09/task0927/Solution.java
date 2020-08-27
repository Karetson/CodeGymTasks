package pl.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Dziesięć kotów
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Kot> mapa = utworzMap();
        Set<Kot> set = konwertujMapDoSet(mapa);
        printSetKotow(set);
    }

    public static Map<String, Kot> utworzMap() {
        //tutaj wpisz swój kod
        Map<String, Kot> map = new HashMap<>();
        map.put("imie", new Kot("imie"));
        map.put("imie1", new Kot("imie"));
        map.put("imie2", new Kot("imie"));
        map.put("imie3", new Kot("imie"));
        map.put("imie4", new Kot("imie"));
        map.put("imie5", new Kot("imie"));
        map.put("imie6", new Kot("imie"));
        map.put("imie7", new Kot("imie"));
        map.put("imie8", new Kot("imie"));
        map.put("imie9", new Kot("imie"));

        return map;
    }

    public static Set<Kot> konwertujMapDoSet(Map<String, Kot> mapa) {
        //tutaj wpisz swój kod
        Set<Kot> set = new HashSet<>(mapa.values());

        return set;
    }

    public static void printSetKotow(Set<Kot> set) {
        for (Kot kot : set) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;

        public Kot(String imie) {
            this.imie = imie;
        }

        public String toString() {
            return "Kot " + this.imie;
        }
    }


}
