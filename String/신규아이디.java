package String;

import java.util.*;

public class 신규아이디 {

    public String solution(String new_id) {
        신규아이디 main = new 신규아이디();
        String str = new_id;
        str = main.level1(str);
        str = main.level2(str);
        str = main.level3(str);
        str = main.level4(str);
        str = main.level5(str);
        str = main.level6(str);
        str = main.level7(str);

        String answer = str;
        return answer;

    }

    // 모든 대문자를 소문자로 변경한다.
    public String level1(String text) {
        String str = text.toLowerCase();
        return str;
    }

    // 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
    public String level2(String text) {
        String str = "";
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) >= '0' && text.charAt(i) <= '9') || (text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
                    || text.charAt(i) == '-' || text.charAt(i) == '_' || text.charAt(i) == '.') {
                str += text.charAt(i);
            }
        }
        return str;
    }

    // new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
    public String level3(String text) {
        while (true) {
            if (!text.contains("..")) {
                break;
            }
            text = text.replace("..", ".");
        }
        return text;
    }

    // new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
    public String level4(String text) {
        String str = "";

        for (int i = 0; i < text.length(); i++) {
            if ((i == 0 && text.charAt(0) == '.')
                    || (i == text.length() - 1 && text.charAt(text.length() - 1) == '.')) {
                str += "";
            } else {
                str += text.charAt(i);
            }

        }
        return str;
    }

    // new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
    public String level5(String text) {
        String str = "";

        if (text.isEmpty()) {
            str = "a";
        } else {
            str = text;
        }

        return str;
    }

    // new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
    // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
    public String level6(String text) {
        String str = "";
        String str2 = "";
        char arr[] = text.toCharArray();
        boolean test = false;

        for (int i = 0; i < arr.length; i++) {
            if (i == 15) {
                break;
            }
            str += arr[i];
        }

        if (str.charAt(str.length() - 1) == '.') {
            test = true;
        }

        if (test) {
            for (int i = 0; i < str.length() - 1; i++) {
                str2 += str.charAt(i);
            }
        } else {
            str2 = str;
        }
        return str2;
    }

    // new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
    public String level7(String text) {
        String str = "";
        if (text.length() <= 2) {
            str = text;
            for (int i = text.length() - 1; i < 2; i++) {
                str += text.charAt(text.length() - 1);
            }
        } else {
            str = text;
        }
        return str;
    }

    public static void main(String[] args) {
        신규아이디 main = new 신규아이디();
        String a = main.solution("abcdefghijklmn.p");
        System.out.println(a);
    }
}
