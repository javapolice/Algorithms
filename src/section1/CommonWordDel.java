package section1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
6. 중복문자제거
설명

소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.

중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.


입력
첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.


출력
첫 줄에 중복문자가 제거된 문자열을 출력합니다.


예시 입력 1

ksekkset
예시 출력 1

kset
 */


public class CommonWordDel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        String result = solution(word);
        System.out.println(result);
    }

    private static String solution(String word) {
        char[] charArray = word.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for(char c : charArray){
            charSet.add(c);
        }
        String result = "";
        for(char c : charSet){
            result += String.valueOf(c);
        }
        return result;
    }
}
