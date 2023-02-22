package Int;

import java.util.*;

public class 연속된자연수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        연속된자연수 m = new 연속된자연수();

        List<List<Integer>> result = m.solution(sc.nextInt());
        System.out.println(result);

    }

    public List<List<Integer>> solution(int a) {
        List<List<Integer>> answer = new ArrayList<>();
        int count = 0;
        int lt = 1;
        int sum = 0;

        for (int rt = 1; rt < a; rt++) {
            List<Integer> list = new ArrayList<>();
            sum = sum + rt;
            if (sum == a) {
                count++;
                for (int j = lt; j <=rt; j++) {
                    list.add(j);
                }
                answer.add(list);
            }
            while (sum >= a) {
                sum = sum - lt;
                lt++;
                if (sum == a) {
                    count++;
                    for (int j = lt; j <=rt; j++) {
                        list.add(j);
                    }
                    answer.add(list);
                }
            }
        }
        System.out.println(count);
        return answer;
    }

}

