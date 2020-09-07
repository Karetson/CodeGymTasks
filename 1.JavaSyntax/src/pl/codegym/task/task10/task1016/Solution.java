package pl.codegym.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Identyczne wyrazy na liście
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> slowa = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            slowa.add(reader.readLine());
        }

        Map<String, Integer> mapa = liczSlowa(slowa);

        for (Map.Entry<String, Integer> para : mapa.entrySet()) {
            System.out.println(para.getKey() + " " + para.getValue());
        }
    }

    public static Map<String, Integer> liczSlowa(ArrayList<String> lista) {
        HashMap<String, Integer> wynik = new HashMap<String, Integer>();

        //tutaj wpisz swój kod
/*        for (int i = 0; i < lista.size(); i++) {
            wynik.put(lista.get(i), Collections.frequency(lista, lista.get(i)));
        }*/

        for (String s : lista) {
            wynik.put(s, Collections.frequency(lista, s));
        }

        return wynik;
    }

}


