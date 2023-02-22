package String;
import java.util.*;

public class 회문문자열 {
	public String solution2(String text) {
		String result = "YES";
		
		text = text.toLowerCase();
		
		String text2 = text;
		StringBuilder sb = new StringBuilder(text2);
		text2 = sb.reverse().toString();
		
//		System.out.println(text2);
		
		if(!text.equals(text2)) {
			result = "NO";
		}
		
		
		return result;
	}

	public String solution(String text) {
		String result = "YES";
		
		text = text.toLowerCase();
		int len = text.length()-1;
		
		for(int i = 0; i < text.length()/2; i++) {
			System.out.println(i + "실행");
			if(text.charAt(i) != text.charAt(len - i)) {
				result = "NO";
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		회문문자열 main = new 회문문자열();
		Scanner sc = new Scanner(System.in);
		String result = main.solution(sc.nextLine());
		System.out.println(result);

	}


}
