package pl.codegym.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Koci kod się nie kompiluje
*/

public class Solution {

    public final static ArrayList<Kot> koty = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String imie = reader.readLine();

            if (imie == null || imie.isEmpty() || imie.equals(null))
                break;

            int wiek = Integer.parseInt(reader.readLine());
            int waga = Integer.parseInt(reader.readLine());
            int dlugoscOgona = Integer.parseInt(reader.readLine());

            Kot kot = new Kot(imie, wiek, waga, dlugoscOgona);
            koty.add(kot);
        }

        printLista();
    }

    public static void printLista() {
        for (Kot kot : koty) {
            System.out.println(kot);
        }
    }

    public static class Kot {
        private String imie;
        private int wiek;
        private int waga;
        private int dlugoscOgona;

        Kot(String imie, int wiek, int waga, int dlugoscOgona) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.dlugoscOgona = dlugoscOgona;
        }

        @Override
        public String toString() {
            return "Imię kota: " + imie + ", wiek: " + wiek + ", waga: " + waga + ", ogon: " + dlugoscOgona;
        }
    }
}