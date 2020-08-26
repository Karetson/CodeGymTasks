package pl.codegym.task.task09.task0905;

/* 
Krok po kroku po śladach stosu...
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int glebokosc = getGlebokoscStosu();
    }

    public static int getGlebokoscStosu() {
        // tutaj wpisz swój kod
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int count = 0;
        for (StackTraceElement e : elements) {
            count++;
        }

        System.out.println(count);

        return count;
    }
}

