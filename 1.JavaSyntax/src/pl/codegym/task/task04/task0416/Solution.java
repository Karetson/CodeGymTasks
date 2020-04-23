package pl.codegym.task.task04.task0416;

/* 
Przejście przez ulicę na oślep
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner in = new Scanner(System.in);
        float t = in.nextFloat();

        if (t % 5 >= 0 && t % 5 < 3) {
            System.out.println("zielone");
        } else if (t % 5 >= 3 && t % 5 < 4) {
            System.out.println("żółte");
        } else {
            System.out.println("czerwone");
        }
    }
}