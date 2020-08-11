package pl.codegym.task.task08.task0814;

import java.util.*;

/* 
Większa niż 10? Wcale do nas nie pasujesz!
*/

public class Solution {
    public static HashSet<Integer> utworzSet() {
        // tutaj wpisz swój kod
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        
        return set;
    }

    public static HashSet<Integer> usunLiczbyWiekszeNiz10(HashSet<Integer> set) {
        // tutaj wpisz swój kod
        set.removeIf(a -> a > 10);

        return set;
    }

    public static void main(String[] args) {

    }
}
