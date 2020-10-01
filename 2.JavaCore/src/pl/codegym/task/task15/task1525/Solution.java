package pl.codegym.task.task15.task1525;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/* 
Plik w bloku statycznym
*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try {
            lines = Files.readAllLines(new File(Statics.FILE_NAME).toPath(), Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
