package JAVA;
import java.util.*;
public class BuyAndShell {
    public static void main(String[] args) {
        int[] a = {7, 6,4, 3,1};
        int pro = 0;
        int max = 0;
        int buy = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < buy) {
                buy = a[i];
            } else {
                pro = a[i] - buy;
                max = Math.max(max, pro);
            }
        }
        System.out.println(max);
    }
}
