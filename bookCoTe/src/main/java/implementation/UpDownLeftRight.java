package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UpDownLeftRight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            switch (s) {
                case "L":
                    if (y > 1 && y <= cnt) {
                        y -= 1;
                    }
                    break;
                case "R":
                    if (y >= 1 && y < cnt) {
                        y += 1;
                    }
                    break;
                case "U":
                    if (x > 1 && x <= cnt) {
                        x -= 1;
                    }
                    break;
                case "D":
                    if (x >= 1 && x < cnt) {
                        x += 1;
                    }
                    break;
            }
        }
        System.out.println(x + " " + y);
        br.close();
    }
}
