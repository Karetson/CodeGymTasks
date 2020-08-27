package pl.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
Lista tablic z liczbami
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> lista = utworzLista();
        printLista(lista);
    }

    public static ArrayList<int[]> utworzLista() {
        //tutaj wpisz swój kod
        ArrayList<int[]> list = new ArrayList<>();
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {1, 2};
        int[] thirdArray = {1, 2, 3, 4};
        int[] fourthArray = {1, 2, 3, 4, 5, 6, 7};
        int[] fifthArray = new int[0];

        list.add(firstArray);
        list.add(secondArray);
        list.add(thirdArray);
        list.add(fourthArray);
        list.add(fifthArray);

        return list;
    }

    public static void printLista(ArrayList<int[]> lista) {
        for (int[] tablica : lista) {
            for (int x : tablica) {
                System.out.println(x);
            }
        }
    }
}
