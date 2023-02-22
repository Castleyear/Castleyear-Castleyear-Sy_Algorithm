package Int;

import java.util.*;

public class 최대길이연속부분수열 {
    public static void main(String[] args) {
        최대길이연속부분수열 T = new 최대길이연속부분수열();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }

    public int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, j = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr[j] == 0) {
                    cnt--;
                }
                j++;
            }
            sum = i-j+1;
            if(sum > answer){
                answer = sum;
            }
//            answer = Math.max(answer, i - j + 1);
        }
        return answer;
    }
}
