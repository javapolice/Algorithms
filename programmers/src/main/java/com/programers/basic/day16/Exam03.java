package com.programers.basic.day16;

public class Exam03 {
    public static void main(String[] args) {
        String my_string = "1230 - 432";
        int result = solution(my_string);
        System.out.println(result);
    }

    public static int solution(String my_string) {
        String[] strings = my_string.split(" ");
        int answer = Integer.parseInt(strings[0]);
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals("+")){
                answer += Integer.parseInt(strings[i+1]);
            }else if(strings[i].equals("-")){
                answer -= Integer.parseInt(strings[i+1]);
            }
        }

        return answer;
    }
}
