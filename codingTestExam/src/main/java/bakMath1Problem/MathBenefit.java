package bakMath1Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathBenefit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long cost = A + B;
        long benefit = C;
        long sellCnt = 1;

        while(cost >= benefit){
            System.out.println("이익 : " + benefit + ", 비용 : " + cost + ", 판매대수 : " + sellCnt);
            cost+= B;
            benefit += C;
            sellCnt++;
        }
        System.out.println(sellCnt);
    }
}
