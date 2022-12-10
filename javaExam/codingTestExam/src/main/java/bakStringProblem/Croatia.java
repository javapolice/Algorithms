package bakStringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Croatia {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String w = br.readLine();
        w = w.replace("c=", "1");
        w = w.replace("c-", "1");
        w = w.replace("dz=", "1");
        w = w.replace("d-", "1");
        w = w.replace("lj", "1");
        w = w.replace("nj", "1");
        w = w.replace("s=", "1");
        w = w.replace("z=", "1");
        String[] S = w.split("");
        System.out.println(S.length);
        br.close();
    }
}
