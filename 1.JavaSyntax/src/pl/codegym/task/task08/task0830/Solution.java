package pl.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tablica = new String[20];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = reader.readLine();
        }

        sortuj(tablica);

        for (String x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(String[] tablica) {
    //tutaj wpisz swój kod
        Arrays.sort(tablica);
        String a = tablica[0];
        String b = tablica[tablica.length - 1];
        isWiekszeOd(a, b);
    }

    // Metoda porównywania ciągów: 'a' jest większe niż 'b'
    public static boolean isWiekszeOd(String a, String b) {
        return a.compareTo(b) > 0;
    }
    }
