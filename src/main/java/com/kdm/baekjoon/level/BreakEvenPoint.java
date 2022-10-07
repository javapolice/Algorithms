package com.kdm.baekjoon.level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1712
public class BreakEvenPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long A = Long.parseLong(s[0]);
        long B = Long.parseLong(s[1]);
        long C = Long.parseLong(s[2]);
        long cnt = 1;
        long makeAm = A + B;
        long sellAm = C;
        long result = 0;

        result = getResult(B, C, cnt, makeAm, sellAm);

        System.out.println(result);

    }

    private static long getResult(long B, long C, long cnt, long makeAm, long sellAm) {
        long result;
        if(B >= C){
            result = -1;
        }else{
            while(makeAm >= sellAm){
                makeAm += B;
                sellAm += C;
                cnt++;
            }
            result = cnt;
        }
        return result;
    }
}
