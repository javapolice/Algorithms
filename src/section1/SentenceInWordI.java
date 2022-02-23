/*
3. 문장 속 단어
        설명

        한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

        문장속의 각 단어는 공백으로 구분됩니다.


        입력
        첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.


        출력
        첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한

        단어를 답으로 합니다.


        예시 입력 1

        it is time to study
        예시 출력 1

        study
*/

package section1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SentenceInWordI {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input1 = scn.nextLine();
        String answer = solution(input1);
        System.out.println(answer);
    }

    private static String solution(String input1) {
        StringTokenizer st = new StringTokenizer(input1," ");
        String result = "";

        while (st.hasMoreTokens()){
            String var = st.nextToken();
            if(result.length() < var.length()){
                result = var;
            }
        }
        return result;
    }
}
