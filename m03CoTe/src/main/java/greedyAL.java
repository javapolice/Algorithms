import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class greedyAL {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader("C:\\intelliJ\\m03CoTe\\src\\main\\resources\\greedyAL.txt");
        BufferedReader br = new BufferedReader(fr);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());

        ArrayList<Time> timeList = new ArrayList<>();
        for(int i = 0; i < cnt; i++){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            timeList.add(new Time(start, end));
        }
        Collections.sort(timeList);
        int result = 0;
        int prevEnd = 0;
        for(Time t:timeList){
            if(prevEnd <= t.getStart()){
                result += 1;
                prevEnd = t.getEnd();
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    static class Time implements Comparable<Time>{
        private int start;
        private int end;

        public Time(int start, int end){
            this.start = start;
            this.end = end;
        }

        public int getStart(){
            return this.start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public int compareTo(Time t) {
            if(this.end < t.getEnd()){
                return -1;
            }else if(this.end == t.getEnd()){
                if(this.start < t.getStart()){
                    return -1;
                }else if(this.start == t.getStart()){
                    return 0;
                }else{
                    return 1;
                }
            }else {
                return 1;
            }
        }

        @Override
        public String toString() {
            return "Time{" +
                    "start=" + this.start +
                    ", end=" + this.end +
                    '}';
        }
    }
}
