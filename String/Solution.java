package String;

import java.util.*;

public class Solution {

	public String[] solution(String[] quiz) {
		String arr[];
		String answer[] = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			arr = quiz[i].split(" ");

			if (arr[1].equals("+")) {
				int a = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
				if (a == Integer.parseInt(arr[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			} else if (arr[1].equals("-")) {
				int a = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
				if (a == Integer.parseInt(arr[4])) {
					answer[i] = "O";
				} else {
					answer[i] = "X";
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Solution sl = new Solution();
		String a[] = { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" };
		String answer[] = sl.solution(a);
		System.out.println(Arrays.toString(answer));
	}
}
