package pl.codegym.task.task04.task0412;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String liczba = reader.readLine();
    int iLiczba = Integer.parseInt(liczba);

    if (iLiczba > 0) {
        System.out.println(iLiczba * 2);
    } else if (iLiczba < 0) {
        System.out.println(iLiczba + 1);
    } else {
        System.out.println(iLiczba);
    }
    }
}