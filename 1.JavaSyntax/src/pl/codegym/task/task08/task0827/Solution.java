package pl.codegym.task.task08.task0827;

/* 
Praca z datami
*/

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDataNieparzysta("MAY 1 2013"));


    }

    public static boolean isDataNieparzysta(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date(date1.getYear(), 0, 0);

        long result = date1.getTime() - date2.getTime();
        long day = 24 * 3600 * 1000;
        long resultInMs = result / day;

        if (resultInMs % 2 == 1) {
            return true;
        }

        return false;
    }
}