import java.io.*;
import java.util.StringTokenizer;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\intelliJ\\m03CoTe\\src\\main\\resources\\greedyAL.txt");
        BufferedReader br = new BufferedReader(fr);
        StringTokenizer st;
        while(br.ready()){
            st = new StringTokenizer(br.readLine());
            System.out.println(st.nextToken());
        }
    }
}
