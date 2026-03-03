package JAVA;
import java.util.*;
public class Sum3Close {
    public static void main(String[] args) {

        int[] a = {-1, 2, 1, -4};
        Arrays.sort(a);
        int key = 1;
        int min = Integer.MAX_VALUE;
        int n = a.length ;
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                int diff = Math.abs(key - sum);
                if (diff < min) {
                    min = diff;
                    ans = sum;
                }
                if (sum < key) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        System.out.println(ans);
    }
}
