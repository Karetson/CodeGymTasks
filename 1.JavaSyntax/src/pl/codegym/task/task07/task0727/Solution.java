package pl.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Zmiana funkcjonalności
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            lista.add(s);
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() % 2 == 0) {
                lista.set(i, lista.get(i) + " " + lista.get(i));
            } else {
                lista.set(i, lista.get(i) + " " + lista.get(i) + " " + lista.get(i));
            }
        }

        for (String a : lista) {
            System.out.println(a);
        }
    }
}
