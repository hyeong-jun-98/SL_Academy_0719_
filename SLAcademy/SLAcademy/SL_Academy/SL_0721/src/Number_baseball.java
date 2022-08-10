import java.util.Random;
import java.util.Scanner;

public class Number_baseball extends Random {


    static Random rd = new Random();
    static Scanner sc = new Scanner(System.in);
    // 내가 고른 숫자
    static String[] my = new String[3];
    // 컴이 고른 숫자
    static String[] com = new String[3];
    static int strike = 0;
    static int ball = 0;

    // 컴 픽
    public static void compick() {
        for (int i = 0; i < com.length; i++) {
            com[i] = (rd.nextInt(9) + "");
            for (int j = 0; j < i; j++) {
                if (com[i].equals(com[j])) {
                    i--;
                }
            }
        }

        System.out.print("컴 : ");
        for (int i = 0; i < com.length; i++) {
            System.out.print(com[i]);
        }
        System.out.println();
    }

    // 내 픽
    public static void myPick() {
        for (int i = 0; i < 3; i++) {
            System.out.print("숫자 입력 : ");
            my[i] = sc.nextLine();
        }
    }

    // 컴퓨터 픽 = {"2", "9", "6"};
    public static void judge() {

        for (int i = 0; i < 3; i++) {
            if (my[i].equals(com[i])) {
                strike++;
            } else {
                for (int j = 0; j < 3; j++) {
                    if (com[i].contains(my[j])) {
                        ball++;
                    }
                }

            }
        }
        System.out.print(strike + " 스트라이크 \t");
        System.out.println(ball + " 볼");
        System.out.println();



    }


    public static void main(String[] args) {

        Number_baseball.compick();
        while (true) {
            Number_baseball.myPick();
            Number_baseball.strike = 0;
            Number_baseball.ball = 0;
            Number_baseball.judge();
            if (Number_baseball.strike == 3) {
                break;
            }
        }

    }
}
