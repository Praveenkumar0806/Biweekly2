
import java.util.*;
public class RearrangeWord {
    public static void main(String[] args) {
        String s = "Keep calm and code on";
        String s2=s.toLowerCase();
        String[] s1 = s2.split(" ");
        for (int i = 1; i < s1.length; i++) {
            String temp = s1[i];
            int j = i - 1;

            while (j >= 0 && s1[j].length() > temp.length()) {
                s1[j + 1] = s1[j];
                j--;
            }

            s1[j + 1] = temp;
        }
        char ch = s1[0].charAt(0);

        if (ch >= 97 && ch <= 122) {
            ch = (char)(ch - 32);
        }

        s1[0] = ch + s1[0].substring(1);
       // System.out.println(Arrays.toString(s1));
        String s3="";
        for(int i=0;i<s1.length;i++)
        {
                s3+=s1[i]+" ";
            if (i != s1.length - 1) {
                s3 += " ";
            }
        }
        System.out.println(s3);
    }
}

