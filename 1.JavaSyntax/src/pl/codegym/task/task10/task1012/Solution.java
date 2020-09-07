package pl.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Liczba liter
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alfabet
        String abc = "aąbcćdeęfghijklłmnńoóprsśtuwyzźż";
        char[] abcTablica = abc.toCharArray();

        ArrayList<Character> alfabet = new ArrayList<>();
        for (char litera : abcTablica) {
            alfabet.add(litera);
        }

        // Czyta ciągi
        ArrayList<String> lista = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String s = reader.readLine();
            lista.add(s.toLowerCase());
        }

        // tutaj wpisz swój kod
        ArrayList<Character> tempCharArray = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
           char[] chars = lista.get(i).toCharArray();
            for (char c : chars) {
                tempCharArray.add(c);
            }
        }

        for (int i = 0; i < alfabet.size(); i++) {
            System.out.println(alfabet.get(i) + " " + Collections.frequency(tempCharArray, alfabet.get(i)));
            }
    }
}
