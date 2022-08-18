import java.util.Arrays;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        int [] arr = {3,4,6,7,10,16,17,20,22,23,26,30,36,41,42,43};
        int [] arr1 = new int[6];
        Random rd = new Random();
        int num;

        for(int i = 0; i < 6; i++) {
            num = rd.nextInt(17);
            arr1[i] = arr[num];

        }
        Arrays.sort(arr1);


        for(int i = 0; i < 6; i++) {
            System.out.print(arr1[i] + " ");

        }


    }



}
