package 알고리즘.Int;

import java.util.Scanner;

public class 보이는학생 {

	public int solution(int arr[]) {
		// 카운팅 값
		int answer = 1;

		// 키
		int a = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > a) {
				answer++;
				a = arr[i];
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		보이는학생 main = new 보이는학생();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		int result = main.solution(arr);

		System.out.println(result);

	}

}
