package pl.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Aktualizacja oprogramowania
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lista adresów
        Map<String, String> adresy = new HashMap<>();

        while (true) {
            String key = reader.readLine();
            if (key.isEmpty()) {
                break;
            }
            String value = reader.readLine();
            adresy.put(key, value);
        }

        // Wczytuje numer domu
        String miasto = reader.readLine();

        for (Map.Entry<String, String> e : adresy.entrySet()) {
            String keyMiasto = e.getKey();
            String valueNazwisko = e.getValue();

            if (miasto.equals(keyMiasto)) {
                System.out.println(valueNazwisko);
            }
        }
    }
}
