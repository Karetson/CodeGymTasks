package pl.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/* 
Miła Emma i letnie wakacje
*/

public class Solution {
    public static HashMap<String, Date> utworzMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.forLanguageTag("pl"));
        HashMap<String, Date> mapa = new HashMap<String, Date>();
        mapa.put("Stallone", df.parse("CZERWIEC 1 1980"));

        //tutaj wpisz swój kod
        mapa.put("Kareta", df.parse("LUTY 1 1980"));
        mapa.put("Dobosz", df.parse("MARZEC 1 1980"));
        mapa.put("Orlowski", df.parse("MAJ 1 1980"));
        mapa.put("Osuch", df.parse("KWIECIEŃ 1 1980"));
        mapa.put("Test", df.parse("SIERPIEŃ 1 1980"));
        mapa.put("Nazwisko1", df.parse("LIPIEC 1 1980"));
        mapa.put("Nazwisko2", df.parse("LIPIEC 1 1980"));
        mapa.put("Naziwsko3", df.parse("WRZESIEŃ 1 1980"));
        mapa.put("Naziwskso4", df.parse("GRUDZIEŃ 1 1980"));

        return mapa;
    }

    public static void usunUrodzonychLatem(HashMap<String, Date> mapa) {
        //tutaj wpisz swój kod
        mapa.entrySet().removeIf(v -> v.getValue().getMonth() >= 5 && v.getValue().getMonth() < 8 );
    }

    public static void main(String[] args) {

    }
}
