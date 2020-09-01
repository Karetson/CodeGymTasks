package pl.codegym.task.task10.task1006;

/* 
Zadanie nr 6 z konwersją typu int
*/

public class Solution {
    public static void main(String[] args) {
        double d = (short) 2.50256e2d; //250.0
        char c = (short) 'd'; // d
        short s = (short) 2.22; // 2
        int i = 150000; // 18928
        float f = 0.50f; // 0.0
        double wynik = f + (i / c) - (d * s) - 500e-3; // 0.0 + (189) - (500) - 0.5
        System.out.println("wynik: " + wynik);
    }
}