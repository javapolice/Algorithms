import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class CoinGreedyAL {
    public static void main(String[] args) throws IOException {
        //기본 입력 작업
//        FileReader fr = new FileReader("C:\\intelliJ\\m03CoTe\\src\\main\\resources\\coinAL.txt");
//        BufferedReader br = new BufferedReader(fr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coinTypeCnt = Integer.parseInt(st.nextToken());
        int exChangeMoney = Integer.parseInt(st.nextToken());
        Integer[] coinType = new Integer[coinTypeCnt];

        //동전타입 넣기
       for(int i = 0; i < coinType.length; i++){
            st = new StringTokenizer(br.readLine());
            coinType[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

       //배열 내림차순 정렬
        Arrays.sort(coinType, Collections.reverseOrder());

       //코인 갯수 구하기
        int result = 0;
        for(int i = 0; i < coinType.length; i++){
            if(exChangeMoney / coinType[i] <= 0){
                continue;
            }else{
                result += exChangeMoney / coinType[i];
//                System.out.println(coinType[i] + " : " + (exChangeMoney / coinType[i]));
                exChangeMoney = exChangeMoney % coinType[i];
            }
        }
        //결과값
        System.out.println(result);
    }
}
