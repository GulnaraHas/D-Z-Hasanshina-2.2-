package org.gulnara.dz;
public class NumberComparator {
    public static String compare(int a, int b) {
        if (a == b) {
            return "Numbers are equal";
        } else if (a > b) {
            return "First number is greater";
        } else {
            return "Second number is greater";
        }
    }
}

