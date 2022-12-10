package com.kdm.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//25304
public class Receipt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalM = Integer.parseInt(br.readLine());
        int cnt = Integer.parseInt(br.readLine());
        int compareTotalM = 0;
        String result = "No";
        compareTotalM = getCompareTotalM(br, cnt, compareTotalM);
        if(totalM == compareTotalM) result = "Yes";

        br.close();
        System.out.println(result);
    }

    private static int getCompareTotalM(BufferedReader br, int cnt, int compareTotalM) throws IOException {
        for (int i = 0; i < cnt; i++) {
            String s = br.readLine();
            String[] s1 = s.split(" ");
            compareTotalM += Integer.parseInt(s1[0]) * Integer.parseInt(s1[1]);
        }
        return compareTotalM;
    }
}
