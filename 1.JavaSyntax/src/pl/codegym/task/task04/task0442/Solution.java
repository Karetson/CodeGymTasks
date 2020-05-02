package pl.codegym.task.task04.task0442;


/* 
Dodawanie
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int licznik = 0;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int a = scanner.nextInt();
            licznik = licznik + a;
            if (a == -1) {
                System.out.println(licznik);
                break;
            }
        }
    }
}
