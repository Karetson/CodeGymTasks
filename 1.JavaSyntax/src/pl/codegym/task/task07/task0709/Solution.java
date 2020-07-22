package pl.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Mów zwięźle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> list1 = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int temp1 = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            list1.add(reader.readLine());
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).length() <= temp1) {
                temp1 = list1.get(i).length();
            }
        }

        for (int j = 0; j < list1.size(); j++) {
            if (list1.get(j).length() == temp1) {
                System.out.println(list1.get(j));
            }
        }
    }
}
