interface CompareTwo{
    public int compareTo(int a, int b);
}

public class lamda {

    public static void exec(CompareTwo com){
        int k = 10;
        int m = 20;
        int value = com.compareTo(k, m);
        System.out.println(value);
    }

    public static void main(String[] args) {
        exec((i,j)->{
            return i+j;
        });
    }
}
