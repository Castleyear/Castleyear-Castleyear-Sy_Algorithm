package String;

import java.util.Scanner;

public class 중복단어제거 {

	public String solution(String text) {
		String result = "";
		// text = asdfasd
		// for i 값 : 0
		// 배열 값 : a(0)
		for (int i = 0; i < text.length(); i++) {
			if (text.indexOf(text.charAt(i)) == i) {
				result += text.charAt(i);
			}
			// System.out.println("for 현재 번호 :" + i + " 현재 문자 :" + text.charAt(i) + " 현재
			// indexOf번호:" + text.indexOf(text.charAt(i)));
		}

		return result;
	}

	public static void main(String[] args) {
		중복단어제거 main = new 중복단어제거();
		Scanner sc = new Scanner(System.in);
		String result = main.solution(sc.nextLine());
		System.out.println(result);

	}

}
