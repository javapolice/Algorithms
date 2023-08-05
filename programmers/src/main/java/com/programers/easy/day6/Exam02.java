package com.programers.easy.day6;

public class Exam02 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        System.out.println(solution(n,control));
    }

    public static int solution(int n, String control) {
        int answer = 0;

        char[] charArray = control.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'w') {
                n += 1;
            } else if (charArray[i] == 's') {
                n -= 1;
            } else if(charArray[i] == 'a'){
                n -= 10;
            } else {
                n += 10;
            }
        }
        answer = n;
        return answer;
    }
}
