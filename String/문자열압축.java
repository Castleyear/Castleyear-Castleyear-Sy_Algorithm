package String;

import java.util.Scanner;

public class 문자열압축 {

	public String solution(String str) {
		String answer = "";
		str = str + " ";

		// str의 첫번째 문자
		char c = str.charAt(0);

		// 카운팅 int
		int p = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				p++;
			} else if (p > 1) {
				answer += str.charAt(i) + String.valueOf(p);
				p = 1;
			} else {
				answer += str.charAt(i);
			}
		}

		// answer = answer.replaceAll("1", "");

		return answer;
	}

	public static void main(String[] args) {
		문자열압축 main = new 문자열압축();
		Scanner sc = new Scanner(System.in);

		String result = main.solution(sc.nextLine());

		System.out.println(result);

	}

}
