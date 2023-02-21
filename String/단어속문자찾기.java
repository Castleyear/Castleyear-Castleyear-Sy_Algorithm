package String;

import java.util.*;

public class 단어속문자찾기 {
	public String solution(String str) {
		String answer = "";
		// 제일 작은수와 변수를 할당하기 위한 변수선언
		int m = Integer.MIN_VALUE, pos;
		// while(으)로 str의 공백을 나누고 그값이 -1(값이 없으면)까지 실행
		while ((pos = str.indexOf(' ')) != -1) {
			// tmp 변수에 첫번째 즉 "it"까지의 단어를 저장함.subString(0, pos=(str의 첫번째 공백위치까지))
			String tmp = str.substring(0, pos);
			// len = tmp의 길이를 저장함
			// 이유 : 굳이 해줄필요는 없지만 str의 각 단어마다의 길이비교를 위해 저장함
			int len = tmp.length();
			if (len > m) {
				m = len;
				answer = tmp;
			}
			// str.substring(1) = str의 1번 인덱스 위치부터 끝까지 저장시킴
			str = str.substring(pos + 1);
		}
		if (str.length() > m) {
			answer = str;
		}
		return answer;
	}

	public static void main(String[] args) {
		단어속문자찾기 main = new 단어속문자찾기();

		String answer = "it is time to study";
		// String a = main.solution(answer);

		System.out.println(answer.substring(1));
	}
}
