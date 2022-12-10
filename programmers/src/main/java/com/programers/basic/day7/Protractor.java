package com.programers.basic.day7;


import java.util.Scanner;

public class Protractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        int result = solution(angle);
        System.out.println(result);
    }

    private static int solution(int angle) {
        int result;
        if(angle == 180){
            result = 4;
        }else if(angle > 90){
            result = 3;
        }else if(angle == 90){
            result = 2;
        }else{
            result = 1;
        }
        return result;
    }

}
