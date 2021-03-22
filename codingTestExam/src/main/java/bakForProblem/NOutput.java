package bakForProblem;

import java.io.*;

public class NOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = n; i >=1; i--){
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }
}
