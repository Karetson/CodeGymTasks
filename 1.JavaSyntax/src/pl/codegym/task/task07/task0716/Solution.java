package pl.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R czy L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("rosa"); // 0
        lista.add("luz"); // 1
        lista.add("lira"); // 2
        lista = napraw(lista);

        for (String s : lista) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> napraw(ArrayList<String> lista) {
        // tutaj wpisz swój kod
        ArrayList<String> newList = new ArrayList<String>(lista);

        for(int i = 0; i < newList.size(); i++) {
            if (newList.get(i).contains("r") && !newList.get(i).contains("l")) {
                lista.remove(newList.get(i));
            }
            else if (!newList.get(i).contains("r") && newList.get(i).contains("l")) {
                lista.add(newList.get(i));
            }
        }
        return lista;
    }
}