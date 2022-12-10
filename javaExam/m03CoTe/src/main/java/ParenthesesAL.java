import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ParenthesesAL {
    public static void main(String[] args) throws IOException {
        //초기작업(변수추출)
//        FileReader fr = new FileReader("C:\\intelliJ\\m03CoTe\\src\\main\\resources\\parenthesesAL.txt");
//        BufferedReader br = new BufferedReader(fr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        String firstNum = st.nextToken();
        StringTokenizer st2 = new StringTokenizer(firstNum, "+");
        long result = 0;
        while (st2.hasMoreTokens()) {
            result += Long.parseLong(st2.nextToken());
        }

        while (st.hasMoreTokens()) {
            st2 = new StringTokenizer(st.nextToken(), "+");
            long temp = 0;
            while (st2.hasMoreTokens()) {
                temp += Long.parseLong(st2.nextToken());
            }
            result += -temp;
        }
        System.out.println(result);
    }
}
