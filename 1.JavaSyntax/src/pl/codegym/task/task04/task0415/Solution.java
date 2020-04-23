package pl.codegym.task.task04.task0415;

/* 
Zasada trójkąta
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        int najdluzszy;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String liczba1 = reader.readLine();
        String liczba2 = reader.readLine();
        String liczba3 = reader.readLine();
        int a = Integer.parseInt(liczba1);
        int b = Integer.parseInt(liczba2);
        int c = Integer.parseInt(liczba3);

        if (c < (a + b) && a < (b + c) && b < (a + c)){
            System.out.println("Da się zbudować trójkąt.");
        } else {
            System.out.println("Nie da się zbudować trójkąta.");
        }
    }
}