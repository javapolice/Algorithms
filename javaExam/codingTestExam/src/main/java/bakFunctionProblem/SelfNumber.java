package bakFunctionProblem;

import java.util.*;

public class SelfNumber {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= 10000; i++) {
            if (d(i) <= 10000)
                set.add(d(i));
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        for (int t : list) {
            System.out.println(t);
        }
    }

    static int d(int n) {
        String num = String.valueOf(n);
        String[] numPart = num.split("");
        for (String t : numPart) {
            n += Integer.parseInt(t);
        }
        return n;
    }
}
