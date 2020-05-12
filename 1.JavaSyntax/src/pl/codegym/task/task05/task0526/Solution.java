package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Mezczyzna mezczyzna = new Mezczyzna("Robert", 27, "Rzeszów");
        Mezczyzna mezczyzna1 = new Mezczyzna("Robertt", 27, "Rzeszów");
        System.out.println(mezczyzna.imie + " " + mezczyzna.wiek + " " + mezczyzna.adres);
        System.out.println(mezczyzna1.imie + " " + mezczyzna1.wiek + " " + mezczyzna1.adres);
        Kobieta kobieta = new Kobieta("Ola", 30, "Jarosław");
        Kobieta kobieta1 = new Kobieta("Olaa", 30, "Jarosław");
        System.out.println(kobieta.imie + " " + kobieta.wiek + " " + kobieta.adres);
        System.out.println(kobieta1.imie + " " + kobieta1.wiek + " " + kobieta1.adres);
    }

    //tutaj wpisz swój kod
    public static class Mezczyzna {
        String imie;
        int wiek;
        String adres;

        public Mezczyzna(String imie) {
            this.imie = imie;
        }

        public Mezczyzna(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }

        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }
    }

    public static class Kobieta {
        String imie;
        int wiek;
        String adres;

        public Kobieta(String imie) {
            this.imie = imie;
        }

        public Kobieta(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }

        public Kobieta(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }
    }
}
