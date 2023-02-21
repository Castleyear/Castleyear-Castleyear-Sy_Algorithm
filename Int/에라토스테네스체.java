package Int;

import java.util.Scanner;

public class 에라토스테네스체 {

	public int[] solution(int n) {
		int answer[] = new int[n + 1];
		int tmp[] = new int[n + 1];
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (answer[i] == 0) {
				count++;
				tmp[i] = 1;
				for (int j = i; j <= n; j = j + i) {
					answer[j] = 1; // t
				}
			}
		}
		System.out.println(count);
		return tmp;
	}

	public static void main(String[] args) {
		에라토스테네스체 main = new 에라토스테네스체();
		Scanner sc = new Scanner(System.in);

		int result[] = main.solution(sc.nextInt());

		for (int i = 0; i < result.length; i++) {
			if (result[i] == 1) {
				System.out.print(i + " ");
			}

		}

	}

}
