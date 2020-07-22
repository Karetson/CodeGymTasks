package pl.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Sprawdzanie kolejności
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        ArrayList<String> lista = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            lista.add(reader.readLine());
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).length() < lista.get(i+1).length() && i == lista.size()-2) {
                break;
            } else if (lista.get(i).length() > lista.get(i+1).length()){
                System.out.println(i+1);
                break;
            }
        }
    }
}

