package pl.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Tablica z listami ciągów
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] tablicaCiagowList = utworzList();
        printList(tablicaCiagowList);
    }

    public static ArrayList<String>[] utworzList() {
        //tutaj wpisz swój kod
        ArrayList<String>[] lista = new ArrayList[3];
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        ArrayList<String> s3 = new ArrayList<>();

        s1.add("Siema");
        s1.add("Siema");
        s2.add("Siema");
        s2.add("Siema");
        s3.add("Siema");
        s3.add("Siema");

        lista[0] = s1;
        lista[1] = s2;
        lista[2] = s3;

        return lista;
    }

    public static void printList(ArrayList<String>[] tablicaCiagowList) {
        for (ArrayList<String> lista : tablicaCiagowList) {
            for (String s : lista) {
                System.out.println(s);
            }
        }
    }
}