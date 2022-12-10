package com.programers.basic.day8;


import java.util.Scanner;
import java.util.stream.IntStream;

//입문 lv.0 순서쌍의 개수
public class ListTot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = solution2(n);
        System.out.println(result);
    }

    private static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) answer++;
        }

        return answer;
    }

    private static int solution2(int n) {
        return (int) IntStream.rangeClosed(1,n).filter(i->n % i == 0).count();
    }
}
