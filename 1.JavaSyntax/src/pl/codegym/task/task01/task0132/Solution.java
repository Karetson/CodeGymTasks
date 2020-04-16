package pl.codegym.task.task01.task0132;

/* 
Suma cyfr trzycyfrowej liczby
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumaCyfrLiczby(546));
    }

    public static int sumaCyfrLiczby(int liczba) {
        //tutaj wpisz swój kod
        int a = liczba/100;
        int b = (liczba/10)%10;
        int c = liczba%10;
        return a + b + c;
    }
}