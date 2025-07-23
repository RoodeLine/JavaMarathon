package Day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

    int[] numbers = new int[100];
    Random random = new Random();
    for (int i=0; i<numbers.length; i++) numbers[i] = random.nextInt(10000);

    int sumMax = 0, sum = 0, index = 0;
    for (int i = 0; i<numbers.length-2; i++) {
        sum = numbers[i] + numbers[i+1] + numbers[i+2];
        if (sum > sumMax) {
            sumMax = sum;
            index = i;
        }
    }
    System.out.println(sumMax);
    System.out.println(index);
    }
}
