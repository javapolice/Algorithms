package section1;

/*
10. 가장 짧은 문자거리
설명

한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

문자열의 길이는 100을 넘지 않는다.


출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.


예시 입력 1

teachermode e
예시 출력 1

1 0 1 2 1 0 1 2 2 1 0
 */

import java.util.Scanner;

public class ShortestStrI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String t = scn.next();
        String result = solution(s,t);
        System.out.println(result);
    }

    private static String solution(String s, String t) {
        String result = "";
        char[] cArray = s.toCharArray();
        for (int i = 0; i < cArray.length; i++){
            if(cArray[i] == t.charAt(0)){
                result += "0 ";
            }else{
                int lt = 1;
                int rt = 1;
                int j = i;
                if((j-lt)>=0){
                    while(cArray[j-lt] != t.charAt(0)){
                        lt++;
                        if((j-lt)<0) break;
                    }
                }
                if((j+rt) <= cArray.length-1){
                    while(cArray[j+rt] != t.charAt(0)){
                        rt++;
                    }
                    if((j+rt) >= cArray.length) break;
                }
                if(lt < rt){
                    result += String.valueOf(lt) + " ";
                }else{
                    result += String.valueOf(rt) + " ";
                }
            }
        }
        return result;
    }
}
