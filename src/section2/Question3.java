package section2;

/*
3. 가위 바위 보
설명

A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

예를 들어 N=5이면

Image1.jpg

두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.

두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.

세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.


출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.


예시 입력 1

5
2 3 3 1 3
1 1 2 2 3
예시 출력 1

A
B
A
B
D
 */

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int cnt = scn.nextInt();
        int[] aTry = new int[cnt];
        for(int i =0; i < cnt; i++){
            aTry[i] = scn.nextInt();
        }
        int[] bTry = new int[cnt];
        for(int i =0; i < cnt; i++){
            bTry[i] = scn.nextInt();
        }
//        String[] result = solution(cnt,aTry,bTry);
        String[] result = solution2(cnt,aTry,bTry);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static String[] solution2(int cnt, int[] aTry, int[] bTry) {
        String[] answer = new String[cnt];
        //1:가위, 2:바위, 3:보
        for(int i = 0; i < cnt; i++){
            int tmpA = aTry[i];
            int tmpB = bTry[i];
            if(tmpA == tmpB) answer[i] = "D";
            else if(tmpA == 1 && tmpB == 3) answer[i] = "A";
            else if(tmpA == 2 && tmpB == 1) answer[i] = "A";
            else if(tmpA == 3 && tmpB == 2) answer[i] = "A";
            else answer[i] = "B";
        }
        return answer;
    }

    private static String[] solution(int cnt, int[] aTry, int[] bTry) {
        String[] answer = new String[cnt];
        //1:가위, 2:바위, 3:보
        for(int i = 0; i < cnt; i++){
            int tmpA = aTry[i];
            int tmpB = bTry[i];
            if(tmpA == 1){
                if(tmpB == 1){
                    answer[i] = "D";
                }else if(tmpB == 2){
                    answer[i] = "B";
                }else{
                    answer[i] = "A";
                }
                continue;
            }else if(tmpA == 2){
                if(tmpB == 1){
                    answer[i] = "A";
                }else if(tmpB == 2){
                    answer[i] = "D";
                }else{
                    answer[i] = "B";
                }
                continue;
            }else if(tmpA == 3){
                if(tmpB == 1){
                    answer[i] = "B";
                }else if(tmpB == 2){
                    answer[i] = "A";
                }else{
                    answer[i] = "D";
                }
                continue;
            }
        }
        return answer;
    }
}
