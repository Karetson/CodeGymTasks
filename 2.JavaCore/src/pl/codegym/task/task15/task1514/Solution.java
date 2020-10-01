package pl.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Modyfikatory statyczne: część 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();
    static {
        labels.put(2.4, "Coś");
        labels.put(2.0, "Coś");
        labels.put(2.1, "Coś");
        labels.put(2.2, "Coś");
        labels.put(2.3, "Coś");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
