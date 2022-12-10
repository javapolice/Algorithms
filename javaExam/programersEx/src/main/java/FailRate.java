public class FailRate {
        public static int[] solution(int N, int[] stages) {
            int[] rate = new int[N];
            int[] result = new int[N];
            for(int i=1; i <= result.length; i++){
                result[i-1] = i;
            }
            for(int i = 0; i < rate.length; i++){
                int a = 0;
                int b = 0;
                for(int j = 0; j < stages.length; j++){
                    if(result[i] <= stages[j]){
                        a++;
                        if(result[i] == stages[j]){
                          b++;
                        }
                    }
                }
                rate[i] = (b/a);
            }
            for(int i = 0; i < rate.length-1; i++){
                for(int j = i+1; j < rate.length; j++){
                    if(rate[i] < rate[j]){
                        int a = rate[i];
                        rate[i] = rate[j];
                        rate[j] = a;
                        int b = result[i];
                        result[i] = result[j];
                        result[j] = b;
                    }else if(rate[i] == rate[j]){
                        if(result[i] > result[j]){
                            int a = rate[i];
                            rate[i] = rate[j];
                            rate[j] = a;
                            int b = result[i];
                            result[i] = result[j];
                            result[j] = b;
                        }
                    }
                }
            }
            return result;
        }
    public static void main(String[] args) {
        int N = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        int[] result = solution(N,stages);
        for(int i : result){
            System.out.print(i+", ");
        }
    }
}
