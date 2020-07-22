package pl.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ulice i domy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int[] tab = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count1 = 0;
        int temp;
        int count2 = 0;

        for (int i = 0; i < tab.length; i++) {
            String x = reader.readLine();
            tab[i] = Integer.parseInt(x);
        }

        for (int i = 0; i < tab.length; i++) {
            if (i == 0 || i%2 == 0) {
                temp = tab[i];
                count1 += temp;
            }
            else {
                temp = tab[i];
                count2 += temp;
            }
        }

        if (count1 > count2)
            System.out.println("Więcej ludzi mieszka w domach o parzystych numerach.");
        else
            System.out.println("Więcej ludzi mieszka w domach o nieparzystych numerach.");
    }
}
