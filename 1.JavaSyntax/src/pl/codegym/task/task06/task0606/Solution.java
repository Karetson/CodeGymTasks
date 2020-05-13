package pl.codegym.task.task06.task0606;

import org.w3c.dom.ls.LSOutput;

import java.io.*;

/* 
Cyfry parzyste i nieparzyste
*/

public class Solution {

    public static int parzyste = 0;
    public static int nieparzyste = 0;

    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        while (n > 0) {
            if (n % 2 == 0) {
                parzyste++;
                n = n/10;
            } else {
                nieparzyste++;
                n = n/10;
            }
        }

        System.out.println("Parzyste: " + parzyste + " Nieparzyste: " + nieparzyste);
    }
}
