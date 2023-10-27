package com.programers.basic.day14;

public class Exam04 {
    public static void main(String[] args) {
        String my_string = "azAZcccCCC";
        String result = solution(my_string);
        System.out.println(result);
    }

    public static String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            if((int)c >=65 && (int)c <= 90){
                // 대문자
                answer += String.valueOf(c).toLowerCase();
            }else{
                // 소문자
                answer += String.valueOf(c).toUpperCase();
            }
        }
        return answer;
    }
}
