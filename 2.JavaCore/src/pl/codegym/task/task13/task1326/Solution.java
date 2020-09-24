package pl.codegym.task.task13.task1326;

/* 
Sortowanie liczb parzystych z pliku
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader inputFile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        List<Integer> list = new ArrayList<>();
        String data;

        while ((data = inputFile.readLine()) != null) {
            int number = Integer.parseInt(data);
            if (number % 2 == 0) {
                list.add(number);
            }
        }

        list.sort(Comparator.naturalOrder());

        for (Integer e : list) {
            System.out.println(e);
        }

        inputFile.close();
    }
}
