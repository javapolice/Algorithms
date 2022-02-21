package section1;

import java.util.Scanner;

public class SearchStrT {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        char input2 = in.next().charAt(0);

        int answer = solution(input1,input2);

        System.out.println(answer);
    }

    private static int solution(String input1, char input2) {
        int cnt = 0;
        input1 = input1.toUpperCase();
        input2 = Character.toUpperCase(input2);

        for (char c : input1.toCharArray()) {
            //charAt(i)비교도 가능
            if(c == input2){
                cnt++;
            }
        }

        return cnt;
    }


}

/*
    1. 문자 찾기
    설명

    한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

    대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.


            입력
    첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.

    문자열은 영어 알파벳으로만 구성되어 있습니다.

            출력
    예시 입력 1

    Computercooler
            c
    예시 출력 1
            2
    */