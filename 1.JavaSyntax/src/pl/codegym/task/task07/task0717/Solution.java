package pl.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Duplikowanie słów
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Czyta ciągi z konsoli i deklaruje tutaj ArrayList
        ArrayList<String> lista = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            lista.add(reader.readLine());
        }

        ArrayList<String> wynik = doubleValues(lista);

        // Wyświetla wynik
        for (int i = 0; i < wynik.size(); i++) {
            System.out.println(wynik.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> lista) {
        //tutaj wpisz swój kod
        for (int i = 0; i < 5; i++) {

        }
        return lista;
    }
}
