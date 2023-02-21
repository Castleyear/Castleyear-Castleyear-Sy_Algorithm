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

    static class 공통원소구하기 {
        public List<Integer> solution(int arr1[], int arr2[]) {
            List<Integer> answer = new ArrayList<>();
            int i = 0;
            int j = 0;

            // 배열 오름차순 정렬
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // 1 2 3 4 5
            // 2 3 4 5 6

            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    j++;
                } else {
                    answer.add(arr1[i++]);
                    j++;
                }
            }

            return answer;
        }

        public static void main(String[] args) {
            String.회문문자열.공통원소구하기 main = new String.회문문자열.공통원소구하기();
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int arr1[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            int arr2[] = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            // System.out.println("arr1" + Arrays.toString(arr1));
            // System.out.println("arr2" + Arrays.toString(arr2));

            // n = 열 , m = 행
            List<Integer> result = main.solution(arr1, arr2);

            for (int x : result) {
                System.out.print(x + " ");
            }

        }
    }
}
