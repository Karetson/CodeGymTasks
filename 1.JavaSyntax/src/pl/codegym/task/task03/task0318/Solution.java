package pl.codegym.task.task03.task0318;

/* 
Plan podboju świata
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String wiek = reader.readLine();
        int iWiek = Integer.parseInt(wiek);
        String imie = reader.readLine();

        System.out.println(imie + " przejmie władzę nad światem za " + wiek + " lat. Mua ha ha!");
    }
}
