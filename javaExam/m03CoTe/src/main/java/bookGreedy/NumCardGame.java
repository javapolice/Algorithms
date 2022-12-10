package bookGreedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumCardGame {
    public static void main(String[] args) throws IOException {
        //기초작업
        FileReader fr = new FileReader("./src/main/resources/numCard2.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //변수추출
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int column = Integer.parseInt(st.nextToken());
        int row = Integer.parseInt(st.nextToken());
        int min;
        int[] minNum = new int[column];

        //계산작업
        for(int i = 0; i < column; i++){
            min = 1000;
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < row; j++){
                int num = Integer.parseInt(st.nextToken());
                if(min > num){
                    min = num;
                }
            }
            minNum[i] = min;
        }
        Arrays.sort(minNum);

        //출력작업
        bw.write(minNum[column-1]+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
