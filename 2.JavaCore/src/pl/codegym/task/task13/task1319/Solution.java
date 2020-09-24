package pl.codegym.task.task13.task1319;

import java.io.*;

/* 
Zapisywanie do pliku z konsoli
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String data;

        while (true) {
            data = reader.readLine();
            writer.write(data);
            writer.newLine();
            if (data.equals("exit")) {
                break;
            }
        }

        writer.close();
    }
}
