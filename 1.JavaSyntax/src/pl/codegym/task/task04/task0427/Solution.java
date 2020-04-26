package pl.codegym.task.task04.task0427;

/* 
Opisywanie liczb
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ((a < 1) || (a > 999)) {

        } else if ((a % 2 == 0) && (a < 10))
            System.out.println("parzysta liczba jednocyfrowa");
        else if ((a % 2 != 0) && (a < 10))
            System.out.println("nieparzysta liczba jednocyfrowa");
        else if ((a % 2 == 0) && (a > 9) && (a < 100))
            System.out.println("parzysta liczba dwucyfrowa");
        else if ((a % 2 != 0) && (a > 9) && (a < 100))
            System.out.println("nieparzysta liczba dwucyfrowa");
        else if ((a % 2 == 0) && (a > 99) && (a < 1000))
            System.out.println("parzysta liczba trzycyfrowa");
        else if ((a % 2 != 0) && (a > 99) && (a < 1000))
            System.out.println("nieparzysta liczba trzycyfrowa");
    }
}
