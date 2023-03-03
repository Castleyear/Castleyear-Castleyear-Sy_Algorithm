package HashMap;

import java.util.*;

public class 학급회장 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        학급회장 s = new 학급회장();

        int count = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();

        System.out.println(s.solution(str, count));
    }

    public char solution(String str, int n) { //test
        char answer = ' ';

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        map.put('A', 0);
        map.put('B', 0);
        map.put('C', 0);
        map.put('D', 0);
        map.put('E', 0);


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A') {
                map.put('A', map.get('A') + 1);
            } else if (ch == 'B') {
                map.put('B', map.get('B') + 1);
            } else if (ch == 'C') {
                map.put('C', map.get('C') + 1);
            } else if (ch == 'D') {
                map.put('D', map.get('D') + 1);
            } else {
                map.put('E', map.get('E') + 1);
            }
        }

//        System.out.println(map);
        int num = 0;
        for (Character key : map.keySet()) {
            int value = map.get(key);
            if (value > num) {
                num = value;
                answer = key;
            }
        }
        return answer;
    }


}
