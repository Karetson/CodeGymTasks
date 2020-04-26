package pl.codegym.task.task04.task0429;

/* 
Liczby dodatnie i ujemne
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int resultA = 0;
        int resultB = 0;

        if (a > 0)
            resultA++;
        else if (a < 0)
            resultB++;
        if (b > 0)
            resultA++;
        else if (b < 0)
            resultB++;
        if (c > 0)
            resultA++;
        else if (c < 0)
            resultB++;
        if ((a == 0) && (b == 0) && (c == 0)) {
            resultA = 0;
            resultB = 0;
        }
        System.out.println("Liczba liczb ujemnych: " + resultB);
        System.out.println("Liczba liczb dodatnich: " + resultA);
    }
}
