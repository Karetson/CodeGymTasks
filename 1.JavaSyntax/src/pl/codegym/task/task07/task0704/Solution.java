package pl.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Odwróć tablicę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int[] tab1 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < tab1.length; i++) {
            String s = reader.readLine();
            tab1[i] = Integer.parseInt(s);
        }

        for (int i = tab1.length - 1; i > -1; i--) {
            System.out.println(tab1[i]);
        }
    }
}

