package pl.codegym.task.task08.task0819;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* 
Koci Set
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();

        //tutaj wpisz swój kod. krok 3
        for (Kot s : koty) {
            koty.remove(s);
            break;
        }

        printKoty(koty);
    }

    public static Set<Kot> utworzKoty() {
        //tutaj wpisz swój kod. krok 2
        Set<Kot> cats = new HashSet<>();
        cats.add(new Kot());
        cats.add(new Kot());
        cats.add(new Kot());
        return cats;
    }

    public static void printKoty(Set<Kot> koty) {
        // krok 4
        koty.forEach(System.out::println);
    }

    // krok 1
    public static class Kot {
        public Kot() {
        }
    }
}
