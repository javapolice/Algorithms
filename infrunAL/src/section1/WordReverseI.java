package section1;

/*
4. 단어 뒤집기
설명

N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.


입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.

두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.


출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.


예시 입력 1

3
good
Time
Big
예시 출력 1

doog
emiT
giB

 */


import java.io.*;

public class WordReverseI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] sArray = new String[cnt];
        for(int i = 0; i < cnt; i++){
            sArray[i] = br.readLine();
        }
        br.close();
        sArray = solution(sArray);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(String s : sArray){
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String[] solution(String[] sArray) {
        for(int i = 0; i < sArray.length; i++){
            String s = sArray[i];
            String[] tmp = s.split("");
            sArray[i] = "";
            for(int j = tmp.length; j > 0; j--){
                sArray[i] += tmp[j-1];
            }
        }
        return sArray;
    }

}
