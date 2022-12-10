package com.kdm.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2525
public class OvenClock {
    public static void main(String[] args) throws IOException {
        String result = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        String s2 = br.readLine();
        result = getTime(result, s1, s2);
        br.close();
        System.out.println(result);

    }

    private static String getTime(String result, String[] s1, String s2) {
        int hour = Integer.parseInt(s1[0]);
        int min = Integer.parseInt(s1[1]);
        int cookTime = Integer.parseInt(s2);
        int plusH = (cookTime + min) / 60;
        int plusM = (cookTime + min) % 60;
        int fhour = plusH + hour;
        if(fhour / 24 > 0){
            result += (fhour % 24) + " " + plusM;
        }else{
            result += fhour + " " + plusM;
        }
        return result;
    }
}
