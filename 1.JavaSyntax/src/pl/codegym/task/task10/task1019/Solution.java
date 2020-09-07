package pl.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Funkcjonalność to nie wszystko!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String imie = reader.readLine();
                map.put(imie, id);

                if (imie.isEmpty()) {
                    break;
                }

            } catch (NumberFormatException e) {
                break;
            }
        }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getValue() + " " + e.getKey());
        }
    }
}
