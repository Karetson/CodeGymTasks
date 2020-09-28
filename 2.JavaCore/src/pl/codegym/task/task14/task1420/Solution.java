package pl.codegym.task.task14.task1420;

/* 
NWD
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a > 0 && b > 0) {
            System.out.println(NWD(a, b));
        } else {
            throw new Exception();
        }
    }

    public static int NWD (int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return NWD(b, a % b);
        }
    }
}
