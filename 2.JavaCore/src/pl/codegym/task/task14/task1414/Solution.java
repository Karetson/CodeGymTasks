package pl.codegym.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Wczytuje parę kluczy (ciągów) z konsoli. Punkt 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Movie movie;
        while (true) {
            String key = reader.readLine();
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
                MovieFactory.getMovie(key);
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
                MovieFactory.getMovie(key);
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
                MovieFactory.getMovie(key);
            } else {
                MovieFactory.getMovie(key);
                break;
            }
            System.out.println(movie.getClass().getSimpleName());
        }

        /*
            8. Tworzy zmienną movie w klasie Movie i dla każdego wprowadzonego ciągu (klucza):
            8.1. Pobiera obiekt za pomocą MovieFactory.getMovie i przypisuje go do zmiennej movie.
            8.2. Wyświetla wynik wywoływania metody movie.getClass().getSimpleName().
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            // Tworzy obiekt SoapOpera dla klucza "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            //tutaj wpisz swój kod. Punkty 5 i 6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    // Tutaj napisz swoje klasy Punkt 3
    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
