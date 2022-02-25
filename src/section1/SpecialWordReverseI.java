package section1;

import java.util.Scanner;

/*
5. 특정 문자 뒤집기
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.


출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.


예시 입력 1

a#b!GE*T@S
예시 출력 1

S#T!EG*b@a
 */
public class SpecialWordReverseI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        String result = solution(word);
        System.out.println(result);
    }

    private static String solution(String word) {
        char[] c = word.toCharArray();
        int lt = 0;
        int rt = word.length()-1;
        String result = "";

        while(lt < rt){
            if((c[lt] >=65 && c[lt] <= 90) || (c[lt] >=97 && c[lt] <= 122)){
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
            }
            lt++;
            rt--;
        }

        result = String.valueOf(c);

        return result;

    }

}
