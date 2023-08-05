package com.programers.easy.day5;

public class Exam05 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0){
                even += String.valueOf(num_list[i]);
            }else{
                odd += String.valueOf(num_list[i]);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);

        return answer;
    }
}
