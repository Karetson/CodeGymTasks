package pl.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Zwierzęcy secik
*/

public class Solution {
    public static void main(String[] args) {
        Set<Kot> koty = utworzKoty();
        Set<Pies> psy = utworzPsy();

        Set<Object> zwierzeta = dolacz(koty, psy);
        printZwierzeta(zwierzeta);

        usunKoty(zwierzeta, koty);
        printZwierzeta(zwierzeta);
    }

    public static Set<Kot> utworzKoty() {
        HashSet<Kot> koty = new HashSet<Kot>();

        //tutaj wpisz swój kod
        koty.add(new Kot());
        koty.add(new Kot());
        koty.add(new Kot());
        koty.add(new Kot());

        return koty;
    }

    public static Set<Pies> utworzPsy() {
        //tutaj wpisz swój kod
        HashSet<Pies> psy = new HashSet<Pies>();
        psy.add(new Pies());
        psy.add(new Pies());
        psy.add(new Pies());

        return psy;
    }

    public static Set<Object> dolacz(Set<Kot> koty, Set<Pies> psy) {
        //tutaj wpisz swój kod
        Set<Object> zwierzeta = new HashSet<>();
        zwierzeta.addAll(koty);
        zwierzeta.addAll(psy);

        return zwierzeta;
    }

    public static void usunKoty(Set<Object> zwierzeta, Set<Kot> koty) {
        //tutaj wpisz swój kod
        zwierzeta.removeIf(s -> s instanceof Kot);
    }

    public static void printZwierzeta(Set<Object> zwierzeta) {
        //tutaj wpisz swój kod
        zwierzeta.forEach(System.out::println);
    }

    //tutaj wpisz swój kod
    public static class Kot {

    }

    public static class Pies {

    }
}
