package pl.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Klasa ConsoleReader
*/

public class ConsoleReader {

    public static String readString() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tekst = reader.readLine();
        return tekst;
    }

    public static int readInt() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int liczba = Integer.parseInt(reader.readLine());
        return liczba;
    }

    public static double readDouble() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double liczbaDouble = Double.parseDouble(reader.readLine());
        return liczbaDouble;
    }

    public static boolean readBoolean() throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String tekst = reader.readLine();
        return Boolean.parseBoolean(tekst);
    }

    public static void main(String[] args) {

    }
}
