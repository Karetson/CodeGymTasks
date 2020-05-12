package pl.codegym.task.task05.task0532;

import java.io.*;

/* 
Zadanie z algorytmami
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maksimum = Integer.MIN_VALUE;

        //tutaj wpisz swój kod
        int n = Integer.parseInt(reader.readLine());

        if (n > 0) {
            for (int i = n; i >= 1; i--) {
                int a = Integer.parseInt(reader.readLine());
                if (a > maksimum) {
                    maksimum = a;
                }
            }
            System.out.println(maksimum);
        }
    }
}
