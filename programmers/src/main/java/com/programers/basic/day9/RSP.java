package com.programers.basic.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RSP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String rsp = br.readLine();
        String result = solution(rsp);
        System.out.println(result);
    }

    private static String solution(String rsp) {
        String[] rsps = rsp.split("");
        String answer = "";
        for (String s : rsps) {
            switch (s){
                case "0" :
                    answer += "5";
                    break;
                case "2" :
                    answer += "0";
                    break;
                case "5" :
                    answer += "2";
                    break;
            }
        }
        return answer;
    }
}
