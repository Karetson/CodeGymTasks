package pl.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Numer miesiąca
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nr = 0;
        String month = reader.readLine();
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Styczeń");
        hashMap.put(2, "Luty");
        hashMap.put(3, "Marzec");
        hashMap.put(4, "Kwiecień");
        hashMap.put(5, "Maj");
        hashMap.put(6, "Czerwiec");
        hashMap.put(7, "Lipiec");
        hashMap.put(8, "Sierpień");
        hashMap.put(9, "Wrzesień");
        hashMap.put(10, "Październik");
        hashMap.put(11, "Listopad");
        hashMap.put(12, "Grudzień");

        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
            if (e.getValue().equals(month)) {
                nr = e.getKey();
            }
        }

        System.out.println(month + " to miesiąc nr " + nr);
    }
}
