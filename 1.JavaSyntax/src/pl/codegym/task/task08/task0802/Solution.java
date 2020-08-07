package pl.codegym.task.task08.task0802;

/* 
HashMap z 10 par
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("arbuz", "melon");
        hashMap.put("banan", "owoc");
        hashMap.put("wiśnia", "owoc");
        hashMap.put("gruszka", "owoc");
        hashMap.put("kantalupa", "melon");
        hashMap.put("jeżyna", "owoc");
        hashMap.put("żeńszeń", "korzeń");
        hashMap.put("truskawka", "owoc");
        hashMap.put("irys", "kwiat");
        hashMap.put("ziemniak", "bulwa");

        for (HashMap.Entry<String, String> map : hashMap.entrySet()) {
            String key = map.getKey();
            String value = map.getValue();

            System.out.println(key + " - " + value);
        }
    }
}
