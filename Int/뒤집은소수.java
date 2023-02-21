package 알고리즘.Int;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 뒤집은소수 {

	public boolean solution2(int num) {
		/*
		 * 로직설명
		 * - num값이 1이면 소수가 아님으로false
		 * - 2부터 시작하는 for문을 이용해 num까지 순환시키면서 num까지 한번이라도 나눠지면 false
		 */
		if (num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}

		return true;

	}

	public List<Integer> solution_1(int[] arr) {
		/*
		 * - 리스트사용
		 * - 배열의 첫번째 인덱스 값 int num으로 저장
		 * - int c(거꾸로 뒤집한 num값을 저장하는 곳)
		 */
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int c = 0;
			// num은 계속 10으로 나누다 보면 못나누게 되면 0이 되어버림
			while (num > 0) {

				// ex num = 123일 때 "t = 3", "t=2", "t=1"
				int t = num % 10;

				// c = 0 * 10 + 3 = "3", "3 * 10 + 2 = 32", "32*10+1 = 321"
				c = c * 10 + t;

				// num = 123/10 = "12", "1", "1/10 = 0"
				num = num / 10;
			}
			if (solution2(c)) {
				list.add(c);
			}
		}

		return list;
	}

	public int[] solution(int[] arr) {
		/*
		 * 로직설명
		 * - StringBuilder를 이용하여 받아온 arr배열값을 String으로 변환 후 역순 정렬함.
		 * - 이후 solution2 메서드를 이용해 소수 검사를 함
		 * - 소수일경우 answer배열의 인덱스 값은 0
		 */
		int answer[] = new int[arr.length];

		// System.out.println(Arrays.toString(arr));

		StringBuilder sb = new StringBuilder();
		String str_arr[] = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			str_arr[i] = sb.reverse().toString();
			sb.setLength(0);
		}

		// System.out.println(Arrays.toString(str_arr));

		for (int i = 0; i < str_arr.length; i++) {
			뒤집은소수 main = new 뒤집은소수();
			int num = Integer.parseInt(str_arr[i]);
			if (main.solution2(num)) {
				answer[i] = num;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		뒤집은소수 main = new 뒤집은소수();
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int arr[] = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		List<Integer> list = main.solution_1(arr);

		for (int x : list) {
			System.out.print(x + " ");
		}

	}

}
