package bakForProblem;

import java.io.*;

public class PrintStar1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int lineCnt = Integer.parseInt(br.readLine());
        for(int i = 0; i < lineCnt; i++){
            for(int j = 0; j < i+1; j++){
                bw.write("*");
            }
                bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
