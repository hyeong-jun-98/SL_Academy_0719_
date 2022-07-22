import java.util.Random;

public class Practice {
    public static void main(String[] args) {
        char[] arr = {'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ'};
        // 0,1,2,3,4
        Random rd = new Random();
        int num;
        int count = 0;

        while (true) {
            num = rd.nextInt(5);
            System.out.println(arr[num]);
            count++;
            // ㅁ이 나오면 종료
            if (num == 4) {
                System.out.println(count + "번");
                System.out.println("종료");
                break;
            }


        }


    }
}
