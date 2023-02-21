package String;

import java.util.*;

public class reverse {

	public char[] solution(String text) {
		int ft = 0;
		int lt = text.length() - 1;

		char arr[] = text.toCharArray();

		while (ft < lt) {
			// 특수문자 일경우
			if (!(arr[ft] >= 'a' && arr[ft] <= 'z') && !(arr[ft] >= 'A' && arr[ft] <= 'Z')) {
				ft++;
			} else if (!(arr[lt] >= 'a' && arr[lt] <= 'z') && !(arr[lt] >= 'A' && arr[lt] <= 'Z')) {
				lt--;
			} else {
				char first = arr[ft];
				arr[ft] = arr[lt];
				arr[lt] = first;
				ft++;
				lt--;
			}
		}

		return arr;
	}

	public static void Main(String[] args) {
		reverse test = new reverse();
		Scanner sc = new Scanner(System.in);
		char arr[] = test.solution(sc.nextLine());

		for (char x : arr) {
			System.out.print(x);
		}

	}

}
