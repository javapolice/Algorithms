package com.programers.basic.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OECount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().replaceAll("\\[| |\\]", "").split(",");
        int[] num_list = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
        long[] result = solution(num_list);
        System.out.println(Arrays.toString(result));
    }

    private static long[] solution(int[] num_list) {
        long[] answer = new long[2];
        for (int i : num_list) {
            if(i % 2 == 0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }
        return answer;
    }
}
