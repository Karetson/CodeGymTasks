package pl.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Jedna wielka tablica i dwie małe
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int[] tab1 = new int[20];
        int[] tab2 = new int[10];
        int[] tab3 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < tab1.length; i++) {
            String x = reader.readLine();
            tab1[i] = Integer.parseInt(x);
        }

        System.arraycopy(tab1, 0, tab2, 0, tab2.length);
        System.arraycopy(tab1, tab3.length, tab3, 0, tab3.length);

        for (int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i]);
        }
    }
}
