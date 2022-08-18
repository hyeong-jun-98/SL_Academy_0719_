import java.util.Scanner;

public class Gugudan {  //
    public static void main(String[] args) {
        // 단수 입력 구구단
//        Scanner sc = new Scanner(System.in);
//        System.out.print("숫자 입력 : ");
//        int num = sc.nextInt();
//
//        for(int i = 1; i < 10; i++) {
//            System.out.println(num + " X " + i + " = " + (num * i));
//        }

        // 옆으로 구구단
        // 두 자리 중 한 자리일 때 앞에 0를 하고싶을 떄 "%02d"를 해주면 된다.
        for(int i = 1; i < 10; i++) {
            for(int j = 2; j < 10; j++) {
                System.out.printf(j + " X " + i + " = " + "%02d" + "\t", (i * j));
            }
            System.out.println();
        }








    }
}
