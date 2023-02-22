package Int;

import java.util.*;

public class 연속부분수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        연속부분수열 m = new 연속부분수열();

        int leng = sc.nextInt();
        int nun = sc.nextInt();

        int arr[] = new int[leng];

        for (int i = 0; i < leng; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> result = m.solution(arr, nun);

        System.out.println(result);
    }

    public List<List<Integer>> solution(int arr[], int num) { //수열이 몇개가 나올지 모르기 때문에 리스트를 리스트로 받음
        List<List<Integer>> result = new ArrayList<>();
        int lt = 0; //배열의 왼쪽 포인터값
        int count = 0; // 카운팅 횟수
        int sum = 0; // 누적값 sum 이  num과 동일할때 count++함

        for (int i = 0; i < arr.length; i++) { // i 는 배열의 시작값 이며 i까지 다 더함
            List<Integer> answer = new ArrayList<>();
            sum += arr[i]; //sum변수에 arr의 i까지의 값을 계속 더함
            if (sum == num) { //그러다가 num과 똑같아지면 카운팅
                count++;
                for (int j = lt; j <=i; j++) { //현재 lt값 부터 rt값 까지의 인덱스 배열값을 리스트에 추가시킴
                    answer.add(arr[j]);
                }
                result.add(answer); //추가한 List를 result 리스트에 추가시킴
            }
            while (sum >= num) { // sum이 num보다 크거나 같을때만 진행함
                sum -= arr[lt]; // 우선 sum값에 맨앞 값 부터 빼기위해 lt값을 뺀 후 lt값을 계속 증가시킴
                lt++;
                if (sum == num) { //num과 똑같을 경우 위 경우와 동일함
                    count++;
                    for (int j = lt; j <=i; j++) {
                        answer.add(arr[j]);
                    }
                    result.add(answer);
                }
            }
        }

        System.out.println("카운팅:" + count);

        return result;
    }

}
