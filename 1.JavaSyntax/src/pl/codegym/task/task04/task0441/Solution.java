package pl.codegym.task.task04.task0441;


/* 
Jakiś taki przeciętny
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (((a <= b) && (c >= b)) || (a >= b) && (c <= b)) {
            System.out.println(b);
        } else if (((b <= a) && (c >= a)) || (b >= a) && (c <= a)){
            System.out.println(a);
        } else if (((a <= c) && (b >= c)) || (a >= c) && (b <= c)) {
            System.out.println(c);
        }
    }
}
