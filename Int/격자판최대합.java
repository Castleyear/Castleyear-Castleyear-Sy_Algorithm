package Int;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 격자판최대합 {

	public int solution(int arr[][]) {
		int answer = 0;
		List<Integer> list = new ArrayList<>();

		// 대각선
		int x = 0;
		// 역 대각선
		int y = 0;
		// 열
		int colunm = 0;
		// 행
		int row = 0;

		// 전체 행 순환
		for (int i = 0; i < arr.length; i++) {
			int tmprow = 0;
			int tmpcolunm = 0;

			for (int j = 0; j < arr.length; j++) {
				tmprow += arr[i][j];
				tmpcolunm += arr[j][i];
			}

			// 대각선 순환
			for (int z = i; z <= i; z++) {
				x += arr[i][z];
			}

			// 역 대각선 순환
			for (int z = (arr.length - 1) - i; z >= (arr.length - 1) - i; z--) {
				y += arr[i][z];
			}

			if (row < tmprow) {
				row = tmprow;
			}

			colunm = Math.max(colunm, tmpcolunm);
		}

		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(row);
		// System.out.println(colunm);

		list.add(x);
		list.add(y);
		list.add(row);
		list.add(colunm);

		for (int i = 0; i < list.size(); i++) {
			answer = Math.max(answer, list.get(i));
		}

		return answer;
	}

	public static void main(String[] args) {
		격자판최대합 main = new 격자판최대합();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arr[][] = new int[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int result = main.solution(arr);
		System.out.print(result);

	}

}
