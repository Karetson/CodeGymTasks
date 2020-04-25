package pl.codegym.task.task04.task0421;

/* 
Jola czy Jola?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        String imie1 = scanner.nextLine();
        String imie2 = scanner.nextLine();

        if (imie1.equals(imie2))
            System.out.println("Imiona są identyczne");
            else if (imie1.length() == imie2.length())
            System.out.println("Imiona są takiej samej długości");
                else {
        }
    }
}
