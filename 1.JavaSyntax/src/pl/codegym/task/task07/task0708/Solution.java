package pl.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Najdłuższy ciąg
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp1 = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > temp1) {
                temp1 = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == temp1) {
                System.out.println(strings.get(i));
            }
        }
    }
}
