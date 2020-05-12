package pl.codegym.task.task05.task0510;

/* 
Inicjalizowanie kotów
*/

public class Kot {
    //tutaj wpisz swój kod
    String imie;
    int wiek;
    int waga;
    String adres;
    String kolor;

    public void inicjalizuj (String imie) {
        this.imie = imie;
        wiek = 4;
        waga = 6;
        kolor = "czarny";
    }

    public void inicjalizuj (String imie, int waga, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        this.waga = waga;
        kolor = "czarny";
    }

    public void inicjalizuj (String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
        waga = 6;
        kolor = "czarny";
    }

    public void inicjalizuj (int waga, String kolor) {
        wiek = 6;
        this.waga = waga;
        this.kolor = kolor;
    }

    public void inicjalizuj (int waga, String kolor, String adres) {
        wiek = 6;
        this.waga = waga;
        this.kolor = kolor;
        this.adres = adres;
    }

    public static void main(String[] args) {

    }
}
