package pl.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Granie w Javarellę
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        ArrayList<Integer> list1 = new ArrayList<Integer>();    //GŁÓWNA
        ArrayList<Integer> list2 = new ArrayList<Integer>();    //%3
        ArrayList<Integer> list3 = new ArrayList<Integer>();    //%2
        ArrayList<Integer> list4 = new ArrayList<Integer>();    //OTHERS
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list1.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 3 == 0) {
                list2.add(list1.get(i));
                if (list1.get(i) % 3 == 0 && list1.get(i) % 2 == 0)
                    list3.add(list1.get(i));
            } else if (list1.get(i) % 2 == 0) {
                list3.add(list1.get(i));
                if (list1.get(i) % 3 == 0 && list1.get(i) % 2 == 0)
                    list2.add(list1.get(i));
            }
             else
                list4.add(list1.get(i));

        }
        System.out.println("%3: ");
        printLista(list2);
        System.out.println("%2: ");
        printLista(list3);
        System.out.println("Others: ");
        printLista(list4);
    }

    public static void printLista(List<Integer> lista) {
        //tutaj wpisz swój kod
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }


    }
}
