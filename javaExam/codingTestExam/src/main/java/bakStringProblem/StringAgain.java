package bakStringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringAgain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String[] S = st.nextToken().split("");
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < S.length; j++){
                for(int k = 0; k < R; k++){
                    sb.append(S[j]);
                }
            }
            System.out.println(sb);
        }
        br.close();
    }
}
