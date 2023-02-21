package 알고리즘.Int;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 봉우리 {

	public List<Integer> solution2(int[][] arr) {
		List<Integer> answer = new ArrayList<>();

		int dx[] = { -1, 0, 1, 0 };
		int dy[] = { 0, 1, 0, -1 };

		int p = 0;
		for (int i = 1; i <= arr.length - 2; i++) {
			for (int j = 1; j <= arr.length - 2; j++) {
				p = arr[i][j];
				boolean test = true;
				for (int k = 0; k < dx.length; k++) {
					// x= 1 + -1 = 0, 1+0 = 1, 1+1 = 2, 1+0 = 1
					int x = i + dx[k];
					// y = 1 + 0 = 1 , 1+1 = 2, 1+0 = 1, 1+-1 = 0
					int y = j + dy[k];
					if (p <= arr[x][y]) {
						test = false;
						break;
					}
				}

				if (test) {
					answer.add(arr[i][j]);

				}

			}
		}

		return answer;
	}

	public List<Integer> solution(int[][] arr) {
		List<Integer> answer = new ArrayList<>();

		int p = 0;

		for (int i = 1; i <= arr.length - 2; i++) {
			for (int j = 1; j <= arr.length - 2; j++) {
				p = arr[i][j];
				if (p > arr[i - 1][j] && p > arr[i + 1][j] && p > arr[i][j - 1] && p > arr[i][j + 1]) {
					// 상하좌우대각선 까지 신경쓸 경우
					// && p > arr[i-1][j-1] && p > arr[i+1][j+1] && p > arr[i-1][j+1] && p >
					// arr[i+1][j-1] ) {
					answer.add(p);
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		봉우리 main = new 봉우리();
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int arr[][] = new int[count + 2][count + 2];

		for (int i = 1; i <= count; i++) {
			for (int j = 1; j <= count; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(" ");

		for (int[] x : arr) {
			System.out.println(Arrays.toString(x));
		}

		List<Integer> result = main.solution2(arr);

		for (int x : result) {
			System.out.print(x + " ");
		}

		System.out.println(" ");
		System.out.print(result.size());

	}

}
