package pl.codegym.task.task06.task0613;

/* 
Kot i statyczne
*/

public class Solution {
    public static void main(String[] args) {
        // Tworzy 10 kotów
        Kot kot1 = new Kot();
        Kot kot2 = new Kot();
        Kot kot3 = new Kot();
        Kot kot4 = new Kot();
        Kot kot5 = new Kot();
        Kot kot6 = new Kot();
        Kot kot7 = new Kot();
        Kot kot8 = new Kot();
        Kot kot9 = new Kot();
        Kot kot10 = new Kot();
        // Wyświetla wartość zmiennej licznikKotow
        System.out.println(Kot.licznikKotow);
    }

    public static class Kot {
        // Tworzy zmienną statyczną licznikKotow
        public static int licznikKotow = 0;

        // Deklaruje konstruktor

        public Kot() {
            licznikKotow++;
        }
    }
}
