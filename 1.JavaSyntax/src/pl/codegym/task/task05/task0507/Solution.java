package pl.codegym.task.task05.task0507;

/* 
Średnia arytmetyczna
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        float licznik = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            float a = scanner.nextInt();
            if (a == -1) {
                System.out.println(licznik/i);
                break;
            }
            i++;
            licznik = licznik + a;
        }
    }
}

