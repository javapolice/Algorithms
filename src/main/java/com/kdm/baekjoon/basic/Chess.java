package com.kdm.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String result = calculate(s);
        System.out.println(result);
    }

    private static String calculate(String s) {
        int[] ints = {1,1,2,2,2,8};
        String result = "";
        String[] split = s.split(" ");
        for (int i = 0; i <split.length; i++) {
            result += ints[i] - Integer.parseInt(split[i]);
            result += " ";
        }
        return result;
    }
}
