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
        int[] result = solution(num_list);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i : num_list) {
            if(i == 0) {
            }else if(i % 2 == 0){
                answer[0]++;
            }else{
                answer[1]++;
            }
        }
        return answer;
    }
}
