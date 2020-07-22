package pl.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Najkrótszy czy najdłuższy
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<String> lista = new ArrayList<>();

        input(lista);
        min(lista);
        max(lista);
        showString(lista);
    }

    public static int min (ArrayList<String> lista) {
        int temp2 = Integer.MAX_VALUE;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() < temp2) {
                temp2 = lista.get(i).length();
            }
        }

        return temp2;
    }

    public static int max (ArrayList<String> lista) {
        int temp1 = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() > temp1) {
                temp1 = lista.get(i).length();
            }
        }

        return temp1;
    }

    public static void input (ArrayList<String> lista) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            lista.add(reader.readLine());
        }
    }

    public static void showString (ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() ==  max(lista) || lista.get(i).length() == min(lista)) {
                System.out.println(lista.get(i));
                break;
            }
        }
    }
}
