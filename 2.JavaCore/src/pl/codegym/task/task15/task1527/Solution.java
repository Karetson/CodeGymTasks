package pl.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Parser żądań
htp://codegym.cc/alpha/index.html?lvl=15&view&name=Amigo
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();

        String s1 = url.substring(url.indexOf("?") + 1);
        alert(s1);
        String[] s2 = s1.split("&", 0);
        System.out.println(Arrays.asList(s2));

        }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
