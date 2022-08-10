import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String [] arr = {"가위", "바위", "보"};

        // 사용자 선택
        System.out.print("사용자 선택 (1. 가위, 2. 바위, 3. 보)  : ");
        int me = sc.nextInt();
        System.out.println("사용자 : " + me + " -> " + arr[me-1]);

        // PC 선택
        int pc = rd.nextInt(3) + 1;
        System.out.println("컴퓨터 : " + pc + " -> " + arr[pc-1]);

        // 승부
//        if (pc == 3 && me == 1) {
//            System.out.println("사용자 승리");
//        } else if (pc == 1 && me == 3) {
//            System.out.println("컴퓨터 승리");
//        } else {
//            if (pc > me) {
//                System.out.println("컴퓨터 승리");
//            } else if (me == pc) {
//                System.out.println("비겼습니다");
//            } else {
//                System.out.println("사용자 승리");
//            }
//        }
        // 수학 공식으로

        if((pc - me == 1)  || (pc - me == -2)) {
            System.out.println("컴퓨터 승리");
        } else if (pc == me) {
            System.out.println("비겼습니다");
        } else {
            System.out.println("사용자 승리");
        }


//         PC가 뭘 냈는지 알아보는 방법 (조건문 이용)

//        if(pc == 1) {
//            System.out.println("가위");
//        } else if (pc == 2) {
//            System.out.println("바위");
//        } else {
//            System.out.println("보");
//        }
//        switch (pc) {
//            case 1:
//                System.out.println("가위");
//                break;
//            case 2:
//                System.out.println("바위");
//                break;
//            case 3:
//                System.out.println("보");
//                break;
//        }

    }
}
