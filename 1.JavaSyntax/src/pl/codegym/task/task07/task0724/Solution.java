package pl.codegym.task.task07.task0724;

/* 
Spis członków rodziny
*/

public class Solution {
    public static void main(String[] args) {
        // tutaj wpisz swój kod
        Ludzie dziadek1 = new Ludzie("Józef", true, 87);
        Ludzie dziadek2 = new Ludzie("Jan", true, 82);
        Ludzie babcia1 = new Ludzie("Józefa", false, 78);
        Ludzie babcia2 = new Ludzie("Janina", false, 80);
        Ludzie ktos1 = new Ludzie("Janina", false, 80, dziadek1, babcia1);
        Ludzie ktos2 = new Ludzie("Janina", false, 80, dziadek1, babcia1);
        Ludzie ktos3 = new Ludzie("Janina", false, 80, dziadek1, babcia1);
        Ludzie ktos4 = new Ludzie("Janina", false, 80, dziadek1, babcia1);
        Ludzie ktos5 = new Ludzie("Janina", false, 80, dziadek1, babcia1);

        System.out.println(dziadek1);
        System.out.println(dziadek2);
        System.out.println(babcia1);
        System.out.println(babcia2);
        System.out.println(ktos1);
        System.out.println(ktos2);
        System.out.println(ktos3);
        System.out.println(ktos4);
        System.out.println(ktos5);
    }

    public static class Ludzie {
        // tutaj wpisz swój kod
        String imie;
        boolean plec;
        int wiek;
        Ludzie ojciec;
        Ludzie matka;

        public Ludzie(String imie, boolean plec, int wiek, Ludzie ojciec, Ludzie matka) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.ojciec = ojciec;
            this.matka = matka;
        }

        public Ludzie(String imie, boolean plec, int wiek) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            if (this.ojciec != null)
                tekst += ", ojciec: " + this.ojciec.imie;

            if (this.matka != null)
                tekst += ", matka: " + this.matka.imie;

            return tekst;
        }
    }
}