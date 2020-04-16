package pl.codegym.task.task03.task0303;

/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        System.out.println(konwertujEurNaUsd(5,2.3));
        System.out.println(konwertujEurNaUsd(8,1.9));
    }

    public static double konwertujEurNaUsd(int eur, double kursWymiany) {
        //tutaj wpisz swój kod
        return eur*kursWymiany;
    }
}
