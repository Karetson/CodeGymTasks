package pl.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Samotne tablice oddziałują na siebie
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        String[] tab1 = new String[10];
        int[] tab2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int id = 0;
        char temp;

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = reader.readLine();
        }

        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = tab1[i].length();
            System.out.println(tab2[i]);
            }
        }
    }
