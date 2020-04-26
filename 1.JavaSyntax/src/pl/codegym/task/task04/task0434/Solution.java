package pl.codegym.task.task04.task0434;


/* 
Tabliczka mnożenia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int a = 1;
        int b = 1;

        while ((a < 11) && (b < 11)){
            System.out.print(a*b + " ");
            a++;
            if (a == 11) {
                System.out.println(" ");
                a = 1;
                b++;
            }
            }
        }
    }
