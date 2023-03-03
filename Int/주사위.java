package Int;

import java.util.*;


public class 주사위 {
    static int user[] = new int[2]; // 유저배열 생성

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 판 하시겠습니까?");
        int turn = sc.nextInt(); // 게임 판수

        int f_dice = 0; // 첫번째 주사위
        int s_dice = 0; // 특수 주사위

        for (int i = 0; i < turn; i++) {
            System.out.println(i + 1 + "번 째 게임");
            for (int j = 0; j < user.length; j++) {
                f_dice = r_dice();
                s_dice = 0;
                System.out.println("user" + (j + 1) + " " + (i + 1) + "번 째 게임 " + "첫 번째 주사위 값 :" + f_dice);

                user[j] += f_dice; // user 배열값에 첫번째 주사위 값 적립
                if (f_dice % 2 == 0) {
                    System.out.println("user" + (j + 1) + " " + (i + 1) + "번 째 게임 " + "첫 번째 주사위 값에서 짝수가 떳음");
                    s_dice = r_dice(); // 두번째 주사위 던짐
                    System.out.println("user" + (j + 1) + " " + (i + 1) + "번 째 게임 " + "특수 주사위 값 :" + s_dice);

                    if (s_dice == 4) {
                        System.out.println("특수 주사위에서 4가 떳음으로 해당 게임을 종료합니다.");
                        System.out.println(i + 1 + "번 째 게임종료");
                        break;
                    } else if (s_dice == 3) { // 주사위 3
                        System.out.println("특수 주사위에서 3점이 나왔음으로 user" + (j + 1) + "은 3점을 얻고 나머지는 -3점이 됩니다.");
                        user[j] += 3;
                        second_dice(j, s_dice); // 특수주사위 3번 옵션 메서드
                    } else if (s_dice == 5) {
                        System.out.println("특수 주사위에서 5점이 나왔음으로 user" + (j + 1) + "은 2점을 잃고 나머지는 +2점을 얻습니다.");
                        user[j] -= 2;
                        user_zero(); // 0점 보다 낮을경우 0점으로 초기화
                        for (int z = 0; z < user.length; z++) { // 2점 추가
                            if (z != j) {
                                user[z] += 2;
                            }
                        }
                        score(); // 점수조회
                    } else if (s_dice == 1) {
                        System.out.println("특수 주사위에서 1이 나왔음으로 모두 -2점씩 잃습니다.");
                        second_dice(j, s_dice);
                    } else {
                        System.out.println("특수 주사위에서 2 또는 6이 나왔음 으로 아무런 효과가 발동되지 않습니다.");
                    }
                }
                System.out.println(" ");
            }
            // 해당 라운드 점수 조회
            for (int j = 0; j < user.length; j++) {
                System.out.println((i + 1) + "번째 게임 user" + (j + 1) + "의 점수 :" + user[j]);
            }
            System.out.println(" ");
        }
        // 승자 조회
        String winner = "";
        if (user[0] > user[1]) {
            winner = "user1";
        } else {
            winner = "user2";
        }
        System.out.println(winner + " 승리");

        System.out.println(" ");

    }

    // 주사위 랜덤 값 뽑기
    public static int r_dice() {
        Random random = new Random();
        return random.nextInt(6) + 1; // 0 ~ 5까지인데 +1 만큼 해줌
    }

    // 사용자정의 주사위 랜던 값 뽑기
    public static int r_dice(int start, int end) {
        Random random = new Random();
        return random.nextInt(start * 1) + (end - start); // start ~ end 까지인데 +1 만큼 해줌
    }


    // 특수 주사위 3번 옵션 정하기
    public static void second_dice(int user_len, int dice) {
        if (dice == 3) {
            for (int z = 0; z < user.length; z++) { // 주사위 3 (3점 뻇어오는 로직)
                if (z != user_len) {
                    user[z] -= dice;
                    user_zero(); // 0점 보다 낮을경우 0점으로 초기화
                }
            }
        } else if (dice == 1) {
            for (int z = 0; z < user.length; z++) { // 주사위 1 (모두 -2)
                user[z] -= 2;
                user_zero(); // 0점 보다 낮을경우 0점으로 초기화
            }
        }

        score(); // 점수조회
    }

    // 점수 0 초기화
    public static void user_zero() {
        for (int i = 0; i < user.length; i++) {
            if (user[i] < 0) {
                user[i] = 0;
            }
        }
    }

    // 점수조회
    public static void score() {
        for (int z = 0; z < user.length; z++) {
            System.out.println("user" + (z + 1) + "의 점수 :" + user[z]);
        }
    }

}
