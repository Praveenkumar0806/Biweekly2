package JAVA;
import java.util.*;
public class Decode {
    public static void main(String[] args) {
        String s="12";
            int n=s.length();
            int[] dp=new int[n+1];
            dp[0]=1;
            dp[1]=s.charAt(0)=='0'?0:1;
            for(int i=2;i<=n;i++)
            {
                int fir=Integer.valueOf(s.substring(i-1,i));
                int sec=Integer.valueOf(s.substring(i-2,i));
                if(fir>=1)
                    dp[i]+=dp[i-1];
                if(sec>=10 && sec<=26)
                {
                    dp[i]+=dp[i-2];
                }
            }
           System.out.println(dp[n]);

    }
}
