package com.lhind.internship;

import static com.lhind.internship.CommonUtils.checkString;

public class GitDemoApplication {

    public static void main(String args[]) {

    }

    private void printString(String str) {
        if (checkString(str)) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        System.out.println(str);
    }

    private int toInt(String str) {
        if (checkString(str)) {
            throw new IllegalArgumentException("String cannot be empty");
        }
        return Integer.parseInt(str);
    }
}
