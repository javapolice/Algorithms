package com.programers.basic.day9;

import java.util.Scanner;

//lv.0 개미군단
public class Ants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hp = sc.nextInt();
        int result = solution2(hp);
        System.out.println(result);
    }

    private static int solution(int hp) {
        final int GENERAL_ANT = 5;
        final int SOLDIER_ANT = 3;

        int answer = 0;

        if(hp % GENERAL_ANT != 0){
            answer += hp / GENERAL_ANT;
            int rest = hp % GENERAL_ANT;
            if(rest % SOLDIER_ANT != 0){
                answer += rest / SOLDIER_ANT;
                answer += rest % SOLDIER_ANT;
            }else{
                answer += rest / SOLDIER_ANT;
            }
        }else{
            answer += hp / GENERAL_ANT;
        }
        return answer;
    }


    private static int solution2(int hp) {
        int answer = hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp / 1;

        return answer;
    }
}
