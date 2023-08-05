package com.programers.easy.day5;

public class Exam04 {
    public static void main(String[] args) {
        int[] num_list = {3,4,5,2,1};
        System.out.println(solution(num_list));
    }
    public static int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int sumDouble = 0;
        for (int i : num_list) {
            multiple *= i;
            sumDouble += i;
        }
        if(multiple < Math.pow(sumDouble,2)) answer = 1;
        return answer;
    }
}
