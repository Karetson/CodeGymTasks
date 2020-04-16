package pl.codegym.task.task03.task0307;

/* 
Witaj, StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.imie = "Olcia";
        zerg2.imie = "Olci";
        zerg3.imie = "Olc";
        zerg4.imie = "Ol";
        zerg5.imie = "O";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        protoss1.imie = "Robert";
        protoss2.imie = "Robe";
        protoss3.imie = "Rob";

        Terranin terranin1 = new Terranin();
        Terranin terranin2 = new Terranin();
        Terranin terranin3 = new Terranin();
        Terranin terranin4 = new Terranin();
        terranin1.imie = "Maciek";
        terranin2.imie = "Maci";
        terranin3.imie = "Maek";
        terranin4.imie = "iek";
    }

    public static class Zerg {
        public String imie;
    }

    public static class Protoss {
        public String imie;
    }

    public static class Terranin {
        public String imie;
    }
}
