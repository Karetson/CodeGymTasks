package pl.codegym.task.task06.task0609;

/* 
Odległość między dwoma punktami
*/

import org.w3c.dom.ls.LSOutput;

public class Util {

    public static double getOdleglosc(int x1, int y1, int x2, int y2) {
        //tutaj wpisz swój kod
        return Math.sqrt(Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2)));
    }

    public static void main(String[] args) {
    }
}
