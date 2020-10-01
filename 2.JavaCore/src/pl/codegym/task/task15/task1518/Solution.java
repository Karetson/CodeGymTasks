package pl.codegym.task.task15.task1518;

/* 
Modyfikatory statyczne i kociaki
*/

public class Solution {
    public static Cat cat;

    static {
        Cat cat1 = new Cat();
        cat = cat1;
        cat1.name = "Alfred";
        System.out.println(cat1.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }
}
