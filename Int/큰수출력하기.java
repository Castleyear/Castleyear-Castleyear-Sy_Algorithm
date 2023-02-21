package Int;

import java.util.*;

public class 큰수출력하기 {

	public String solution(int arr[]) {
		String answer = "";

		// 첫 수
		int num = arr[0];
		answer += String.valueOf(arr[0]) + " ";

		for (int i = 1; i < arr.length; i++) {
			if (num < arr[i]) {
				answer += String.valueOf(arr[i]) + " ";
			}
			num = arr[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		큰수출력하기 main = new 큰수출력하기();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		String result = main.solution(arr);

		System.out.println(result);

	}

}
