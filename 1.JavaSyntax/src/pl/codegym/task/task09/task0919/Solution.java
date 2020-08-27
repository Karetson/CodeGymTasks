package pl.codegym.task.task09.task0919;

/* 
Dzielenie przez zero
*/

public class Solution {

    public static void main(String[] args) {
        try {
            dzielimyPrzezZero();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static void dzielimyPrzezZero() {
        int a = 3;
        int result = a/0;

        System.out.println(result);
    }
}
