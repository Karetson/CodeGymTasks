package pl.codegym.task.task06.task0622;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Liczby w kolejności rosnącej
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] tablica = new int[5];
        //tutaj wpisz swój kod
        input(tablica);
        bubbleSort(tablica);
    }

    public static void input (int tab[]) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < tab.length; i++) {
            int liczba = Integer.parseInt(reader.readLine());
            tab[i] = liczba;
        }
        }

    public static void bubbleSort (int tab[]) {
        int temp;
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                }
            }
        }

        for (int a : tab){
            System.out.println(a);
        }
    }
}
