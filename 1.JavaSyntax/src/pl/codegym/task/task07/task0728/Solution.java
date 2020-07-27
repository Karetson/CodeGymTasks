package pl.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
W kolejności malejącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[20];
        for (int i = 0; i < 20; i++) {
            tablica[i] = Integer.parseInt(reader.readLine());
        }

        sortuj(tablica);

        for (int x : tablica) {
            System.out.println(x);
        }
    }

    public static void sortuj(int[] tablica) {
        //tutaj wpisz swój kod
        int temp;

        for (int j = 0; j < tablica.length - 1; j++) {
            for (int i = 0; i < tablica.length - 1; i++) {
                if (tablica[i] < tablica[i + 1]) {
                    temp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = temp;
                }
            }
        }
    }
}