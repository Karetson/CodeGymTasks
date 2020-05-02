package pl.codegym.task.task05.task0502;

/* 
Zaimplementuj metodę walka
*/

import javafx.scene.effect.InnerShadow;

public class Kot {

    public int wiek;
    public int waga;
    public int sila;

    public Kot() {
    }

    public boolean walka(Kot innyKot) {
        //tutaj wpisz swój kod
        if ((this.wiek > innyKot.wiek) || (this.waga > innyKot.waga) || (this.sila > innyKot.sila)) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Kot kot1 = new Kot();
        Kot kot2 = new Kot();

        kot1.wiek = 3;
        kot1.waga = 5;
        kot1.sila = 7;

        kot2.wiek = 2;
        kot2.waga = 4;
        kot2.sila = 5;
    }
}
