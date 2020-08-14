package pl.codegym.task.task08.task0823;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Ruszamy na cały kraj
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //tutaj wpisz swój kod
        char[] chars = s.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                if (foundSpace) {
                    chars[i] = Character.toUpperCase(chars[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        s = String.valueOf(chars);
        System.out.println(s);
    }
}
