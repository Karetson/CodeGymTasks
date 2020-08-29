package pl.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Jaka dzisiaj jest data?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        SimpleDateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat targetFormat = new SimpleDateFormat("dd MMM yyyy", new Locale("pl"));

        Date date1 = originalFormat.parse(date);
        String formattedDate = targetFormat.format(date1).toUpperCase();

        System.out.println(formattedDate);
    }
}
