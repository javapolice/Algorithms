package com.programers.basic.day7;


import java.util.Scanner;
import java.util.stream.IntStream;

public class EvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = solution2(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                answer += i;
            }
        }
        return answer;
    }

    private static int solution2(int n) {
        int sum = IntStream.rangeClosed(1, n).filter(i -> i % 2 == 0).sum();
        return sum;
    }



}
