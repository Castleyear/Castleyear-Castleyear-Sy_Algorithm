package String;

import java.util.*;

public class 팰린드롬 {
    public String solution(String str) {
        String answer = "YES";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        // String a = new StringBuilder(str).reverse().toString();
        for (int i = 0; i < str.length() / 2; i++) {
            int len = str.length() - 1;

            if (str.charAt(i) != str.charAt(len - i)) {
                answer = "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        팰린드롬 main = new 팰린드롬();
        Scanner sc = new Scanner(System.in);

        String answer = sc.nextLine();
        // String a = main.solution(answer);

        // System.out.println(a);

        System.out.println(012);

    }

}
