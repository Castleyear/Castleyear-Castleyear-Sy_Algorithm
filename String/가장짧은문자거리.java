package String;

import java.util.Scanner;

public class 가장짧은문자거리 {
	
	public int[] solution(String str, char c) {
		int[] result = new int[str.length()];
		int p = 100000;
		
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i)!=c) {
				p++;
				result[i] = p;
			}else {
				p=0;
				result[i] = p;
			}
			
		}
		
		p = 10000;
		
		for(int i = str.length()-1; i >=0; i--) {
			if(str.charAt(i)!=c) {
				p++;
				result[i] = Math.min(result[i], p);
			}else {
				p=0;
				result[i] = p;
			}
			
		}

		return result;
	}

	public static void main(String[] args) {
		가장짧은문자거리 main = new 가장짧은문자거리();
		Scanner sc = new Scanner(System.in);
		
		String text1 = sc.next();
		char text2  = sc.next().charAt(0);

		int result[] = main.solution(text1, text2);
		
		for(int x : result) {
			System.out.print(x+" ");
		}
		
		
	}

}
