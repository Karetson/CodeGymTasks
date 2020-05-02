package pl.codegym.task.task04.task0443;


/* 
Imię to imię
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        String imie = scanner.nextLine();
        int rrrr = scanner.nextInt();
        int mm = scanner.nextInt();
        int dd = scanner.nextInt();

        System.out.println("Mam na imię " + imie + ".");
        System.out.println("Urodziłem/am się " + mm + "/" + dd + "/" + rrrr);
    }
}
