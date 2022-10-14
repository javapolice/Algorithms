package com.programers.basic.day5;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        
        int result = solution(price);
        System.out.println(result);
    }

    private static int solution(int price) {
        double answer = 0;
        if(price >= 500000){
            answer = price * 0.8;
        }else if(price >= 300000){
            answer = price * 0.9;
        }else if(price >= 100000){
            answer = price * 0.95;
        }else{
            answer = price;
        }
        return (int) Math.floor(answer);
    }
}
