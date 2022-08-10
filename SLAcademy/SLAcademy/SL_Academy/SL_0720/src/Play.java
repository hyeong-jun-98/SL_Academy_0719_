import java.util.Random;
import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int count = 0;
        int num = rd.nextInt(100) + 1;
        //       int num = 43;
        int input;

        while (true) {
            System.out.print(" 숫자를 입력하세요 : ");
            input = sc.nextInt();
            count++;
            if (input < num) {
                System.out.println("숫자가 작습니다 좀 더 큰 숫자를 입력하세요");
            } else if (num == input) {
                System.out.println();
                System.out.println("** 정답!!  " + count + "번 만에 정답입니다. **");
                break;
            } else {
                System.out.println("숫자가 큽니다. 좀 더 작은 숫자를 입력하세요");
            }

        }

    }
}
