import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GreedyMoney {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int money = Integer.parseInt(st.nextToken());
        int coin[] = {500, 100, 50, 10};
        int count = 0;
        for(int i = 0; i < coin.length; i++){
            count += money / coin[i];
            System.out.println(coin[i] + ":" + money/coin[i]);
            money = money % coin[i];
        }
        System.out.println(count);
    }
}
