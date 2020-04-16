package pl.codegym.task.task03.task0319;

/* 
Prognozy
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String imie = reader.readLine();
        String liczba1 = reader.readLine();
        String liczba2 = reader.readLine();
        int iLiczba1 = Integer.parseInt(liczba1);
        int iLiczba2 = Integer.parseInt(liczba2);

        System.out.println(imie + " dostanie " + liczba1 + " za " + liczba2 + " lat.");
    }
}
