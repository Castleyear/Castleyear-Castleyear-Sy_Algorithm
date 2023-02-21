package 알고리즘.Int;

import java.util.*;

public class 등수구하기 {

	public int[] solution(int arr[]) {
		int answer[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			int p = 0;
			for (int j = 0; j < arr.length; j++) {
				if (tmp < arr[j]) {
					p++;
				}
			}
			answer[i] = p + 1;

		}

		return answer;
	}

	public static void main(String[] args) {
		등수구하기 main = new 등수구하기();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[] = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}

		int result[] = main.solution(arr);

		for (int x : result) {
			System.out.print(x + " ");
		}

	}

}