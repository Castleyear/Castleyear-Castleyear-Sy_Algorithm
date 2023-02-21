package String;

import java.util.Arrays;

public class k정렬 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		int[] answer = new int[commands.length];

		for (int i = 0; i < (commands.length); i++) {
			int[] answer2 = new int[0];
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];
			// System.out.println("abc 의 값 : " + a + " " + b + " " + c);

			answer2 = Arrays.copyOfRange(array, a - 1, b);
			System.out.println(Arrays.toString(answer2));
			// answer2 = Arrays.copyOf(answer2, answer2.length+1);
			// answer2[answer2.length-1] = array[z];

			// System.out.println("정렬 전 :" + Arrays.toString(answer2));
			Arrays.sort(answer2);
			// System.out.println("정렬 후 :" + Arrays.toString(answer2));
			answer[i] = answer2[c - 1];
			// System.out.println("");
		}

		System.out.println(Arrays.toString(answer));

	}

}
