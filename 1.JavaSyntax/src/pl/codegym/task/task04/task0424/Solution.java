package pl.codegym.task.task04.task0424;

/* 
Trzy liczby
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

        if ((a == b) && (b != c))
            System.out.println(3);
        else if ((b == c) && (a != c))
            System.out.println(1);
        else if ((a == c) && (b != a))
            System.out.println(2);
        else {

        }
    }
}
