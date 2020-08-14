package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        ArrayList<Ludzie> dziadkowie = new ArrayList<>();
        ArrayList<Ludzie> babcie = new ArrayList<>();
        ArrayList<Ludzie> rodzice = new ArrayList<>();
        ArrayList<Ludzie> dzieci = new ArrayList<>();

        Ludzie dziadek1 = new Ludzie("Imie", true, 90, rodzice);
        Ludzie dziadek2 = new Ludzie("Imie", true, 90, rodzice);
        Ludzie babcia1 = new Ludzie("Imie", false, 85, rodzice);
        Ludzie babcia2 = new Ludzie("Imie", false, 85, rodzice);
        Ludzie matka = new Ludzie("Imie", false, 85, dzieci);
        Ludzie ojciec = new Ludzie("Imie", true, 85, dzieci);
        Ludzie dziecko1 = new Ludzie("Imie", false, 85, null);
        Ludzie dziecko2 = new Ludzie("Imie", true, 85, null);
        Ludzie dziecko3 = new Ludzie("Imie", false, 85, null);


    }

    public static class Ludzie {
        //tutaj wpisz swój kod
        String imie;
        boolean plec;
        int wiek;
        ArrayList<Ludzie> dzieci;

        public Ludzie(String imie, boolean plec, int wiek, ArrayList<Ludzie> dzieci) {
            this.imie = imie;
            this.plec = plec;
            this.wiek = wiek;
            this.dzieci = dzieci;
        }

        public String toString() {
            String tekst = "";
            tekst += "Imię: " + this.imie;
            tekst += ", płeć: " + (this.plec ? "mężczyzna" : "kobieta");
            tekst += ", wiek: " + this.wiek;

            int licznikDzieci = this.dzieci.size();
            if (licznikDzieci > 0) {
                tekst += ", dzieci: " + this.dzieci.get(0).imie;

                for (int i = 1; i <licznikDzieci; i++) {
                    Ludzie dziecko = this.dzieci.get(i);
                    tekst += ", " + dziecko.imie;
                }
            }
            return tekst;
        }
    }
}
