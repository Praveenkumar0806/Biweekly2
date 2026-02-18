

public class Frog {
    public static void main(String[] args) {
        String s = "croakcroak";

        int[] count = new int[5]; 
        int max = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'c') {
                count[0]++;
            } else if (ch == 'r') {
                count[1]++;
                count[0]--;
                if (count[0] < 0) {
                    System.out.println(-1);
                    return;
                }
            } else if (ch == 'o') {
                count[2]++;
                count[1]--;
                if (count[1] < 0) {
                    System.out.println(-1);
                    return;
                }
            } else if (ch == 'a') {
                count[3]++;
                count[2]--;
                if (count[2] < 0) {
                    System.out.println(-1);
                    return;
                }
            } else if (ch == 'k') {
                count[4]++;
                count[3]--;
                if (count[3] < 0) {
                    System.out.println(-1);
                    return;
                }
            } else {
                System.out.println(-1);
                return;
            }
            int currentFrogs = count[0] + count[1] + count[2] + count[3];
            max = Math.max(max, currentFrogs);
        }
        for (int i = 0; i < 4; i++) {
            if (count[i] != 0) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(max);
    }
}
