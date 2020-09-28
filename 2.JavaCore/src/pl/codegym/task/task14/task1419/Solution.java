package pl.codegym.task.task14.task1419;

import com.sun.nio.sctp.IllegalReceiveException;

import javax.management.openmbean.OpenDataException;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.IllegalChannelGroupException;
import java.util.*;
import java.util.zip.DataFormatException;

/*
Inwazja wyjątków
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // Pierwszy wyjątek
        exceptions.add(new Exception("asehfiafh"));
        exceptions.add(new IllegalArgumentException("ytrcxbhae"));
        exceptions.add(new ArrayIndexOutOfBoundsException("eryruyui"));
        exceptions.add(new FileNotFoundException("bnbnmbvm"));
        exceptions.add(new IllegalReceiveException("uytiuyi"));
        exceptions.add(new IllegalThreadStateException("aserfqwr"));
        exceptions.add(new IllegalFormatCodePointException(6));
        exceptions.add(new IllegalChannelGroupException());
        exceptions.add(new IllegalFormatFlagsException("ahsgfasf"));
        exceptions.add(new IllegalFormatPrecisionException(1));
        }
    }
