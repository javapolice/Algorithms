import java.util.Arrays;

public class Dunjeons {
/*  내 답(실패)
    public static int solution(int k, int[][] dungeons) {
        int answer = 0;
        Arrays.sort(dungeons, ((o1, o2) -> {
            if(o2[0] == o1[0]){
                return Integer.compare(o1[1], o2[1]);
            }else{
                return Integer.compare(o2[0], o1[0]);
            }
        }));

        for(int i = 0; i < dungeons.length-1; i++){
                int[] currentArray = dungeons[i];
                int[] afterArray = dungeons[i+1];

                if(k < currentArray[0]){
                    continue;
                }else{
                    if((k - currentArray[1]) < afterArray[0]){
                        if((k - afterArray[1]) < currentArray[0]){
                            k = k - afterArray[1];
                            i++;
                            answer++;
                            continue;
                        }else{
                            k = k - afterArray[1] - currentArray[1];
                            i++;
                            answer+=2;
                            continue;
                        }
                    }else{
                        k = k - currentArray[1];
                        answer++;
                        continue;
                    }
                }
        }
        return answer;
    }
*/
    /* 해설답(dfs 완전탐색)
    boolean[] visit;
    int[][] dungeons;
    int max=0;
    public int solution(int k, int[][] dungeons) {
        this.dungeons=dungeons;
        visit = new boolean[dungeons.length];
        for(int i=0;i<dungeons.length;i++){
            if(k>=dungeons[i][0]){
                dfs(i,k,1);
            }
        }
        return max;
    }

    private void dfs(int cur, int tired,int depth) {
        visit[cur]=true;
        tired -= dungeons[cur][1];
        for(int i=0;i<dungeons.length;i++){
            if(!visit[i] && dungeons[i][0] <= tired){
                dfs(i,tired,depth+1);
            }
        }
        max = Math.max(depth,max);
        visit[cur]=false;
    }*/
    //1등 정답자 답 (dfs 완전탐색)
    public static boolean check[];
    public static int ans = 0;

    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return ans;
    }
    public static void dfs(int tired, int[][] dungeons, int cnt){
        for(int i=0; i<dungeons.length; i++){
            if(!check[i] && dungeons[i][0]<=tired){
                check[i] = true;
                dfs(tired-dungeons[i][1], dungeons, cnt+1);
                check[i] = false;
            }
        }
        ans = Math.max(ans, cnt);
    }

    public static void main(String[] args) {
        Dunjeons dj = new Dunjeons();
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        int result = dj.solution(k, dungeons);
        System.out.println(result);
    }

}
