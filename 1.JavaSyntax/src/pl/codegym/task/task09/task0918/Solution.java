package pl.codegym.task.task09.task0918;

/* 
Wszyscy są naszymi kumplami, nawet wyjątki
*/

import java.io.IOError;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends Exception {
    }

    static class MyException2 extends IOException {
    }

    static class MyException3 extends IndexOutOfBoundsException {
    }

    static class MyException4 extends RuntimeException {
    }
}

