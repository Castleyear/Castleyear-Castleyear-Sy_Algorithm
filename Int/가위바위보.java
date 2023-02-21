package 알고리즘.Int;

import java.util.*;

public class 가위바위보 {

	public String[] solution(int n, int arr1[], int arr2[]) {
		String answer[] = new String[n];
		// 1 = 가위
		// 2 = 바위
		// 3 = 보

		for (int i = 0; i < n; i++) {
			if (arr1[i] == arr2[i]) {
				answer[i] = "D";
			} else if (arr1[i] == 1 && arr2[i] == 3) {
				answer[i] = "A";
			} else if (arr1[i] == 2 && arr2[i] == 1) {
				answer[i] = "A";
			} else if (arr1[i] == 3 && arr2[i] == 2) {
				answer[i] = "A";
			} else {
				answer[i] = "B";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		가위바위보 main = new 가위바위보();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr1[] = new int[num];
		int arr2[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < num; i++) {
			arr2[i] = sc.nextInt();
		}

		String result[] = main.solution(num, arr1, arr2);

		for (String x : result) {
			System.out.println(x);
		}

	}

}
