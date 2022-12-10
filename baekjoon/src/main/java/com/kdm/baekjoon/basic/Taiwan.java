package com.kdm.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taiwan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int result = getResult(s);
        System.out.println(result);
    }

    private static int getResult(String s) {
        int i = Integer.parseInt(s);
        int result = i - 543;
        return result;
    }
}
