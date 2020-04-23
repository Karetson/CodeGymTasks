package pl.codegym.task.task04.task0414;

/* 
Liczba dni w roku
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String iLiczba = reader.readLine();
        int rok = Integer.parseInt(iLiczba);

        if (rok % 400 == 0) {
            System.out.println("Liczba dni w roku: 366");
        } else if (rok % 100 == 0) {
            System.out.println("Liczba dni w roku: 365");
        } else if (rok % 4 == 0) {
            System.out.println("Liczba dni w roku: 366");
        } else {
            System.out.println("Liczba dni w roku: 365");
        }
    }
}