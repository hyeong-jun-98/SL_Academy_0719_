import com.hojong.Jul22push.work.Work;

import java.util.Random;
import java.util.Scanner;

public class Test extends Random implements Work {  //
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);
    int num;
    public static void main(String[] args) {

    }

    @Override
    public void RandomNum() {
        int randomNum = rd.nextInt(10);
        System.out.println(randomNum);
    }

    @Override
    public void SetNum(int i) {
       num = i;
    }

    @Override
    public int GetNum() {
        return num;

    }
}
