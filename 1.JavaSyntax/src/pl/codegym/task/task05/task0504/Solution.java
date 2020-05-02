package pl.codegym.task.task05.task0504;

/* 
Trzej Muszkoterowie
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Kot kot1 = new Kot("Robert", 27, 88, 33);
        Kot kot2 = new Kot("Rob", 17, 58, 23);
        Kot kot3 = new Kot("Oet", 7, 38, 13);
    }

    public static class Kot {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }
    }
}