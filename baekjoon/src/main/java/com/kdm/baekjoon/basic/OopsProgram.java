package com.kdm.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OopsProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = makeOops(s);
        System.out.println(result);
    }

    private static String makeOops(String s) {
        String result = s + "??!";
        return result;
    }
}
