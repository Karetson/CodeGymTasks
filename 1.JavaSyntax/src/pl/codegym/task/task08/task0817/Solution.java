package pl.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Powtórzenia nie są potrzebne
*/

public class Solution {
    public static HashMap<String, String> utworzMap() {
        //tutaj wpisz swój kod
        HashMap<String, String> map = new HashMap<>();

        map.put("Nazwisko", "Imie");
        map.put("Nazwisko1", "Imie1");
        map.put("Nazwisko2", "Imie");
        map.put("Nazwisko3", "Imie2");
        map.put("Nazwisko4", "Imie");
        map.put("Nazwisko5", "Imie");
        map.put("Nazwisko6", "Imie");
        map.put("Nazwisko7", "Imie1");
        map.put("Nazwisko8", "Imie");
        map.put("Nazwisko9", "Imie5");

        return map;
    }

    public static void usunPowtorzoneImiona(Map<String, String> mapa) {
        //tutaj wpisz swój kod
        HashMap<String, String> copied = new HashMap<String, String>(mapa);

        for (Map.Entry<String, String> c : copied.entrySet()) {
            String k1 = c.getKey();
            String v1 = c.getValue();
            for (Map.Entry<String, String> s : copied.entrySet()) {
                String k2 = s.getKey();
                String v2 = s.getValue();
                if (v2.equals(v1) && !k2.equals(k1)) {
                    usunElementZMapPoWartosci(mapa, v2);
                }
            }
        }

    }

    public static void usunElementZMapPoWartosci(Map<String, String> mapa, String wartosc) {
        HashMap<String, String> kopia = new HashMap<String, String>(mapa);
        for (Map.Entry<String, String> para : kopia.entrySet()) {
            if (para.getValue().equals(wartosc))
                mapa.remove(para.getKey());
        }
    }

    public static void main(String[] args) {
        utworzMap();
        usunPowtorzoneImiona(utworzMap());
    }
}
