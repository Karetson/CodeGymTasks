package pl.codegym.task.task04.task0428;

/* 
Liczba dodatnia
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
        int result = 0;

        if (a > 0)
            result++;
        if (b > 0)
            result++;
        if (c > 0)
            result++;
        if ((a <= 0) && (b <= 0) && (c <= 0))
            result = 0;

        System.out.println(result);
    }
}
