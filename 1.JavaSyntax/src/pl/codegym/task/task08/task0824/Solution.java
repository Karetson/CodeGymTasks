package pl.codegym.task.task08.task0824;

/* 
Załóż rodzinę
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        ArrayList<Ludzie> ludzie = new ArrayList<>();
        ArrayList<Ludzie> dzieci = new ArrayList<>();

        Ludzie dziecko1 = new Ludzie("Imie", false, 15, new ArrayList<>());
        Ludzie dziecko2 = new Ludzie("Imie", true, 15, new ArrayList<>());
        Ludzie dziecko3 = new Ludzie("Imie", false, 15, new ArrayList<>());
        dzieci.add(dziecko1);
        dzieci.add(dziecko2);
        dzieci.add(dziecko3);
        Ludzie matka = new Ludzie("Imie", false, 55, dzieci);
        Ludzie ojciec = new Ludzie("Imie", true, 55, dzieci);
        Ludzie dziadek1 = new Ludzie("Imie", true, 90, new ArrayList<>(Arrays.asList(matka)));
        Ludzie dziadek2 = new Ludzie("Imie", true, 90, new ArrayList<>(Arrays.asList(ojciec)));
        Ludzie babcia1 = new Ludzie("Imie", false, 85, new ArrayList<>(Arrays.asList(matka)));
        Ludzie babcia2 = new Ludzie("Imie", false, 85, new ArrayList<>(Arrays.asList(ojciec)));

        ludzie.add(dziecko1);
        ludzie.add(dziecko2);
        ludzie.add(dziecko3);
        ludzie.add(matka);
        ludzie.add(ojciec);
        ludzie.add(dziadek1);
        ludzie.add(dziadek2);
        ludzie.add(babcia1);
        ludzie.add(babcia2);

        for (Ludzie a : ludzie) {
            System.out.println(a);
        }
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
