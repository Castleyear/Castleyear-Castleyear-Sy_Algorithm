package Int;

import java.util.*;

public class 최대매출 {

    public static void main(String[] args) {
        최대매출 t = new 최대매출();
        Scanner sc = new Scanner(System.in);

        int arr_length = sc.nextInt();
        int arr[] = new int[arr_length];

        int day = sc.nextInt();

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }

        int result[] = t.solution(arr, day);

//        for (int x : result) {
//            System.out.print(x + " ");
//        }

    }

    public int[] solution(int arr[], int a) {
        int answer[] = new int[a];
        int sum = 0; // 최종 출력값 (몇일 부터 몇일 더한 값)
        int tmp = 0; // for문에서 sum이랑 비교할 값

        for (int i = 0; i < a; i++) { //for문으로 day만큼 값을 넣음
            sum += arr[i];
            tmp += arr[i];
        }

        for (int i = a; i < arr.length; i++) { // day날 시작부터 인덱스 시작
            tmp = tmp - arr[i - a] + arr[i]; // tmp 의 값 기준 맨 앞을 빼고 인덱스의 날을 더함
            if (tmp > sum) { // 그값이 sum보다 클경우 교체함
                sum = tmp;
                for (int j = 2, z = 0; j >= 0; j--, z++) {
                    answer[j] = arr[i - z];
                }
            }
        }

        System.out.println(sum);

        return answer;
    }
}
