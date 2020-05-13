package pl.codegym.task.task06.task0611;

/* 
Klasa StringHelper
*/

import org.w3c.dom.ls.LSOutput;

public class StringHelper {
    public static String multiply(String s) {
        String wynik = "";
        //tutaj wpisz swój kod
            for (int i = 0; i < 5; i++) {
            wynik = wynik + s;
            }
        return wynik;
        }


    public static String multiply(String s, int licznik) {
        String wynik = "";
        //tutaj wpisz swój kod
            for (int i = 0; i < licznik; i++) {
                wynik += s;
            }
            return wynik;
        }

    public static void main(String[] args) {

    }
}
