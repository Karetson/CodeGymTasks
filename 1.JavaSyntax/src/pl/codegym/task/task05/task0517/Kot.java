package pl.codegym.task.task05.task0517;

/* 
Tworzenie kotów
*/

public class Kot {
    //tutaj wpisz swój kod
    String imie;
    int wiek;
    int waga;
    String adres;
    String kolor;

    public Kot(String imie) {
        this.imie = imie;
        wiek = 6;
        waga = 6;
        kolor = "czarny";
    }

    public Kot(String imie, int waga, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
        kolor = "czarny";
    }

    public Kot(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        waga = 6;
        kolor = "czarny";
    }

    public Kot(int waga, String kolor) {
        this.waga = waga;
        this.kolor = kolor;
        wiek = 6;
    }

    public Kot(int waga, String kolor, String adres) {
        this.waga = waga;
        this.adres = adres;
        this.kolor = kolor;
        wiek = 6;
    }

    public static void main(String[] args) {

    }
}
