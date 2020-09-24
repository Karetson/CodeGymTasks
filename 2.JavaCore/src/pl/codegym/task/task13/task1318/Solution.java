package pl.codegym.task.task13.task1318;

import java.io.*;

/* 
Wczytywanie pliku
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // tutaj wpisz swój kod
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath = br.readLine();
        InputStream inputStream = new FileInputStream(filePath);
        BufferedReader bf = new BufferedReader(new InputStreamReader(inputStream));
        String data;

        while ((data = bf.readLine()) != null) {
            System.out.println(data);
        }

        inputStream.close();
        br.close();
        bf.close();
    }
}