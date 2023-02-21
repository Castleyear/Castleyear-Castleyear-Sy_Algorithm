package 알고리즘.Int;

import java.util.Scanner;

public class 점수계산 {

	public int solution(int[] arr) {
		int answer = 0;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			} else {
				count = 0;
			}

			answer += count;
		}

		return answer;
	}

	public static void main(String[] args) {
		점수계산 main = new 점수계산();
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int arr[] = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(main.solution(arr));

	}

}
