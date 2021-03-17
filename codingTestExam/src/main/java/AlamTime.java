import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlamTime {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        minute -= 45;
        if(minute < 0){
            hour-=1;
            minute += 60;
            if(hour < 0){
                hour = 23;
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.append(hour + " " + minute);
        System.out.println(sb);

    }
}
