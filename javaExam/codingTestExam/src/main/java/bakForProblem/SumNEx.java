package bakForProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumNEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 1; i <= cnt; i++){
            result+=i;
        }
        System.out.println(result);
    }
}
