package pl.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Przestawiono w samą porę
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lista = new ArrayList<String>();

        //tutaj wpisz swój kod
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            lista.add(reader.readLine());
        }

        for (int j = 0; j < M; j++) {
            lista.add(lista.get(0));
            lista.remove(0);
        }

        for (String a : lista) {
            System.out.println(a);
        }
    }
}
