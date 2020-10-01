package pl.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Różne metody dla różnych typów
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = reader.readLine();

            if (input.equals("exit")) {
                break;
            } else if (input.contains(".")) {
                try {
                    Double inDouble = Double.parseDouble(input);
                    print(inDouble);
                } catch (NumberFormatException e) {
                    print(input);
                }
            } else {
                try {
                    Integer inInteger = Integer.parseInt(input);
                    if (inInteger > 0 && inInteger < 128) {
                        short inShort = inInteger.shortValue();
                        print(inShort);
                    } else {
                        print( inInteger);
                    }
                } catch(NumberFormatException e) {
                    String s = input;
                    print(s);
                }
            }
        }
    }

    public static void print(Double value) {
        System.out.println("To jest Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("To jest String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("To jest liczba całkowita typu short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("To jest liczba całkowita typu Integer. Value: " + value);
    }
}
