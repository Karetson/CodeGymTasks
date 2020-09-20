package pl.codegym.task.task12.task1229;

/* 
Klasa macierzysta klasy CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public interface Businessman {
        public void workHard();
    }

    public static class Test {
        public void workHard() {

        }
    }

    public static class CTO extends Test implements Businessman {
    }
}
