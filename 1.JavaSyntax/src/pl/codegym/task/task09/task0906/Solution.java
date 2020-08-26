package pl.codegym.task.task09.task0906;

/* 
Logowanie śladów stosu
*/

public class Solution {
    public static void main(String[] args) {
        log("W metodzie main");
    }

    public static void log(String s) {
        //tutaj wpisz swój kod
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        String className = elements[2].getClassName();
        String methodName = elements[2].getMethodName();

        System.out.println(className + ": " + methodName + ": " + s);
    }
}
