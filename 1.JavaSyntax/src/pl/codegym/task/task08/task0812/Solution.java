package pl.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Najdłuższa sekwencja
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = 1;
        int temp = 0;
        int seq = 0;

        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                count++;
            } else {
                if (temp < count) {
                    temp = count;
                }
                count = 1;
            }
            seq = Math.max(temp, count);
        }
        System.out.println(seq);
    }
}