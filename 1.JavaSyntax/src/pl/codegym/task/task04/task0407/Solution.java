package pl.codegym.task.task04.task0407;

/* 
Koty we Wszechświecie
*/

public class Solution {
    public static void main(String[] args) {
        Kot kot1 = new Kot();
        //tutaj wpisz swój kod
        kot1.licznik += + 1;

        Kot kot2 = new Kot();
        //tutaj wpisz swój kod
        kot2.licznik += + 1;

        System.out.println("Liczba kotów to " + Kot.licznik);
    }

    public static class Kot {
        public static int licznik = 0;
    }
}