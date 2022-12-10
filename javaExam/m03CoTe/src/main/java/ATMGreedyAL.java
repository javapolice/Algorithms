import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATMGreedyAL {
    public static void main(String[] args) throws IOException {
//        FileReader fr = new FileReader("C:\\intelliJ\\m03CoTe\\src\\main\\resources\\atmAL.txt");
//        BufferedReader br = new BufferedReader(fr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int personCnt = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        br.close();
        Integer[] persons = new Integer[personCnt];

       for(int i = 0; i < persons.length; i++){
           persons[i] = Integer.parseInt(st.nextToken());
       }
       Arrays.sort(persons);
       int result = 0;
       for(int i = 0; i < persons.length; i++){
            int count = i;
            while(count > 0){
                    result += persons[count];
                    count--;
                }
            result+=persons[count];
        }
        System.out.println(result);
    }
}
