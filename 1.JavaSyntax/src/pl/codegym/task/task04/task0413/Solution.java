package pl.codegym.task.task04.task0413;

/* 
Dzień tygodnia
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dzien = reader.readLine();
        int iDzien = Integer.parseInt(dzien);

        if (iDzien == 1) {
            System.out.println("Poniedziałek");
        } else if (iDzien == 2) {
            System.out.println("Wtorek");
        } else if (iDzien == 3) {
            System.out.println("Środa");
        } else if (iDzien == 4) {
            System.out.println("Czwartek");
        } else if (iDzien == 5) {
            System.out.println("Piątek");
        } else if (iDzien == 6) {
            System.out.println("Sobota");
        } else if (iDzien == 7) {
            System.out.println("Niedziela");
        } else {
            System.out.println("Nie ma takiego dnia tygodnia");
        }
    }
}