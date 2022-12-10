package com.programers.basic.day10;

import java.util.Scanner;

public class Dot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] dot = {x,y};
        int result = solution(dot);
        System.out.println(result);
    }

    private static int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];
        int answer;
        if(x > 0 && y > 0){
            answer = 1;
        }else if(x > 0 && y < 0){
            answer = 4;
        }else if(x < 0 && y > 0){
            answer = 2;
        }else{
            answer = 3;
        }
        return answer;
    }
}
