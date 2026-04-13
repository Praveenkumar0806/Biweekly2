import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int num) {
    // Write your code here
    if (num == 1918) {
            return "26.09.1918";
        }

        boolean isLeap=false;
        int[] date=new int[12];
        if(num<1918)
        {
            if (num % 4 == 0) {
                isLeap = true;
            }
        }
        else {
            if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
                isLeap = true;
            }
        }
        for (int i = 0; i < date.length; i++)
        {
            if (i == 1) {
                date[i] = isLeap ? 29 : 28;
            }
            else if (i == 3 || i == 5 || i == 8 || i == 10) {
                date[i] = 30;
            }
            else {
                date[i] = 31;
            }
        }
        int val=256;
        int sum=0;
        int mon=0;
        for(int i=0;i<date.length;i++)
        {
            if(sum+date[i]>=val)
            {
                mon=i+1;
                break;
            }
            sum+=date[i];
        }
        int diff=256-sum;
       return String.format("%02d.%02d.%d", diff, mon, num);
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

