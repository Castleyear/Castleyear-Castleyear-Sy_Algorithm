package Int;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 멘토링 {

	public int solution2(int n, int m, int[][] arr) {
		int answer = 0;

		List<List<Integer>> test_list = new ArrayList<>();

		// List 에 arr의 값을 옮겨 넣음
		for (int i = 0; i < m; i++) {
			List<Integer> s_list = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				s_list.add(arr[i][j]);
			}
			test_list.add(s_list);
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j)
					continue;
				int count = 0;

				for (int k = 0; k < m; k++) {
					int a = test_list.get(k).indexOf(i);
					int b = test_list.get(k).indexOf(j);
					if (a < b) {
						count++;
						// System.out.println("현재 테스트 위치:"+ (k+1) +" 멘토 : " + i + " 멘티 : " + j);
					}
				}

				if (count == m) {
					// System.out.println("멘토 : " + i + " 멘티 : " + j);
					answer++;
				}

			}
		}

		return answer;
	}

	/**
	 * 
	 * @param n   : 열, 학생수
	 * @param m   : 행 , 시험 테스트
	 * @param arr : 배열
	 * @return
	 */
	public int solution(int n, int m, int[][] arr) {
		int answer = 0;

		// 학생 1 ~ 4번까지의 모든 경우의수를 나타내는 2중 for문
		for (int i = 1; i <= 4; i++) { // i = 멘토
			for (int j = 1; j <= 4; j++) { // j = 멘티
				if (i == j) { // 멘티가 멘토가되는 경우의수를 줄임
					continue;
				}
				int count = 0;

				// 파라미터로 받아온 배열값을 실행시키는 2중 for문
				for (int k = 0; k < m; k++) {
					int a = 0; // a = i 번 멘토학생의 위치를 담을 변수
					int b = 0; // b = j 번 멘티학생의 위치를 담을 변수
					// 파라미터로 받아온 배열값을 싱행시키는 2중 for 문
					for (int s = 0; s < n; s++) {
						if (i == arr[k][s]) { // i 번 멘토학생과 arr배열안에 있는 학생의 값이 일치 할때
							a = s; // a = 위 조건이 만족할때 열의 번호를 반납함
						}
						if (j == arr[k][s]) { // j 번 멘티학생과 arr배열안에 있는 학생의 값이 일치 할때
							b = s; // b = 위 조건이 만족할때 열의 번호를 반납함
						}
					}
					if (a < b) { // a 가 b 보다 앞등수에 있을경우 카운팅(한 테스트=한 행)이 끝날때마다 조건을 걸어줌
						count++;
					}
				}
				if (count == m) { // 이 카운팅 값이 시험테스트 시행 값과 같다면 최종 답을 카운팅함
					System.out.println("멘토 : " + i + " 멘티 : " + j);
					answer++;
				}
			}
		} // 모든 테스트가 끝나면 다음 i번 j번 멘토 멘티 학생을 카운팅 하게됨

		return answer;
	}

	public static void main(String[] args) {
		멘토링 main = new 멘토링();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int arr[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// System.out.println(" ");
		// // 배열값이 잘 들어갔는지에 대해서 출력
		// for (int[] x : arr) {
		// for (int y : x) {
		// System.out.print(y + " ");
		// }
		// System.out.println();
		// }
		// n = 열 , m = 행
		int result = main.solution2(n, m, arr);

		System.out.println(result);

	}

}
