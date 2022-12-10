package bookGreedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Want1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int dNum = Integer.parseInt(st.nextToken());
        int cnt = 0;
        while(num != 1){
            if(num % dNum == 0){
                num = num / dNum;
                cnt++;
            }else{
                num-=1;
                cnt++;
            }
        }
        br.close();
        System.out.println(cnt);
    }
}
