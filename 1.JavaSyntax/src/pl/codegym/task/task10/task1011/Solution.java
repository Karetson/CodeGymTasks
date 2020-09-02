package pl.codegym.task.task10.task1011;

/* 
Dużo pieniędzy
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String s = "Wcale nie chcę uczyć się Javy. Chcę tylko dużo pieniędzy";

        //tutaj wpisz swój kod
        char[] charArray = s.toCharArray();

        for (int i = 0; i < 48; i++) {
            System.out.println(Arrays.copyOfRange(charArray, i, charArray.length));
        }
    }

}

