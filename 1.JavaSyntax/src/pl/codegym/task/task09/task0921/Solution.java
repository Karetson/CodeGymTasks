package pl.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Metoda w try-catch
*/

public class Solution {
    public static void main(String[] args) {
        czytajDane();
    }

    public static void czytajDane() {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        try {
            for (int i = 0; ; i++) {
                int a = Integer.parseInt(reader.readLine());
                list.add(a);
            }
        } catch (NumberFormatException e) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (IOException e) {

        }
    }
}
