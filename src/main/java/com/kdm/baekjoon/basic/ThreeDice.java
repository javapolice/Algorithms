package com.kdm.baekjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreeDice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] s1 = s.split(" ");
        int[] ints = Arrays.stream(s1).mapToInt(Integer::parseInt).toArray();

        int cnt = getCnt(ints);

        int result;
        switch (cnt){
            case 0 :
                int max = Arrays.stream(ints).max().getAsInt();
                result = max * 100;
                break;
            case 1 :
                HashSet<Integer> set = new HashSet<>();
                Arrays.stream(ints).filter(i -> !set.add(i));

                break;
            case 3 :

                break;
            default :
                System.out.println("error");
                break;
        }
    }

    private static int getCnt(int[] ints) {
        int cnt = 0;
        for (int i = 0; i < ints.length-1; i++) {
            int i1 = ints[i];
            for (int j = i+1; j < ints.length; j++) {
                int j2 = ints[j];
                if(i1 == j2) {
                    cnt++;
                }
            }
        }
        return cnt;
    }


}
