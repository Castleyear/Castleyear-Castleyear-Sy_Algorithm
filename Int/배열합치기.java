package 알고리즘.Int;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 배열합치기 {

	public List<Integer> solution(int arr1[], int arr2[]) {
		List<Integer> answer = new ArrayList<>();
		int i = 0, j = 0;
		// System.out.println("arr1:" + arr1.length + " arr2:" + arr2.length);

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				answer.add(arr1[i++]);
			} else {
				answer.add(arr2[j++]);
			}
		}

		while (i < arr1.length) {
			answer.add(arr1[i++]);
		}

		while (j < arr2.length) {
			answer.add(arr2[j++]);
		}

		return answer;
	}

	public static void main(String[] args) {
		배열합치기 main = new 배열합치기();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		int m = sc.nextInt();
		int arr2[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}

		// System.out.println("arr1" + Arrays.toString(arr1));
		// System.out.println("arr2" + Arrays.toString(arr2));

		// n = 열 , m = 행
		List<Integer> result = main.solution(arr1, arr2);

		for (int x : result) {
			System.out.print(x + " ");
		}

	}

}
